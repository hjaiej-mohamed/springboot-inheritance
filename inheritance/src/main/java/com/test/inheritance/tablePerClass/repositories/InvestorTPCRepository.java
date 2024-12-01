package com.test.inheritance.tablePerClass.repositories;


import com.test.inheritance.tablePerClass.models.entities.InvestorTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorTPCRepository extends JpaRepository<InvestorTPC,Long> {
}
