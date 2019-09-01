package com.stas.mypetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person  {

    private Set<Speciality> specialitis = new HashSet<>();

    public Set<Speciality> getSpecialitis() {
        return specialitis;
    }

    public void setSpecialitis(Set<Speciality> specialitis) {
        this.specialitis = specialitis;
    }
}
