package com.test.inheritance.singleTable.services;

import com.test.inheritance.singleTable.models.entities.Investor;
import com.test.inheritance.singleTable.repositories.STInvestorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class STInvestorService {
    private  final STInvestorRepository stInvestorRepository;

    public Investor saveInvestor(Investor investor){
        return  stInvestorRepository.save(investor);
    }

    public Investor updateInvestor(Investor investor, Long id) {
        Investor retreivedInvestor = stInvestorRepository.findById(id).orElseThrow(()->new RuntimeException("investor notfound with id:"+id));
        retreivedInvestor.setName(investor.getName());
        return stInvestorRepository.save(retreivedInvestor);
    }

    public Investor getInvestorById(Long id) {
        return this.stInvestorRepository.findById(id).orElseThrow(()->new RuntimeException("investor not found with id:"+id));
    }

    public void deleteById(Long id) {
        this.stInvestorRepository.deleteById(id);
    }
}
