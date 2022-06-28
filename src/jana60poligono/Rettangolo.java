package jana60poligono;

public class Rettangolo implements Poligono {

	//attributi
	private int base;
	private int altezza;

	
	//costruttore
		public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;

	}
		
	@Override
	public int calcolaPerimetro() {
		int perimetro = (base+altezza)*2;
		return perimetro;
	}



	@Override
	public int calcolaArea() {
		int area = base*altezza;
		return area;
	}

	@Override
	public String toString() {
		return "L'area del rettangolo è:  " + calcolaArea() + " - " + "Il perimetro del rettangolo è: " + calcolaPerimetro();  
				
	}
}
