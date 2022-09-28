package com.demo.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hospitalID;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String name;
    @NotNull(message = "An address is required")
    @ManyToOne
    @JoinColumn(name = "addressID")
    private Address location;
    @OneToMany(mappedBy = "hospital")
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Doctor> doctorSet = new HashSet<>();
    @OneToMany(mappedBy = "ismanagerof")
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Doctor> managers = new HashSet<>();
    @OneToMany(mappedBy = "hospitalplace",cascade = CascadeType.REMOVE)
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Hospitalization> hospitalizations = new HashSet<>();
    @OneToOne(mappedBy = "hospital",cascade = CascadeType.ALL)
    private InternalPharmacy pharmacy;

}
