package io.javabrains.springbootquickstart.course_api.service;

import io.javabrains.springbootquickstart.course_api.companyRepository.CompanyRepository;
import io.javabrains.springbootquickstart.course_api.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //this annotation makes it as a service class, it contains the business logic
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository; // dependency injection helps us create object in spring eg. CompanyRepository repo = new CompanyRepository();

    public String createCompany(Company company) {
     companyRepository.save(company);
        return null;
    }

}
