package jana60poligono;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrato q = new Quadrato(5);
		Rettangolo r = new Rettangolo(2, 3);
		
		q.calcolaArea();
		q.calcolaPerimetro();
		System.out.println(q.toString());
		
		r.calcolaArea();
		r.calcolaPerimetro();
		System.out.println(r.toString());

	}

}
