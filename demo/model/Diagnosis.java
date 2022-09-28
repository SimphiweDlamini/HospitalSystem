package com.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long diagnosisid;
    @NotNull
    private LocalDate dateOfDiagnosis;
    @NotBlank(message = "A description is required")
    @Size(min = 2, max =255)
    private String description;
    @ManyToOne
    @JoinColumn(name = "patientID",nullable = false)
    @NotNull
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "illnessID",nullable = false)
    @NotNull
    private Illness illness;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "diagnosis")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private Set<Prescription> prescriptionSet = new HashSet<>();
}
