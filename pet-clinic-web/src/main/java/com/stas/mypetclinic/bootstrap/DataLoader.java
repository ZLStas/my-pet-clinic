package com.stas.mypetclinic.bootstrap;

import com.stas.mypetclinic.model.Owner;
import com.stas.mypetclinic.model.Vet;
import com.stas.mypetclinic.services.OwnerService;
import com.stas.mypetclinic.services.VetService;
import com.stas.mypetclinic.services.map.OwnerServiceMap;
import com.stas.mypetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Roslyslav");
        owner1.setLastName("Mychailenko");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Stanislav");
        owner2.setLastName("Zhuravel");

        ownerService.save(owner2);

        System.out.println("Loaded owners!");

        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("Mychailo");
        vet1.setLastName("Mychailenko");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("Kolya");
        vet2.setLastName("Martynenko");

        vetService.save(vet2);

        System.out.println("Loaded vets!");

    }

}
