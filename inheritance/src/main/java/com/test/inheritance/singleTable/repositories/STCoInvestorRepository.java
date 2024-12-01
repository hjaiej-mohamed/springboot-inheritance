package com.test.inheritance.singleTable.repositories;


import com.test.inheritance.singleTable.models.entities.CoInvestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STCoInvestorRepository  extends JpaRepository<CoInvestor,Long> {
}
