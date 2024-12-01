package com.test.inheritance.tablePerClass.models.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class LPInvestorTPC extends InvestorTPC {
    private String lpType;
}
