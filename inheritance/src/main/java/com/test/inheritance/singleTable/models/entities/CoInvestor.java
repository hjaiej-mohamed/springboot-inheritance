package com.test.inheritance.singleTable.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("CO_INVESTOR")
@Data
@EqualsAndHashCode(callSuper=true)
public class CoInvestor  extends Investor{
    @Column(name="co_investor_type")
    private String coInvestorType;
}
