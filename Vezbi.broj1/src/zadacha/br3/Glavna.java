package zadacha.br3;

public class Glavna {

	public static void main(String[] args) {
		Covek c = new Covek ();
		c.ime = "Kristina";
		c.prezime = "Zagorac";
		c.embg = "0112002455232";
		
		System.out.println("Imeto na chovekot e: " + c.ime);
		System.out.println("Prezimeto na chovekot e: " + c.prezime);
		System.out.println("Chovekot ima matichen broj: " + c.embg);
	}

}