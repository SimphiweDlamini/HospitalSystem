package com.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressID;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String streetname;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String postalcode;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String city;
    @NotBlank(message = "name is required")
    @Size(min = 2, max =255)
    private String country;
    @OneToMany(mappedBy = "location")
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Hospital> hospitals = new HashSet<>();
}
