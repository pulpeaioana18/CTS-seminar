package ro.ase.cts.clase;

public class DecoratorUrarePaste extends DecoratorAbstract{
    public DecoratorUrarePaste(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: Paste fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();

        System.out.println("Paste fericit!");
    }
}
