package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@SuperBuilder
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeid;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String name;
    @NotBlank(message = "surname is required")
    @Size(min = 2, max =255)
    private String surname;
    @ManyToOne
    @JoinColumn(name = "hospitalid")
    private Hospital hospital;
    @ManyToOne
    @JoinColumn(name = "managerid")
    private Hospital ismanagerof;

}
