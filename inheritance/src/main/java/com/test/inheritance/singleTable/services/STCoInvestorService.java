package com.test.inheritance.singleTable.services;

import com.test.inheritance.singleTable.models.entities.CoInvestor;
import com.test.inheritance.singleTable.repositories.STCoInvestorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class STCoInvestorService {
    private final STCoInvestorRepository stCoInvestorRepository;

    public CoInvestor saveCoInvestor(CoInvestor coInvestor){
        return  this.stCoInvestorRepository.save(coInvestor);
    }
    public CoInvestor updateCoInvestor(CoInvestor coInvestor,Long id){
        CoInvestor coInvestor1 = this.stCoInvestorRepository.findById(id).orElseThrow(()->new RuntimeException("co-investor not found with id:"+id));
        coInvestor1.setName(coInvestor.getName());
        coInvestor1.setCoInvestorType(coInvestor1.getCoInvestorType());
        return this.stCoInvestorRepository.save(coInvestor1);
    }

    public CoInvestor getCoInvestor(Long id){
        return this.stCoInvestorRepository.findById(id).orElseThrow(()->new RuntimeException("co-investor not dound with id:"+id));
    }

    public void deleteCoInvestor(Long id){
        this.stCoInvestorRepository.deleteById(id);
    }

}
