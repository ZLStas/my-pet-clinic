package com.stas.mypetclinic.model;

import java.util.Set;

public class Vet extends Person  {

    private Set<Speciality> specialitis;

    public Set<Speciality> getSpecialitis() {
        return specialitis;
    }

    public void setSpecialitis(Set<Speciality> specialitis) {
        this.specialitis = specialitis;
    }
}
