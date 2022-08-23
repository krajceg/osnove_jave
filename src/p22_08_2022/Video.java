package p22_08_2022;

public class Video {
	
	private String id;
	private String naziv;
	private int duzinaVidea;
	private int brojLajkova;
	private int brojDislajkova;
	private int brojPregleda;
	
	public Video(String id, String naziv, int duzinaVidea, int brojLajkova, int brojDislajkova, int brojPregleda) {
		this.id = id;
		this.naziv = naziv;
		this.duzinaVidea = duzinaVidea;
		this.brojLajkova = brojLajkova;
		this.brojDislajkova = brojDislajkova;
		this.brojPregleda = brojPregleda;
	}

	public void lajk() {
		this.brojLajkova++;
	}
	
	public void dislajk() {
		this.brojDislajkova++;
	}
	
	public void pregled() {
		this.brojPregleda++;
	}

	public String getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public int getBrojLajkova() {
		return brojLajkova;
	}

	public int getBrojDislajkova() {
		return brojDislajkova;
	}

	public int getBrojPregleda() {
		return brojPregleda;
	}
	
	
}
