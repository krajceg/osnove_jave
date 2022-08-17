package d16_08_2022;

public class Domaci02 {

	public static void main(String[] args) {
		
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima 
//			postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih 
//			pozvati metode

		Domaci02_SmartAirConditioning a = new Domaci02_SmartAirConditioning();
		Domaci02_SmartAirConditioning b = new Domaci02_SmartAirConditioning();

		a.markaKlime = "Samsung";
		a.temperatura = 23.5;
		a.mod = "Hladi";

		a.stampa();
		System.out.println("Temperatura napolju je trenutno veca: " + a.provera(30));
		System.out.println();

		b.markaKlime = "Galanz";
		b.temperatura = 26;
		b.mod = "Hladi";
		b.stampa();
		System.out.println("Temperatura napolju je trenutno veca: " + b.provera(25));

	}

}
