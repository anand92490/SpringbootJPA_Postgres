package io.javabrains.springbootquickstart.course_api.companyRepository;

import io.javabrains.springbootquickstart.course_api.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //In Spring Boot, a repository is used to manage data persistence and retrieval in a database.
public interface CompanyRepository extends JpaRepository<Company, Long> { // We extend to JpaRepository interface to get the functionality for database interaction such as save()

    //@Query("")
    List<Company> findByName(String name); // when we don't have the predefined function on JPARepository we can define our own interface where the JPARepository will split the method Find + {name, email, address} and combine the method for our own usage
}
