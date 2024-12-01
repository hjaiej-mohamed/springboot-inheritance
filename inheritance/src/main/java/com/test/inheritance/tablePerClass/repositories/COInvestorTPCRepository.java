package com.test.inheritance.tablePerClass.repositories;

import com.test.inheritance.tablePerClass.models.entities.CoInvestorTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface COInvestorTPCRepository extends JpaRepository<CoInvestorTPC,Long> {
}
