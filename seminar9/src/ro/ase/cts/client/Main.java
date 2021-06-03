package ro.ase.cts.client;

import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Flyweight;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(10,5,15);
        Rezervare rezervare2 = new Rezervare(42,7,10);
        Rezervare rezervare3 = new Rezervare(19,2,14);
        Rezervare rezervare4 = new Rezervare(15,1,20);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight client1 = flyweightFactory.getFlyweight("0727300");
        client1.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("0727300").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyweight("0727999").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("0727999").printeazaRezervare(rezervare4);
    }
}
