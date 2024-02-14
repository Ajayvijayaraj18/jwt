package com.example.agriloan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agriloan_details")
public class agriloanmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "aadharNumber", nullable = false)
    private String aadharNumber;

    @Column(name = "bankStatement", nullable = false)
    private String bankStatement;

    @Column(name = "creditScore", nullable = false)
    private int creditScore;

    @Column(name = "agricultureSourceOfIncome", nullable = false)
    private String agricultureSourceOfIncome;

    @Column(name = "otherSourceOfIncome")
    private String otherSourceOfIncome;

    // Add getters and setters here

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getBankStatement() {
        return bankStatement;
    }

    public void setBankStatement(String bankStatement) {
        this.bankStatement = bankStatement;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getAgricultureSourceOfIncome() {
        return agricultureSourceOfIncome;
    }

    public void setAgricultureSourceOfIncome(String agricultureSourceOfIncome) {
        this.agricultureSourceOfIncome = agricultureSourceOfIncome;
    }

    public String getOtherSourceOfIncome() {
        return otherSourceOfIncome;
    }

    public void setOtherSourceOfIncome(String otherSourceOfIncome) {
        this.otherSourceOfIncome = otherSourceOfIncome;
    }
}
