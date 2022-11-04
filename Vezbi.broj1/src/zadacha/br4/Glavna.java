package zadacha.br4;

public class Glavna {

	public static void main(String[] args) {
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "Opel";
		avtomobil1.model = "Astra";
		avtomobil1.pominatiKm = 34000;
		
		Avtomobil avtomobil2 = new Avtomobil ("Ford", "Galaxy",29000);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.pominatiKm);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.pominatiKm);
	}

}
