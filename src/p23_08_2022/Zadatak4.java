package p23_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		ViberKorisnik sveta = new ViberKorisnik("Svetolik Kljajic", 062111222);
		ViberKorisnik milan = new ViberKorisnik("Milan Jovanovic", 062222333);
		
		ViberPoruka poruka1 = new ViberPoruka("sta se radi", "20:30", sveta, milan);
		ViberReakcija reakcija1 = new ViberReakcija("smajli", milan);
		poruka1.setReakcija(reakcija1);
		poruka1.stampaj();
		
		ViberPoruka poruka2 = new ViberPoruka("bleja", "20:31", milan, sveta);
		ViberReakcija reakcija2 = new ViberReakcija("sunglases", sveta);
		poruka2.setReakcija(reakcija2);
		poruka2.stampaj();
		
		ViberPoruka poruka3 = new ViberPoruka("isto", "20:33", sveta, milan);
		poruka3.stampaj();
		
	}

}
