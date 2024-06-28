package io.javabrains.springbootquickstart.course_api.controller.entity;

import jakarta.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;
    @Column(name = "address")
    private String companyAddress;



}
