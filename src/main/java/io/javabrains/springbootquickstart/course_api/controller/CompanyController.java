package io.javabrains.springbootquickstart.course_api.controller;

import io.javabrains.springbootquickstart.course_api.companyRepository.CompanyRepository;
import io.javabrains.springbootquickstart.course_api.entity.Company;
import io.javabrains.springbootquickstart.course_api.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// In the companyController class we will create business logic with the get,post,update,delete url API endpoints

@RestController

@RequestMapping("/company")
public class CompanyController {

    @Autowired // creating object with Autowired annotation
    CompanyService service;
    @Autowired
    private CompanyRepository companyRepository;

    //post endpoint API for single data
    @PostMapping("/create")
    public String createCompany(@RequestBody Company company) {
        service.createCompany(company);
        return "Created successfully";
    }
    //post endpoint API for multiple data
    @PostMapping("createAll")
    public String createAllCompany(@RequestBody List<Company> companies) {
        service.createMultipleCompany(companies);
        return "Created multiple data successfully";

//        for(int i = 0; i < companies.size(); i++) {
//            Company c = companies.get(i);
//            String address = c.getCompanyAddress();
//            address = address + " Zip Code: 60019";
//            companyRepository.save(c);
//        }
//       return "Created multiple data successfully";
    }

    //get endpoint API to fetch the data from the database
    @GetMapping("/getCompanies")
    public List<Company> getCompanies(){
       return service.getCompanies();
    }

    @GetMapping("/getCompanies/{id}")
    public Company getCompanies(@PathVariable Long id){ //using the pathVariable annotation we can get the id parameter just like RequestBody
        return service.getCompanies(id);
    }

    @PutMapping("/updateCompany/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company company) {
        return service.updateCompany(id, company);
    }

}





