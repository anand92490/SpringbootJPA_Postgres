package io.javabrains.springbootquickstart.course_api.entity;

import jakarta.persistence.*;

import java.util.List;
//import lombok.Data;

@Entity
//@Data // This annotation will help with getter and setters without the need to create them
public class  Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Handles the primary key constrains
    private Long id;
    private String name;
    private String email;

   /* @Column(name = "address") // all the entity column name must match as represented in the database or we could use this
    private String companyAddress;*/

   /* @OneToOne  // one to one relationship annotation
    @JoinColumn(name = "address_id" ,referencedColumnName = "id") // joinColumn annotation helps us join company and address table to create one to one relationship
    private Address address; */

    @OneToMany(mappedBy = "company",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY) // if we remove data from one table than the data from the other table should be removed too
    private List<Address> address;

    //getter and setter
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getCompanyAddress() {
//        return companyAddress;
//    }
//
//    public void setCompanyAddress(String companyAddress) {
//        this.companyAddress = companyAddress;
//    }


 /*  public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
