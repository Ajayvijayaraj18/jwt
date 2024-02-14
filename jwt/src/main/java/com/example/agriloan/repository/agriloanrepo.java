package com.example.agriloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.agriloan.model.agriloanmodel;

@Repository
public interface agriloanrepo extends JpaRepository<agriloanmodel, Long> {
    // You can add custom query methods if needed
}
