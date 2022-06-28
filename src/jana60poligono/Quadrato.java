package jana60poligono;

public class Quadrato implements Poligono {
	
	//attributi
	private int lato;
	

	//costruttore
	public Quadrato(int lato) {
		super();
		
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
