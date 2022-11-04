package zadacha.br7;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		Triagolnik triagolnik = new Triagolnik();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vnesi vrednost za strana a: ");
		triagolnik.a = scanner.nextDouble();
		System.out.print("Vnesi vrednost za strana b: ");
		triagolnik.b = scanner.nextDouble();
		System.out.print("Vnesi vrednost za strana c: ");
		triagolnik.c = scanner.nextDouble();
		scanner.close();
		
		System.out.println("Perimetar za triagolnikot iznesuva: "+ triagolnik.perimetar());
		System.out.println("Ploshtina za triagolnikot iznesuva: "+ triagolnik.plostina());
	}
}
