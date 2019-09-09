package com.stas.mypetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@Table(name ="visits")
public class Visit extends BaseEntity {

    @Builder
    public Visit(Long id, LocalDate data, String description, Pet pet) {
        super(id);
        this.data = data;
        this.description = description;
        this.pet = pet;
    }

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    public LocalDate getData() {
        return data;
    }

    public void setDate(LocalDate data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
