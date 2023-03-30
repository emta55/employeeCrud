package com.nagem.employeecrud.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "employee_name")
    private String firstName;

    @Column(name = "employee_surname")
    private String lastName;
    
    @Column(name = "employee_email")
    private String email;

}
