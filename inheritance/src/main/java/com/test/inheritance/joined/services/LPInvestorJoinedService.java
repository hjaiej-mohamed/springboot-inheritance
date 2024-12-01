package com.test.inheritance.joined.services;

import com.test.inheritance.joined.entities.LPInvestorJoined;
import com.test.inheritance.joined.repositories.LPInvestorJoinedRepository;
import com.test.inheritance.tablePerClass.models.entities.InvestorTPC;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LPInvestorJoinedService {
    private final LPInvestorJoinedRepository lpInvestorJoinedRepository;

    public LPInvestorJoined save(LPInvestorJoined lPInvestorJoined){
        return this.lpInvestorJoinedRepository.save(lPInvestorJoined);
    }

    public LPInvestorJoined update(LPInvestorJoined lPInvestorJoined,Long id){
        LPInvestorJoined lPInvestorJoined1 = this.lpInvestorJoinedRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+ id));
        lPInvestorJoined1.setName(lPInvestorJoined.getName());
        return  this.lpInvestorJoinedRepository.save(lPInvestorJoined1);
    }
    public LPInvestorJoined get(Long id){
        return this.lpInvestorJoinedRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+id));
    }

    public void delete(Long id){
        this.lpInvestorJoinedRepository.deleteById(id);
    }
}
