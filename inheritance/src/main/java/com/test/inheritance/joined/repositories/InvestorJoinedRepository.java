package com.test.inheritance.joined.repositories;

import com.test.inheritance.joined.entities.InvestorJoined;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorJoinedRepository extends JpaRepository<InvestorJoined,Long> {
}
