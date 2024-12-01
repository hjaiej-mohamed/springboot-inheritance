package com.test.inheritance.tablePerClass.services;

import com.test.inheritance.tablePerClass.models.entities.InvestorTPC;
import com.test.inheritance.tablePerClass.repositories.InvestorTPCRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvestorTPCService {
    private final InvestorTPCRepository investorTPCRepository;

    public InvestorTPC save(InvestorTPC investorTPC){
        return this.investorTPCRepository.save(investorTPC);
    }

    public InvestorTPC update(InvestorTPC investorTPC,Long id){
        InvestorTPC investorTPC1 = this.investorTPCRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+ id));
        investorTPC1.setName(investorTPC.getName());
        return  this.investorTPCRepository.save(investorTPC1);
    }
    public InvestorTPC get(Long id){
        return this.investorTPCRepository.findById(id).orElseThrow(()->new RuntimeException("not found with id"+id));
    }

    public void delete(Long id){
        this.investorTPCRepository.deleteById(id);
    }
}
