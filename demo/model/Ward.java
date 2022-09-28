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
public class Ward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long wardID;
    @NotBlank(message = "roomname is required")
    @Size(min = 2, max =255)
    private String roomname;
    @ManyToOne
    @JoinColumn(name = "nurseID")
    private Nurse assignedNurse;
}
