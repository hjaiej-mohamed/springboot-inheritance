package com.test.inheritance.tablePerClass.controllers;

import com.test.inheritance.tablePerClass.models.entities.InvestorTPC;
import com.test.inheritance.tablePerClass.services.InvestorTPCService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investortpc")
@RequiredArgsConstructor
public class InvestorTPCController {
    private final InvestorTPCService investorTPCService;

    @PostMapping("/add")
    public InvestorTPC add(@RequestBody  InvestorTPC investorTPC){
        return this.investorTPCService.save(investorTPC);
    }

    @GetMapping("/get/{id}")
    public  InvestorTPC get(@PathVariable Long id){
        return this.investorTPCService.get(id);
    }

    @PutMapping("/update/{id}")
    public InvestorTPC update(@RequestBody InvestorTPC investorTPC,@PathVariable Long id){
        return  this.investorTPCService.update(investorTPC,id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.investorTPCService.delete(id);
    }
}
