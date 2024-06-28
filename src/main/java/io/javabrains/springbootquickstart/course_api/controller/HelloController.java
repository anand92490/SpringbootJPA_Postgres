package io.javabrains.springbootquickstart.course_api.controller;

import io.javabrains.springbootquickstart.course_api.controller.entity.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String getMessage(){
        return "<h1>HELLO SPRINGBOOT<h1>";
    }

    @PostMapping("/company")
    public String createCompanyData(@RequestBody Company company ){ //reads the data using the Request Body annotation
        return company.toString();
    }
}
