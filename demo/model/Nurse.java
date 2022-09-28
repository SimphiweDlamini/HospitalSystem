package com.demo.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class Nurse extends Employee {
    @Size(min = 2, max =255)
    private String descriptionOfWork;
    @Size(min = 2, max =255)
    private String trainingSchoolName;
    @OneToMany(mappedBy = "assignedNurse")
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Ward> assignedWards = new HashSet<>();
    @OneToOne
    @JoinColumn(name = "NurseID")
    private InternalPharmacy pharmacyduty;
}
