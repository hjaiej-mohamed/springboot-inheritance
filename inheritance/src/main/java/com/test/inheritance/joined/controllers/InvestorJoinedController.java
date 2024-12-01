package com.test.inheritance.joined.controllers;

import com.test.inheritance.joined.entities.InvestorJoined;
import com.test.inheritance.joined.services.InvestorJoinedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investor-joined")
@RequiredArgsConstructor
public class InvestorJoinedController {
    private final InvestorJoinedService investorJoinedService;
    @PostMapping("/add")
    public InvestorJoined add(@RequestBody InvestorJoined investorJoined){
        return this.investorJoinedService.save(investorJoined);
    }

    @GetMapping("/get/{id}")
    public  InvestorJoined get(@PathVariable Long id){
        return this.investorJoinedService.get(id);
    }

    @PutMapping("/update/{id}")
    public InvestorJoined update(@RequestBody InvestorJoined investorJoined, @PathVariable Long id){
        return  this.investorJoinedService.update(investorJoined,id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.investorJoinedService.delete(id);
    }
}
