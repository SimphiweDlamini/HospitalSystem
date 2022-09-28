package com.demo.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class Doctor extends Employee{
    @Min(2)
    private int yearsOfExperience;
    @Size(min = 2, max =255)
    private String qualification;
    @Size(min = 2, max =255)
    private String specialization;
    @OneToMany(mappedBy = "doctor",cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private Set<Appointment> appointments = new HashSet<>();

}
