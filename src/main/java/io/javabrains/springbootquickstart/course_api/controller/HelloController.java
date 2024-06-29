package io.javabrains.springbootquickstart.course_api.controller;

import io.javabrains.springbootquickstart.course_api.companyRepository.CompanyRepository;
import io.javabrains.springbootquickstart.course_api.entity.Company;
import io.javabrains.springbootquickstart.course_api.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation makes this class as controller
public class HelloController {


//    @Autowired // This annotation helps us to create an object for the CompanyService class,
//    // thus we can access the methods without the need for creating an object. It id also referred as dependency injection
//    CompanyService companyService;


    @GetMapping("/hi") //GetMapping spring annotation helps us to get request
    public String getMessage(){
        return "<h1>HELLO SPRINGBOOT<h1>";
    }

//    @PostMapping("/company")
//    public String createCompanyData(@RequestBody Company company ){ //reads the data using the RequestBody annotation
//        //return companyService.save(company);
//        companyService.createCompany(company);
//        return "Created Company Data";
//    }


}
