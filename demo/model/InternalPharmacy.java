package com.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class InternalPharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pharmID;
    @OneToOne(optional = false)
    @JoinColumn(name = "pharmID",nullable = false,updatable = false)
    private Hospital hospital;
    @OneToMany(mappedBy = "pharmacy")
    private Set<Medicine> stockofMedicine = new TreeSet<>(new SortMed());
    @OneToOne(mappedBy = "pharmacyduty")
    private Nurse AssignedNurse;

    class SortMed implements Comparator<Medicine>{
        @Override
        public int compare(Medicine medicine, Medicine t1) {
            return medicine.getNameofMedicine().compareTo(t1.getNameofMedicine());
        }
    }
}
