package ro.ase.cts.simplefactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.PORTAR, "Portar", 22);
		Jucator fundas=factory.getJucator(TipJucator.FUNDAS, "Fundas", 30);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
		
		FactorySingleton factorySingleton=FactorySingleton.getInstance();
		Jucator portar2=factorySingleton.getJucator(TipJucator.PORTAR, "Portar2", 40);
		System.out.println(portar2.toString());
	}

}
