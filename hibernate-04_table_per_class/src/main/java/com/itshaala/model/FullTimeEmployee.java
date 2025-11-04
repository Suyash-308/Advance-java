package com.itshaala.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class FullTimeEmployee extends Employee{
    int salary;
}
