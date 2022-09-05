package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Magacioner sveta = new Magacioner("Svetolik Kljajic");
		Menadzer pera = new Menadzer("Pera Peric");
		
		Sektor proizvodnja = new Sektor("proizvodnja", 60000);
		Sektor trgovina = new Sektor("trgovina", 100000);
		
		
		sveta.zaposliUSektor(proizvodnja);
		sveta.zaposliUSektor(trgovina);
		pera.zaposliUSektor(trgovina);
		
		
		System.out.println("Radnik " + sveta.punoIme);
		System.out.println("Sektor " + sveta.nizSektora.get(0).getNazivSektora());
		System.out.println("Plata " + sveta.plataRadnik());
		System.out.println();
		System.out.println("Radnik " + pera.punoIme);
		System.out.println("Sektor " + pera.nizSektora.get(0).getNazivSektora());
		System.out.println("Plata " + pera.plataRadnik());

	}

}
