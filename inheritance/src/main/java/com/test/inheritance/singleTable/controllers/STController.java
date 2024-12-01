package com.test.inheritance.singleTable.controllers;

import com.test.inheritance.singleTable.models.entities.Investor;
import com.test.inheritance.singleTable.services.STInvestorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/st")
@RequiredArgsConstructor
public class STController {
    private final STInvestorService stInvestorService;

    @PostMapping("/add")
    public Investor saveInvestor(@RequestBody Investor investor){
        return  this.stInvestorService.saveInvestor(investor);
    }
    @PutMapping("/update/{id}")
    public Investor updateInvestor(@PathVariable Long id,@RequestBody Investor investor){
        return  this.stInvestorService.updateInvestor(investor,id);
    }
    @GetMapping("/get/{id}")
    public Investor getInvestor(@PathVariable("id")Long id){
        return this.stInvestorService.getInvestorById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteInvestor(@PathVariable("id") Long id){
        this.stInvestorService.deleteById(id);
    }
}
