package jana60poligono;

public class Quadrato implements Poligono {
	
	//attributi
	private int lato;
	

	//costruttore
	public Quadrato(int lato) throws IllegalArgumentException {
		super();
		//valida dato
		if(lato < 0) {
			throw new IllegalArgumentException("il numero inserito non può essere un numero negativo");
		}
		this.lato = lato;
		
	}
	
	
	@Override
	public int calcolaPerimetro() {
		int perimetro =lato*4;
		return perimetro;
	}

	

	@Override
	public int calcolaArea() {
		int area = lato * lato;
		return area;
	}


	@Override
	public String toString() {
		return "L'area del quadrato è:  " + calcolaArea() + " - " + "Il perimetro del quadrato è: " + calcolaPerimetro();  
				
	}


	

}
