package io.javabrains.springbootquickstart.course_api.controller;

import io.javabrains.springbootquickstart.course_api.entity.Company;
import io.javabrains.springbootquickstart.course_api.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService service;

    //post endpoint API
    @PostMapping("/create")
    public String createCompany(@RequestBody Company company) {
        service.createCompany(company);
        return "Created successfully";
    }

    //get endpoint API
    @GetMapping("/getCompanies")
    public List<Company> getCompanies(){
       return service.getCompanies();
    }
}





