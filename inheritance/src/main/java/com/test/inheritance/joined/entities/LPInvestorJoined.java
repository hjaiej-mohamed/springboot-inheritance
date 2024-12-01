package com.test.inheritance.joined.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@DiscriminatorValue("LP")
@Data
@PrimaryKeyJoinColumn(name="id")
public class LPInvestorJoined extends InvestorJoined{
    private String lpType;
}
