package p19_08_2022;

public class Zadatak2_Radnik {

	private String jmbg;
	private String punoIme;
	private int brojDece;
	private int stepenSS;
	private int godRadnogStaza;
	
	
	public Zadatak2_Radnik (){
		
	}

	public Zadatak2_Radnik (String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Zadatak2_Radnik (String jmbg, String punoIme, int brojDece, int stepenSS, int godRadnogStaza) {
		this.jmbg = jmbg;
		this.punoIme = punoIme;
		this.brojDece = brojDece;
		this.stepenSS = stepenSS;
		this.godRadnogStaza = godRadnogStaza;
	}
	
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void setBrojDece (int brojDece) {
		this.brojDece = brojDece;
	}
	
	public void setStepenSS (int stepenSS) {
		this.stepenSS = stepenSS;
	}
	
	public void setGodRadnogStaza (int godRadnogStaza) {
		this.godRadnogStaza = godRadnogStaza;
	}
	
	
	public String getJmbg () {
		return this.jmbg;
	}
	
	public String getPunoIme () {
		return this.punoIme;
	}
	
	public int getBrojDece () {
		return this.brojDece;
	}
	
	public int getStepenSS () {
		return this.stepenSS;
	}
	
	public int getGodRadnogStaza () {
		return this.godRadnogStaza;
	}
	
	public double minuliRad () {
		if (this.godRadnogStaza <= 10) {
			return this.godRadnogStaza * 0.05;
		}
		if (this.godRadnogStaza <= 20) {
			return ((10 * 0.05) + (this.godRadnogStaza - 10) * 0.075);
		}
		else {
			return ((10 * 0.05) + (10 * 0.075) + ((this.godRadnogStaza - 20) * 0.1));
		}
	}
	
	public double koeficijentSlozenosti () {
		if (this.stepenSS == 1) {
			return 1.03;
		}
		else if (this.stepenSS == 2) {
			return 1.65;
		}
		else if (this.stepenSS == 3) {
			return 2;
		}
		else if (this.stepenSS == 4) {
			return 2.27;
		}
		else if (this.stepenSS == 5) {
			return 2.88;
		}
		else if (this.stepenSS == 6) {
			return 3.09;
		}
		else if (this.stepenSS == 7) {
			return 3.4;
		}
		else {
			return 4.12;
		}
	}
	
	public double plata () {
		return 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
	}
	
	public String kreditnoSposoban() {
		if (plata() > 50000) {
			return "da";
		}
		else return "ne";
	}
}
