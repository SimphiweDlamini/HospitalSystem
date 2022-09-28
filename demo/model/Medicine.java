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
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long medID;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String nameofMedicine;
    @ManyToOne
    @JoinColumn(name = "medicineID")
    private InternalPharmacy pharmacy;
}
