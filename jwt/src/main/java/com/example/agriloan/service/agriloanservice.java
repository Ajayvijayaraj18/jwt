package com.example.agriloan.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agriloan.dto.agriloandto;
import com.example.agriloan.mapper.agriloanmapper;
import com.example.agriloan.model.agriloanmodel;
import com.example.agriloan.repository.agriloanrepo;

@Service
public class agriloanservice {

    private final agriloanrepo agriloanRepo;

    @Autowired
    public agriloanservice(agriloanrepo agriloanRepo) {
        this.agriloanRepo = agriloanRepo;
    }

    public List<agriloandto> getAllAgriloans() {
        List<agriloanmodel> agriloans = agriloanRepo.findAll();
        return agriloans.stream().map(agriloanmapper::mapToAgriloanDto).collect(Collectors.toList());
    }

    public Optional<agriloandto> getAgriloanById(Long agriloanId) {
        Optional<agriloanmodel> agriloan = agriloanRepo.findById(agriloanId);
        return agriloan.map(agriloanmapper::mapToAgriloanDto);
    }

    public agriloandto createAgriloan(agriloandto agriloanDto) {
        agriloanmodel agriloanModel = agriloanmapper.mapToAgriloanModel(agriloanDto);
        agriloanModel = agriloanRepo.save(agriloanModel);
        return agriloanmapper.mapToAgriloanDto(agriloanModel);
    }

    public agriloandto updateAgriloan(Long agriloanId, agriloandto updatedAgriloanDto) {
        Optional<agriloanmodel> existingAgriloanOptional = agriloanRepo.findById(agriloanId);

        if (existingAgriloanOptional.isPresent()) {
            agriloanmodel existingAgriloan = existingAgriloanOptional.get();

            // Map updatedAgriloanDto to existingAgriloan, updating only the fields that should be updated
            agriloanmapper.updateAgriloanModel(existingAgriloan, updatedAgriloanDto);

            existingAgriloan = agriloanRepo.save(existingAgriloan);
            return agriloanmapper.mapToAgriloanDto(existingAgriloan);
        }

        return null;
    }

    public void deleteAgriloan(Long agriloanId) {
        agriloanRepo.deleteById(agriloanId);
    }
}
