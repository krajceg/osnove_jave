package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor ("Ivo", "Andric");
		Autor autor2 = new Autor ("Mesa", "Selimovic");
		
		Knjiga knjiga1Autor1 = new Knjiga("111-111-111", "Na Drini cuprija", 1945, autor1);
		Knjiga knjiga2Autor1 = new Knjiga("222-222-222", "Most na Zepi", 1925, autor1);
		
		knjiga1Autor1.stampaj();
		System.out.println();
		knjiga2Autor1.stampaj();
		
		Knjiga knjiga1Autor2 = new Knjiga("333-333-333", "Tisine", 1961, autor2);
		Knjiga knjiga2Autor2 = new Knjiga("444-444-444", "Tvrdjava", 1970, autor2);
		
		System.out.println();
		knjiga1Autor2.stampaj();
		System.out.println();
		knjiga2Autor2.stampaj();

	}

}
