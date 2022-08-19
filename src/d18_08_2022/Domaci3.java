package d18_08_2022;

public class Domaci3 {

	public static void main(String[] args) {
		
		Domaci3_SmartAirConditioning smart = new Domaci3_SmartAirConditioning ();
		
		
		smart.marka = "Samsung";
		smart.potrosnjaHladi = 0.5;
		smart.potrosnjaGreje = 2;
		smart.temperatura = 23;
		smart.mod = "hladi";
		
		
		smart.stampa();
		
		System.out.println(smart.potrosnjaMetoda() + "kW/h");

		System.out.println("Mesecni racun je " + smart.racunMetoda() + "din");
		
		

	}

}
