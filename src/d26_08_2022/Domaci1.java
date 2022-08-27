package d26_08_2022;

public class Domaci1 {
	
	public static void main(String[] args) {
		
		Igrac pera = new Igrac("Pera Peric", "1234534545", 1988);
		Igrac mika = new Igrac("Mika Mikic", "333344445555", 1985);
		
		pera.setBrojDresa(19);
		pera.setKapiten(true);
		pera.setPozicija("napad");
		
		mika.setBrojDresa(20);
		mika.setKapiten(false);
		mika.setPozicija("odbrana");
		
		pera.stampaj();
		mika.stampaj();
		
		Trener zika = new Trener("Zika Zikic", "2221111", 1975);
		Trener zoki = new Trener("Zoki Zokic", "44445555", 1969);
		
		zika.setGodIskustva(20);
		zika.setTipTrenera("kondicioni");
		
		zoki.setGodIskustva(30);
		zoki.setTipTrenera("pomocni");
		
		zika.stampaj();
		zoki.stampaj();
	}
	
}
