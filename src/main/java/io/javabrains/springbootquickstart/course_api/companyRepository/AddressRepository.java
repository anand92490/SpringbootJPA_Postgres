package io.javabrains.springbootquickstart.course_api.companyRepository;

import io.javabrains.springbootquickstart.course_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
