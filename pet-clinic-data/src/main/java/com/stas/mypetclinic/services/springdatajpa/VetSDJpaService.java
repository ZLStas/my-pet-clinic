package com.stas.mypetclinic.services.springdatajpa;

import com.stas.mypetclinic.model.Vet;
import com.stas.mypetclinic.repositories.VetRepository;
import com.stas.mypetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> owners = new HashSet<>();
        vetRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }

}
