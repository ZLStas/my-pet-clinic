package com.stas.mypetclinic.services.map;

import com.stas.mypetclinic.model.Owner;
import com.stas.mypetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerService ownerService;

    @BeforeEach
    void setUp() {
        ownerService = new OwnerServiceMap(new PetServiceMap(), new PetTypeMapService());
        ownerService.save(Owner.builder.id(1L))
    }

    @Test
    void findByLastName() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}