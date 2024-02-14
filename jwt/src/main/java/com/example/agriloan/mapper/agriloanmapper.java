package com.example.agriloan.mapper;

import com.example.agriloan.dto.agriloandto;
import com.example.agriloan.model.agriloanmodel;

public class agriloanmapper {

    public static agriloandto mapToAgriloanDto(agriloanmodel agriloan) {
        agriloandto dto = new agriloandto();
        dto.setName(agriloan.getName());
        dto.setDob(agriloan.getDob());
        dto.setEmail(agriloan.getEmail());
        dto.setPhoneNumber(agriloan.getPhoneNumber());
        dto.setAge(agriloan.getAge());
        dto.setAadharNumber(agriloan.getAadharNumber());
        dto.setBankStatement(agriloan.getBankStatement());
        dto.setCreditScore(agriloan.getCreditScore());
        dto.setAgricultureSourceOfIncome(agriloan.getAgricultureSourceOfIncome());
        dto.setOtherSourceOfIncome(agriloan.getOtherSourceOfIncome());
        // Map other properties as needed
        return dto;
    }

    public static agriloanmodel mapToAgriloanModel(agriloandto agriloanDto) {
        agriloanmodel model = new agriloanmodel();
        model.setName(agriloanDto.getName());
        model.setDob(agriloanDto.getDob());
        model.setEmail(agriloanDto.getEmail());
        model.setPhoneNumber(agriloanDto.getPhoneNumber());
        model.setAge(agriloanDto.getAge());
        model.setAadharNumber(agriloanDto.getAadharNumber());
        model.setBankStatement(agriloanDto.getBankStatement());
        model.setCreditScore(agriloanDto.getCreditScore());
        model.setAgricultureSourceOfIncome(agriloanDto.getAgricultureSourceOfIncome());
        model.setOtherSourceOfIncome(agriloanDto.getOtherSourceOfIncome());
        // Map other properties as needed
        return model;
    }

    public static void updateAgriloanModel(agriloanmodel existingAgriloan, agriloandto updatedAgriloanDto) {
        // Update only the fields that should be updated
        existingAgriloan.setName(updatedAgriloanDto.getName());
        existingAgriloan.setDob(updatedAgriloanDto.getDob());
        existingAgriloan.setEmail(updatedAgriloanDto.getEmail());
        existingAgriloan.setPhoneNumber(updatedAgriloanDto.getPhoneNumber());
        existingAgriloan.setAge(updatedAgriloanDto.getAge());
        existingAgriloan.setAadharNumber(updatedAgriloanDto.getAadharNumber());
        existingAgriloan.setBankStatement(updatedAgriloanDto.getBankStatement());
        existingAgriloan.setCreditScore(updatedAgriloanDto.getCreditScore());
        existingAgriloan.setAgricultureSourceOfIncome(updatedAgriloanDto.getAgricultureSourceOfIncome());
        existingAgriloan.setOtherSourceOfIncome(updatedAgriloanDto.getOtherSourceOfIncome());
        // Update other properties as needed
    }
}
