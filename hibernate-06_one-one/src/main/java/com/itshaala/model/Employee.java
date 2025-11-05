package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "employee_tbl")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
 private int id;

    @Column(name = "name")
 private String name;

    @Column(name = "salary")
    private int salary;

@OneToOne
@JoinColumn(name = "addess_id")
 private Address address;
}
