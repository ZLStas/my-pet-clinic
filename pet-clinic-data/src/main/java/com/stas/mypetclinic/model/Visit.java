package com.stas.mypetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="visits")
public class Visit extends BaseEntity {

    @Builder
    public Visit(Long id, LocalDate data, String description, Pet pet) {
        super(id);
        this.date = data;
        this.description = description;
        this.pet = pet;
    }

    @Column(name = "data")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

}
