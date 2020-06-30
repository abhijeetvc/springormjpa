package com.jpa.springormjpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;
      @Column(name="first_name")
      private String firstName;
      private String lastName;
      private String city;
      private Integer age;

}
