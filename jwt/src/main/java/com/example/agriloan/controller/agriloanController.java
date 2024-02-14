// package com.example.agriloan.controller;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.agriloan.dto.jobdto;
// import com.example.agriloan.service.jobservice;

// @RestController
// public class jobcontroller {

//     private final jobservice jobService;

//     @Autowired
//     public jobcontroller(jobservice jobService) {
//         this.jobService = jobService;
//     }

//     @GetMapping
//     public ResponseEntity<List<jobdto>> getAllJobs() {
//         List<jobdto> jobs = jobService.getAllJobs();
//         return ResponseEntity.ok(jobs);
//     }

//     @GetMapping("/{id}")
//     public ResponseEntity<jobdto> getJobById(@PathVariable("id") Long jobId) {
//         Optional<jobdto> job = jobService.getJobById(jobId);
//         return job.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//     }

//     @PostMapping("/post")
//     public ResponseEntity<jobdto> createJob(@RequestBody jobdto jobDto) {
//         jobdto createdJob = jobService.createJob(jobDto);
//         return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
//     }

//     @PutMapping("/put/{id}")
//     public ResponseEntity<jobdto> updateJob(@PathVariable("id") Long jobId, @RequestBody jobdto updatedJobDto) {
//         jobdto updatedJob = jobService.updateJob(jobId, updatedJobDto);
//         return updatedJob != null ? ResponseEntity.ok(updatedJob) : ResponseEntity.notFound().build();
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> deleteJob(@PathVariable("id") Long jobId) {
//         jobService.deleteJob(jobId);
//         return ResponseEntity.noContent().build();
//     }
// }
package com.example.agriloan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.agriloan.dto.agriloandto;
import com.example.agriloan.service.agriloanservice;

@RestController
@RequestMapping("/agriloans") // Set a base path for the controller
public class agriloanController {

    private final agriloanservice agriloanService;

    @Autowired
    public agriloanController(agriloanservice agriloanService) {
        this.agriloanService = agriloanService;
    }

    @GetMapping
    public ResponseEntity<List<agriloandto>> getAllAgriloans() {
        List<agriloandto> agriloans = agriloanService.getAllAgriloans();
        return ResponseEntity.ok(agriloans);
    }

    @GetMapping("/{id}")
    public ResponseEntity<agriloandto> getAgriloanById(@PathVariable("id") Long agriloanId) {
        Optional<agriloandto> agriloan = agriloanService.getAgriloanById(agriloanId);
        return agriloan.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<agriloandto> createAgriloan(@RequestBody agriloandto agriloanDto) {
        agriloandto createdAgriloan = agriloanService.createAgriloan(agriloanDto);
        return new ResponseEntity<>(createdAgriloan, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<agriloandto> updateAgriloan(@PathVariable("id") Long agriloanId, @RequestBody agriloandto updatedAgriloanDto) {
        agriloandto updatedAgriloan = agriloanService.updateAgriloan(agriloanId, updatedAgriloanDto);
        return updatedAgriloan != null ? ResponseEntity.ok(updatedAgriloan) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgriloan(@PathVariable("id") Long agriloanId) {
        agriloanService.deleteAgriloan(agriloanId);
        return ResponseEntity.noContent().build();
    }
}
