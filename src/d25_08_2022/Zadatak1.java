package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Student svetolik = new Student("123", "Svetolik Kljajic", "osnovne");
		
		Ispit matematika = new Ispit("Matematika", 6, "Milan");
		Ispit matematika2 = new Ispit("Matematika2", 7, "Milan");
		Ispit informatika = new Ispit("Informatika", 5, "Milan");
		Ispit ekonomija = new Ispit("Ekonomija", 5, "Milan");
		Ispit menadzment = new Ispit("Menadzment", 5, "Milan");
		Ispit engleski = new Ispit("Engleski", 5, "Milan");
		Ispit engleski2 = new Ispit("Engleski2", 5, "Milan");
		
		svetolik.dodajIspit(matematika);
		svetolik.dodajIspit(matematika2);
		svetolik.dodajIspit(informatika);
		svetolik.dodajIspit(ekonomija);
		svetolik.dodajIspit(menadzment);
		svetolik.dodajIspit(engleski);
		svetolik.dodajIspit(engleski2);
		
		svetolik.stampaj();

	}

}
