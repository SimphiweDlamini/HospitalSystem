package com.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientid;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String name;
    @NotBlank(message = "surname is required")
    @Size(min = 2, max =255)
    private String surname;
    @NotNull
    private LocalDate dateofBirth;
    @Digits(integer = 9,fraction = 0)
    private double emergencyNumber;
    @OneToMany(mappedBy = "patient",cascade = CascadeType.REMOVE)
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Hospitalization> hospitalizations = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "patient",cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private Set<Diagnosis> diagnosisSet = new HashSet<>();
}
