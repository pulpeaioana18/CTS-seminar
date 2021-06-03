package ro.ase.cts.client;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.clase.DecoratorUrarePaste;
import ro.ase.cts.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaInitiala = new NotaDePlata(55);
        notaInitiala.printeaza();

        DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
        decoratorLaMultiAni.printeazaFelicitare();
        decoratorLaMultiAni.printeaza();

        DecoratorAbstract decoratorUrarePaste = new DecoratorUrarePaste(notaInitiala);
        decoratorUrarePaste.printeaza();

        System.out.println("@@@@@@@@@@@");
        NotaDePlata notaDePlata = new NotaDePlata(150);
        DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
        DecoratorAbstract decoratorUrarePaste2 = new DecoratorUrarePaste(decoratorLaMultiAni2);
        decoratorUrarePaste2.printeaza();

    }
}
