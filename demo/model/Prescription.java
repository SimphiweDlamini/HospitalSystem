package com.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prescriptionid;
    @NotBlank(message = "Instructions are required for a prescription")
    @Size(min = 2, max =255)
    private String instructions;
    @ManyToOne
    @JoinColumn(name = "diagnosisID")
    private Diagnosis diagnosis;
}
