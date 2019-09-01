package com.stas.mypetclinic.bootstrap;

import com.stas.mypetclinic.model.Owner;
import com.stas.mypetclinic.model.PetType;
import com.stas.mypetclinic.model.Vet;
import com.stas.mypetclinic.services.OwnerService;
import com.stas.mypetclinic.services.PetTypeSerive;
import com.stas.mypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    private final PetTypeSerive petTypeSerive;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeSerive petTypeSerive) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeSerive = petTypeSerive;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dogie");

        PetType savedDogPetType = petTypeSerive.save(dog);

        PetType cat = new PetType();
        cat.setName("Kitty");

        PetType savedCatPetType = petTypeSerive.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Roslyslav");
        owner1.setLastName("Mychailenko");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Stanislav");
        owner2.setLastName("Zhuravel");

        ownerService.save(owner2);

        System.out.println("Loaded owners!");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mychailo");
        vet1.setLastName("Mychailenko");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kolya");
        vet2.setLastName("Martynenko");

        vetService.save(vet2);

        System.out.println("Loaded vets!");

    }

}
