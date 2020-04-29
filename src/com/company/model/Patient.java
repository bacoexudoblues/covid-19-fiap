package com.company.model;

import com.company.symptoms.SymptomEnum;

public class Patient {

    private String name;

    private String cpf;

    private String dateInput;

    private int age;

    private Address address;

    private Contact contact;

    private SymptomEnum[] symptoms;


    public Patient(SymptomEnum[] symptoms) {
        this.symptoms = symptoms;
    }

    public Patient() {

    }

    public SymptomEnum[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(SymptomEnum[] symptoms) {
        this.symptoms = symptoms;
    }


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
