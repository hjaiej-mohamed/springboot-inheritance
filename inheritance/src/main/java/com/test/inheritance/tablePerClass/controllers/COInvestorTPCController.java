package com.test.inheritance.tablePerClass.controllers;

import com.test.inheritance.tablePerClass.models.entities.CoInvestorTPC;
import com.test.inheritance.tablePerClass.services.COInvestorTPCService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/co-investor-tpc")
@AllArgsConstructor
public class COInvestorTPCController {
    private final COInvestorTPCService coInvestorTPCService;

    @PostMapping("/add")
    public CoInvestorTPC add(@RequestBody CoInvestorTPC investorTPC){
        return this.coInvestorTPCService.save(investorTPC);
    }

    @GetMapping("/get/{id}")
    public  CoInvestorTPC get(@PathVariable Long id){
        return this.coInvestorTPCService.get(id);
    }

    @PutMapping("/update/{id}")
    public CoInvestorTPC update(@RequestBody CoInvestorTPC investorTPC,@PathVariable Long id){
        return  this.coInvestorTPCService.update(investorTPC,id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.coInvestorTPCService.delete(id);
    }
}
