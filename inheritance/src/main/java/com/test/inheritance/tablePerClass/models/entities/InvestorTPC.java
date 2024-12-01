package com.test.inheritance.tablePerClass.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Data
public class InvestorTPC {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
}
