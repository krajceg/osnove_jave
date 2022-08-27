package p26_08_2022;

public class Paket {
	
	protected String nazivPaketa;
	protected String punoImeKorisnika;
	protected int cenaMesec;
	protected int ugovornaObaveza;
	protected int download;
	protected int upload;
	
	public Paket(String nazivPaketa, String punoImeKorisnika, int cenaMesec, int ugovornaObaveza, int download,
			int upload) {
		super();
		this.nazivPaketa = nazivPaketa;
		this.punoImeKorisnika = punoImeKorisnika;
		this.cenaMesec = cenaMesec;
		this.ugovornaObaveza = ugovornaObaveza;
		this.download = download;
		this.upload = upload;
	}

	public String getPunoImeKorisnika() {
		return punoImeKorisnika;
	}

	public void setPunoImeKorisnika(String punoImeKorisnika) {
		this.punoImeKorisnika = punoImeKorisnika;
	}

	public int getCenaMesec() {
		return cenaMesec;
	}

	public void setCenaMesec(int cenaMesec) {
		this.cenaMesec = cenaMesec;
	}

	public int getUgovornaObaveza() {
		return ugovornaObaveza;
	}

	public void setUgovornaObaveza(int ugovornaObaveza) {
		this.ugovornaObaveza = ugovornaObaveza;
	}

	public String getNazivPaketa() {
		return nazivPaketa;
	}

	public int getDownload() {
		return download;
	}

	public int getUpload() {
		return upload;
	}
	
	public void produziUgovor() {
		this.ugovornaObaveza = this.ugovornaObaveza + 12;
	}
	
	public int brojMeseciPoDinar() {
		return 0;
	}
	
	public void stampaj() {
		System.out.println("Ime korisnika: " + this.punoImeKorisnika);
		System.out.print("Naziv Paketa: " + this.nazivPaketa);
		System.out.println(" " + this.download + "/" + this.upload + " - " + this.ugovornaObaveza + " meseca");
		System.out.print("Cena: " + this.cenaMesec + "din");
	}
}
