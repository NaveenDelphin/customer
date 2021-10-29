package com.sfdatabase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfdatabase.demo.model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails,Long> {

}
