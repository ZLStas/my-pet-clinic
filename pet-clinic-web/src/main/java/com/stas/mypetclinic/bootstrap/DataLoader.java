package com.stas.mypetclinic.bootstrap;

import com.stas.mypetclinic.model.Owner;
import com.stas.mypetclinic.model.Pet;
import com.stas.mypetclinic.model.PetType;
import com.stas.mypetclinic.model.Vet;
import com.stas.mypetclinic.services.OwnerService;
import com.stas.mypetclinic.services.PetTypeService;
import com.stas.mypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dogie");

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Kitty");

        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Roslyslav");
        owner1.setLastName("Mychailenko");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Konotop");
        owner1.setTelephone("1231231234");

        Pet rostislavPet = new Pet();
        rostislavPet.setPetType(savedDogPetType);
        rostislavPet.setOwner(owner1);
        rostislavPet.setBirthDate(LocalDate.now());
        rostislavPet.setName("Sharic");
        owner1.getPets().add(rostislavPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Stanislav");
        owner2.setLastName("Zhuravel");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");


        Pet stasCat = new Pet();
        stasCat.setName("Just Cat");
        stasCat.setOwner(owner2);
        stasCat.setBirthDate(LocalDate.now());
        stasCat.setPetType(savedCatPetType);
        owner2.getPets().add(stasCat);

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
