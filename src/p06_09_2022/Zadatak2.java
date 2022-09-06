package p06_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Kasa kasa = new Kasa();
		
		Pica margarita = new Pica(80);
		Pica kapricoza = new Pica(100);
		
		margarita.dodajSastojak(kasa.trazeniSastojak("luk"));
		margarita.dodajSastojak(kasa.trazeniSastojak("pecurke"));
		margarita.dodajSastojak(kasa.trazeniSastojak("masline"));
		
		kapricoza.dodajSastojak(kasa.trazeniSastojak("pecurke"));
		kapricoza.dodajSastojak(kasa.trazeniSastojak("masline"));
		kapricoza.dodajSastojak(kasa.trazeniSastojak("sunka"));
		
		kasa.dodajProizvod(margarita);
		kasa.dodajProizvod(kapricoza);
		
		
		kasa.stampajRacun();

	}

}
