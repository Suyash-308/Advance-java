package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "address_tbl")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;

   @ManyToMany(cascade = CascadeType.ALL)
@JoinTable( name = "employee_address_tbl",
        joinColumns = @JoinColumn(name = "address_id"),
        inverseJoinColumns = @JoinColumn(name = "employee_id")
)
   private List<Employee> employees=new ArrayList<>();
}
