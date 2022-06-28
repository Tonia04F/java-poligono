package jana60poligono;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Quadrato q = new Quadrato(5);
			q.calcolaArea();
			q.calcolaPerimetro();
			System.out.println(q.toString());
	} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
		}
		
		try {
			Rettangolo r = new Rettangolo(2, 3);
				r.calcolaArea();
				r.calcolaPerimetro();
				System.out.println(r.toString());
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
		}

	}

}
