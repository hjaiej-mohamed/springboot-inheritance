package com.test.inheritance.joined.controllers;

import com.test.inheritance.joined.entities.LPInvestorJoined;
import com.test.inheritance.joined.services.LPInvestorJoinedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lp-investor-joined")
@RequiredArgsConstructor
public class LPInvestorJoinedController {
    private final LPInvestorJoinedService lpInvestorJoinedService;

    @PostMapping("/add")
    public LPInvestorJoined add(@RequestBody LPInvestorJoined lPInvestorJoined){
        return this.lpInvestorJoinedService.save(lPInvestorJoined);
    }

    @GetMapping("/get/{id}")
    public  LPInvestorJoined get(@PathVariable Long id){
        return this.lpInvestorJoinedService.get(id);
    }

    @PutMapping("/update/{id}")
    public LPInvestorJoined update(@RequestBody LPInvestorJoined lPInvestorJoined, @PathVariable Long id){
        return  this.lpInvestorJoinedService.update(lPInvestorJoined,id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.lpInvestorJoinedService.delete(id);
    }
}
