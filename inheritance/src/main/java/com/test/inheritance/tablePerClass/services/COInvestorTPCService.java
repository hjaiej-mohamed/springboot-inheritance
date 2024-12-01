package com.test.inheritance.tablePerClass.services;

import com.test.inheritance.tablePerClass.models.entities.CoInvestorTPC;
import com.test.inheritance.tablePerClass.repositories.COInvestorTPCRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class COInvestorTPCService {
    private final COInvestorTPCRepository  coInvestorTPCRepository;
    public CoInvestorTPC save(CoInvestorTPC investorTPC){
        return this.coInvestorTPCRepository.save(investorTPC);
    }

    public CoInvestorTPC update(CoInvestorTPC investorTPC, Long id){
        CoInvestorTPC investorTPC1 = this.coInvestorTPCRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+ id));
        investorTPC1.setName(investorTPC.getName());
        investorTPC1.setCoInvestorType(investorTPC.getCoInvestorType());
        return  this.coInvestorTPCRepository.save(investorTPC1);
    }
    public CoInvestorTPC get(Long id){
        return this.coInvestorTPCRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+id));
    }

    public void delete(Long id){
        this.coInvestorTPCRepository.deleteById(id);
    }
}
