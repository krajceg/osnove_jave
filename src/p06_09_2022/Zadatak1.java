package p06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		PoreskaUprava puKrusevac = new PoreskaUprava("Krusevac");
		
		Lokal lokal1 = new Lokal("blabla 12", 100, 1);
		Zgrada zgrada1 = new Zgrada("ostrva vida 10", 1000, 2, 10);
		Kuca kuca1 = new Kuca("zzz zzz 13", 300, 3, 4);
		
		puKrusevac.dodajObjekat(lokal1);
		puKrusevac.dodajObjekat(zgrada1);
		puKrusevac.dodajObjekat(kuca1);
		
		puKrusevac.stampaj();
		
	}

}
