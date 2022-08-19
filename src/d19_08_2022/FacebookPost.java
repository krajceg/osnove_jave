package d19_08_2022;

public class FacebookPost {
	
	private String punoIme;
	private String punoImeProfil;
	private String tekst;
	private int lajk;
	private int deljenje;
	
	public FacebookPost () {
		
	}
	
	public FacebookPost (String punoIme, String punoImeProfila, String tekst) {
		this.punoIme = punoIme;
		this.punoImeProfil = punoImeProfila;
		this.tekst = tekst;
	}
	
	public void like () {
		this.lajk++;
	}
	
	public void dislike () {
		this.lajk--;
		if (this.lajk < 0) {
			this.lajk = 0;
		}
	}
	
	public void share () {
		this.deljenje++;
	}
	
	public void print () {
		System.out.println(this.punoIme + " >>> " + this.punoImeProfil);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.lajk + " | Shares " + this.deljenje);
	}
	
	
	
	

}
