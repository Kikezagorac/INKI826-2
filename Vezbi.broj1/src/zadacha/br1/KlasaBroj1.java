package zadacha.br1;
	
public class KlasaBroj1 {
	
public static void main(String[] args) {
		
		Student object1 = new Student (); //Креирање објект со default конструкторот
		object1.firstName = "Кристина";	  //Доделување на вредности (инцијализација)
		object1.lastName = "Загорац"; /*/ /*/
		object1.index = 826;			  /*/ /*/
		
		
		System.out.println("Податоци за прв објект:");
		System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
		
		Student object2 = new Student("Симона","Маркоска",964); //Креирање објект со динамичен конструктор
		
		System.out.println ("Податоци за втор објект:");
		System.out.println (object2.firstName + " " + object2.lastName + " " + object2.index);
	}
}