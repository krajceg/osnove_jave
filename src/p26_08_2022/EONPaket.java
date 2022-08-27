package p26_08_2022;

public class EONPaket extends Paket{
	
	private int brojMeseciPoDinar;
	
	public EONPaket(String punoImeKorisnika, int cenaMesec, int ugovornaObaveza) {
		super("EON LIGHT DUO", punoImeKorisnika, cenaMesec, ugovornaObaveza, 150, 75);
		this.brojMeseciPoDinar = 3;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println(" + " + this.brojMeseciPoDinar + " meseca po 1 dinar");
		System.out.println();
	}
	
	

}
