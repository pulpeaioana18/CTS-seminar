package ro.ase.cts.builder.client;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare1 = rezervareBuilder.setCodRezervare(200)
                                .setAreMuzica(true)
                                .setAreMancare(true)
                                .build();

        System.out.println(rezervare1);

        Rezervare rezervare2 = new Rezervare(12,true,true,true,true,"pop");
        System.out.println(rezervare2);

        //versiune builder cu shallow copy
        Rezervare rezervare3 = rezervareBuilder.setCodRezervare(100).build();
        System.out.println(rezervare3);
        System.out.println(rezervare1);

        //versiune builder cu deep copy
        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2();
        Rezervare rezervare4 = rezervareBuilderV2.setCodRezervare(999).setAreBautura(true).setAreMancare(true).build();
        Rezervare rezervare5 = rezervareBuilderV2.setCodRezervare(888).build();

        System.out.println(rezervare4);
        System.out.println(rezervare5);
    }
}
