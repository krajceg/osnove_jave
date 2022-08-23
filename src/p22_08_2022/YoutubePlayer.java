package p22_08_2022;

public class YoutubePlayer {
	
	private Video video;
	private int kvalitetVidea;
	private String rezimVidea;
	private int jacinaZvuka;
	private int trenutnoVreme;
	
	public YoutubePlayer() {
		this.kvalitetVidea = 144;
		this.rezimVidea = "mini player";
		this.jacinaZvuka = 75;
	}
	
	public void ucitajVideo (Video video) {
		this.video = video;
		this.trenutnoVreme = 0;
		this.video.pregled();
	}
	
	public void pojacaj () {
		this.jacinaZvuka = this.jacinaZvuka + 10;
		if (this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}
	
	public void smanji () {
		this.jacinaZvuka = this.jacinaZvuka - 10;
		if (this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}
	
	public void postaviKvalitet (int brzinaNeta) {
		if (brzinaNeta < 2) {
			this.kvalitetVidea = 144;
		}
		if (brzinaNeta < 4) {
			this.kvalitetVidea = 240;
		}
		if (brzinaNeta < 6) {
			this.kvalitetVidea = 360;
		}
		if (brzinaNeta < 8) {
			this.kvalitetVidea = 720;
		}
		else {
			this.kvalitetVidea = 1080;
		}
	}
	
	public void aktivirajMiniPlayerMod () {
		this.rezimVidea = "mini player";
	}
	
	public void aktivirajBioskopskiMod () {
		this.rezimVidea = "bioskopski mod";
	}
	
	public void aktivirajPrekoCelogEkranaMod () {
		this.rezimVidea = "preko celog ekrana mod";
	}
	
	public void premotajUnapred () {
		this.trenutnoVreme = this.trenutnoVreme + 10;
		if (this.trenutnoVreme > this.video.getDuzinaVidea()) {
			this.trenutnoVreme = this.video.getDuzinaVidea();
		}
	}
	
	public void premotajUnazad () {
		this.trenutnoVreme = this.trenutnoVreme - 10;
		if (this.trenutnoVreme < 0) {
			this.trenutnoVreme = 0;
		}
	}
	
	public void iscrtajZvuk () {
		System.out.print("<: ");
		for (int i = 0; i < this.jacinaZvuka/10; i++) {
			System.out.print("|");
		}
		if (this.jacinaZvuka/10 == 0) {
			System.out.print("/");
		}
	}
	
	public void iscrtajRezim () {
		if (this.rezimVidea.equals("mini player")) {
			System.out.println("[]");
		}
		if (this.rezimVidea.equals("bioskopski mod")) {
			System.out.println("[..]");
		}
		if (this.rezimVidea.equals("preko celog ekrana mod")) {
			System.out.println("[||||]");
		}
	}
	
	public void iscrtajTrenutnoVreme () {
		int sekundDuzina = this.video.getDuzinaVidea();
		int sekundTrenutno = this.trenutnoVreme;
		
		int minutDuzina = 0;
		int minutTrenutno = 0;
		
		if (sekundDuzina/60 > 0) {
			minutDuzina = sekundDuzina/60;
			sekundDuzina = sekundDuzina - (minutDuzina * 60);
		}
		
		if (sekundTrenutno/60 > 0) {
			minutTrenutno = sekundTrenutno/60;
			sekundTrenutno = sekundTrenutno - (minutTrenutno * 60);
		}
		
		System.out.print(minutTrenutno + ":" + sekundTrenutno + " / " + minutDuzina + ":" + sekundDuzina);
	}
	
	public void iscrtajTimeline (){
		int brojZvezdica = this.trenutnoVreme * 100 / this.video.getDuzinaVidea();
		for (int i = 0; i < brojZvezdica; i++) {
			System.out.print("*");
		}
		for (int i = 0; i < 100 - brojZvezdica; i++) {
			System.out.print(".");
		}
	}
	
	public void iscitaj () {
		iscrtajTrenutnoVreme();
		System.out.print(" ");
		iscrtajZvuk();
		System.out.println();
		System.out.print("Timeline: ");
		iscrtajTimeline();
		System.out.println();
		System.out.println("Kvalitet: " + this.kvalitetVidea + "p");
		System.out.println("Rezim: " + this.rezimVidea);
		System.out.println(this.video.getNaziv());
		System.out.println("Likes " + this.video.getBrojLajkova() + " | " + "Dislikes " + this.video.getBrojDislajkova());
		System.out.println(this.video.getBrojPregleda() + " Pregleda");
	}
	
	public String sherovanje () {
		String link = "https://youtu.be/";
		link = link + this.video.getId();
		return link;
	}
}
