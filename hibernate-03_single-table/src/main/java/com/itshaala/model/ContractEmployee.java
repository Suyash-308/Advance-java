package com.itshaala.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@DiscriminatorValue("cte")
public class ContractEmployee extends Employee {
    private int invoiceAmount;
}
