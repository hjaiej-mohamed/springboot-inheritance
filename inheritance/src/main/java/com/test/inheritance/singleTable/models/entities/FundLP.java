package com.test.inheritance.singleTable.models.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("LP")
@Data
@EqualsAndHashCode(callSuper = true)
public class FundLP  extends Investor{
    private String lpType;
}
