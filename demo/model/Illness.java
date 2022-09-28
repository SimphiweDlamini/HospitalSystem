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
public class Illness {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long illnessid;
    @NotBlank(message = "A name is required")
    @Size(min = 2, max =255)
    private String nameofIllness;
    @NotNull
    private DiseaseType diseaseType;
    @OneToMany(mappedBy = "illness",cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private Set<Diagnosis> diagnosisSet = new HashSet<>();
}
