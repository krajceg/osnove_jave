package d18_08_2022;

public class Domaci1 {
	
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova 
//	funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena 
//	proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u 
//	opsegu od 0 do 100.
//	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//	Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din
//
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

	
	
	
	public static void main(String[] args) {
		
		Domaci1_Proizvod proizvod = new Domaci1_Proizvod();
		Domaci1_Proizvod proizvod2 = new Domaci1_Proizvod();
		
		proizvod.naziv = "brasno";
		proizvod.cena = 50;
		proizvod.tezina = 500;
		
		proizvod.stampaj();
		proizvod.povecajCenu(50);
		System.out.println("Nova cena je: " + proizvod.cena + "din");
		System.out.println("Cena sa popustom je: " + proizvod.vratiCenuSaPopustom(30) + "din");
		System.out.println("Postarina za: " + proizvod.naziv + "; tezine: " + proizvod.tezina 
				+ "g; iznosi: " + proizvod.racunajPostarinu() + "din");
		System.out.println();
		
		
		proizvod2.naziv = "secer";
		proizvod2.cena = 100;
		proizvod2.tezina = 1000;
		
		proizvod2.stampaj();
		proizvod2.povecajCenu(100);
		System.out.println("Nova cena je: " + proizvod2.cena + "din");
		System.out.println("Cena sa popustom je: " + proizvod2.vratiCenuSaPopustom(20) + "din");
		System.out.println("Postarina za: " + proizvod2.naziv + "; tezine: " + proizvod2.tezina 
				+ "g; iznosi: " + proizvod2.racunajPostarinu() + "din");
		
		

	}

}
