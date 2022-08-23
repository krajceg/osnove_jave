package p22_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		ClanskaKarta clanskaKarta = new ClanskaKarta(10, "12345678");
		Kupac kupac = new Kupac("Svetolik Kljajic", clanskaKarta);
		Proizvod proizvod = new Proizvod("Ananas", kupac, 200);
		
		proizvod.stampaj();
		
	}

}
