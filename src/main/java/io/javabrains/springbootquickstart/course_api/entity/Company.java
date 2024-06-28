package io.javabrains.springbootquickstart.course_api.entity;

import jakarta.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Handles the primary key constrains
    private int id;
    private String name;
    private String email;
    @Column(name = "address") // all the entity column name must match as represented in the database or we could use this
    private String companyAddress;



}
