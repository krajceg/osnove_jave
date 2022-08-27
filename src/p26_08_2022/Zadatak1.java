package p26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Student svetolik = new Student("Svetolik Kljajic", "12345", "33333", 90000);
		Student milan = new Student("Milan Milic", "54321", "44444", 80000);
		
		Profesor profesor1 = new Profesor("Profa 1", "33333333", "Matematika", 100000);
		Profesor profesor2 = new Profesor("Profa 2", "44444444", "Matematika2", 75000);
		
		svetolik.stampaj();
		milan.stampaj();
		
		profesor1.stampaj();
		profesor2.stampaj();
		
		svetolik.uplatiSkolarinu(30000);
		milan.uplatiSkolarinu(80000);
		
		profesor1.povecajPlatu(30);
		profesor2.povecajPlatu(100);
		
		svetolik.stampaj();
		milan.stampaj();
		
		profesor1.stampaj();
		profesor2.stampaj();
	}

}
