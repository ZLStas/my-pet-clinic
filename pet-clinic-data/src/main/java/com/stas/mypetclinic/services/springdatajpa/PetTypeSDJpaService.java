package com.stas.mypetclinic.services.springdatajpa;

import com.stas.mypetclinic.model.Owner;
import com.stas.mypetclinic.model.PetType;
import com.stas.mypetclinic.repositories.OwnerRepository;
import com.stas.mypetclinic.repositories.PetRepository;
import com.stas.mypetclinic.repositories.PetTypeRepository;
import com.stas.mypetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final OwnerRepository ownerRepository;

    private final PetRepository petRepository;

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(OwnerRepository ownerRepository,
                               PetRepository petRepository,
                               PetTypeRepository petTypeRepository) {

        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);

    }
}
