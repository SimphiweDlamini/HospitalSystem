package com.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Hospitalization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hospitalizationid;
    @NotNull
    private LocalDate checkin;
    @NotNull
    private LocalDate checkout;
    @NotNull
    @Min(0)
    private double bill;
    @ManyToOne
    @JoinColumn(name = "hospitalID",nullable = false)
    @NotNull
    private Hospital hospitalplace;
    @ManyToOne
    @JoinColumn(name = "patientID",nullable = false)
    @NotNull
    private Patient patient;
}
