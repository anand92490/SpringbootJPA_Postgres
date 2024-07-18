package io.javabrains.springbootquickstart.course_api.service;

import io.javabrains.springbootquickstart.course_api.companyRepository.AddressRepository;
import io.javabrains.springbootquickstart.course_api.companyRepository.CompanyRepository;
import io.javabrains.springbootquickstart.course_api.entity.Address;
import io.javabrains.springbootquickstart.course_api.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

//Service layer will have the business logic

@Service //this annotation makes it as a service class, it contains the business logic
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository; // dependency injection helps us create object in spring eg. CompanyRepository repo = new CompanyRepository();

    @Autowired
    AddressRepository addressRepository;

  public String createCompany(Company company) {


      //these codes are for the console logs
//        Long l = 1L;
//        Optional<Company> c = companyRepository.findById(l);
//        System.out.println(c.get().getCompanyAddress());
//        System.out.println(c.get().getEmail());
//        System.out.println(c.get().getName());

        Address address = company.getAddress();
        addressRepository.save(address);
        companyRepository.save(company);
        return "saved successfully";
    }


    public List<Company> getCompanies() {
        return companyRepository.findAll(); //findAll() method is from jpaRepository interface
    }

    public Company getCompanies(Long id) {
        return companyRepository.findById(id).get(); //findAll() method is from jpaRepository interface
    }

    public String createMultipleCompany(@RequestBody List<Company> companies) {
      companyRepository.saveAll(companies);
      return "created multiple data successfully";
    }

    public Company updateCompany(Long id, Company company) {
      Company existingRecord = companyRepository.findById(id).get();
      existingRecord.setAddress(company.getAddress());
      existingRecord.setEmail(company.getEmail());
      existingRecord.setName(company.getName());
      companyRepository.save(existingRecord);
      return existingRecord;
    }

    public Company updateCompanyByName(String name, Company company) {
        List<Company> existingRecord = companyRepository.findByName(name);

        // use forLoop to iterate
//        existingRecord.setCompanyAddress(company.getCompanyAddress());
//        existingRecord.setEmail(company.getEmail());
//        existingRecord.setName(company.getName());
//        companyRepository.save(existingRecord);
//        return existingRecord;
        return null;
    }

    public Company deleteCompany(Long id, Company company) {
        Company existingRecord = companyRepository.findById(id).get();
        companyRepository.delete(existingRecord);
        return existingRecord;

    }





    public List<Company> getCompaniesByName(String name) {
      return companyRepository.findByName(name);
    }
}
