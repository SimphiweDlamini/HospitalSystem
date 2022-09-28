package com.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentid;
    @NotNull
    private LocalDate dayofAppointment;
    @NotBlank(message = "A description is required")
    @Size(min = 2, max =255)
    private String description;
    @ManyToOne(optional = false)
    @JoinColumn(name = "doctorID",nullable = false,updatable = false)
    private Doctor doctor;
}
