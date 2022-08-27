package p26_08_2022;

public class DUOPaket extends Paket{
	
	private int brojMeseciPoDinar;
	private String dodatniUredjaj;
	public DUOPaket(String punoImeKorisnika, int cenaMesec, int ugovornaObaveza, String dodatniUredjaj) {
		super("EON FULL DUO", punoImeKorisnika, cenaMesec, ugovornaObaveza, 250, 150);
		this.brojMeseciPoDinar = 6;
		this.dodatniUredjaj = dodatniUredjaj;
	}
	
	public void povecajBrzinu(int brzina) {
		super.download += brzina;
		super.upload += brzina;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println(" + " + this.brojMeseciPoDinar + " meseca po 1 dinar");
		System.out.println("Dodato uz paket: " + this.dodatniUredjaj);
		System.out.println();
	}
}
