package com.test.inheritance.singleTable.repositories;

import com.test.inheritance.singleTable.models.entities.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STInvestorRepository extends JpaRepository<Investor,Long> {
}
