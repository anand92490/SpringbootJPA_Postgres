package io.javabrains.springbootquickstart.course_api.companyRepository;

import io.javabrains.springbootquickstart.course_api.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //In Spring Boot, a repository is used to manage data persistence and retrieval in a database.
public interface CompanyRepository extends JpaRepository<Company, Long> { // We extend to JpaRepository interface to get the functionality for database interaction such as save()
}
