package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
  private int id;

    @Column(name = "name")
  private String name;

    @Column(name = "duration")
  private String duration;

    @Column(name = "price")
  private int price;

}
