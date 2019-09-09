package com.stas.mypetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@RequiredArgsConstructor
@Entity
@Builder
@Table(name="types")
public class PetType extends BaseEntity {


    public PetType(Long id , String name) {
        super(id);
        this.name = name;
    }

    @Column(name = "name")
    private String name;

}
