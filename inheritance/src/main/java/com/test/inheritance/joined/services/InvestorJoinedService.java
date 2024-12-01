package com.test.inheritance.joined.services;

import com.test.inheritance.joined.entities.InvestorJoined;
import com.test.inheritance.joined.repositories.InvestorJoinedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvestorJoinedService {
    private final InvestorJoinedRepository investorJoinedRepository;
    public InvestorJoined save(InvestorJoined investorJoined){
        return this.investorJoinedRepository.save(investorJoined);
    }

    public InvestorJoined update(InvestorJoined lPInvestorJoined,Long id){
        InvestorJoined investorJoined1 = this.investorJoinedRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+ id));
        investorJoined1.setName(lPInvestorJoined.getName());
        return  this.investorJoinedRepository.save(investorJoined1);
    }
    public InvestorJoined get(Long id){
        return this.investorJoinedRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+id));
    }

    public void delete(Long id){
        this.investorJoinedRepository.deleteById(id);
    }
}
