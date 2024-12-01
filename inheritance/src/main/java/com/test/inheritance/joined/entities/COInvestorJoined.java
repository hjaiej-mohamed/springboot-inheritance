package com.test.inheritance.joined.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("LP")
@PrimaryKeyJoinColumn(name="id")
@EqualsAndHashCode(callSuper = true)
@Data
public class COInvestorJoined extends  InvestorJoined{
    private String coInvestorType;
}
