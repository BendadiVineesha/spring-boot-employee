package com.employee.spring_boot_employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.spring_boot_employee.domain.PrimaryAddress;

@Repository
public interface PrimaryAddressRepository extends JpaRepository<PrimaryAddress ,Long> {

}
