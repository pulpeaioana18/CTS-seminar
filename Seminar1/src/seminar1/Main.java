package seminar1;

import clase.Animal;
import clase.Lion;
import clase.WildCat;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo=new Zoo();
		Animal lion1=new Lion("Leu1");
		Lion lion2=new Lion("Leu2");
		zoo.addAnimal(lion1);	
		zoo.addAnimal(lion2);
		zoo.feedAllAnimals();
		
		WildCat cat= new WildCat("pisica1");
		WildCat cat2= new WildCat("pisica2","mancare2");
		zoo.addAnimal(cat);
		zoo.addAnimal(cat2);
		zoo.feedAllAnimals();



	}

}
