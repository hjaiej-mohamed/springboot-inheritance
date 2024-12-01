package com.test.inheritance.singleTable.controllers;

import com.test.inheritance.singleTable.models.entities.CoInvestor;
import com.test.inheritance.singleTable.models.entities.Investor;
import com.test.inheritance.singleTable.services.STCoInvestorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/st/co")
@RequiredArgsConstructor
public class CoInvestorController {
    private final STCoInvestorService stCoInvestorService;

    @PostMapping("/add")
    public Investor saveInvestor(@RequestBody CoInvestor investor){
        return  this.stCoInvestorService.saveCoInvestor(investor);
    }
    @PutMapping("/update/{id}")
    public Investor updateInvestor(@PathVariable Long id,@RequestBody CoInvestor investor){
        return  this.stCoInvestorService.updateCoInvestor(investor,id);
    }
    @GetMapping("/get/{id}")
    public Investor getInvestor(@PathVariable("id")Long id){
        return this.stCoInvestorService.getCoInvestor(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteInvestor(@PathVariable("id") Long id){
        this.stCoInvestorService.deleteCoInvestor(id);
    }
}
