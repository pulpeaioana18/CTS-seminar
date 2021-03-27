package ro.ase.cts.barca;


public class Barca {
	
	private boolean asigurare;
	private String marca;
	private int capacitate;
	
	private static Barca barca=null;
	
	private Barca(boolean asigurare, String marca, int capacitate) {
		super();
		this.asigurare = asigurare;
		this.marca = marca;
		this.capacitate = capacitate;
	}

	public static synchronized Barca getInstance(boolean asigurare,String marca,int capacitate) {
		if(barca==null) {
			barca=new Barca(asigurare, marca, capacitate);
		}
		return barca;
	}
	
	public void setAsigurare(boolean asigurare) {
		this.asigurare = asigurare;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setCapacitate(int capacitate) {
		this.capacitate = capacitate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Barca [asigurare=");
		builder.append(asigurare);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", capacitate=");
		builder.append(capacitate);
		builder.append("]");
		return builder.toString();
	}

}
