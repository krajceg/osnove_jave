package p25_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		
		ArrayList<Sastojak> nizKarbonara = new ArrayList<Sastojak>();
		Pasta pasta1 = new Pasta(nizKarbonara);
		
		Sastojak jaja = new Sastojak("jaja", 100);
		Sastojak slanina = new Sastojak("slanina", 200);
		Sastojak pasta = new Sastojak("pasta", 80);
		
		nizKarbonara.add(pasta);
		nizKarbonara.add(jaja);
		nizKarbonara.add(slanina);
		
		pasta1.stampaj();
	}

}
