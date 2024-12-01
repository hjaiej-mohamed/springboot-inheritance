package com.test.inheritance.joined.repositories;

import com.test.inheritance.joined.entities.LPInvestorJoined;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LPInvestorJoinedRepository extends JpaRepository<LPInvestorJoined,Long> {
}
