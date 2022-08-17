package d16_08_2022;

public class Domaci02 {

	public static void main(String[] args) {

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
