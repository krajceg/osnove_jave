package d23_08_2022;

public class Ringla {
	
	private String tipRingle; 		// obicna/ekspres
	private int jacinaRingle; 		// obicna 0-3, ekspres 0-12
	private double jacinaGrejaca; 	// u kW (0.8, 1, 1.5,...)
	
	public Ringla(String tipRingle, double jacinaGrejaca) {
		this.tipRingle = tipRingle;
		this.jacinaGrejaca = jacinaGrejaca;
		this.jacinaRingle = 0;
	}

	public int getJacinaRingle() {
		return jacinaRingle;
	}
	
	private int maxJacina () {
		if (this.tipRingle.equals("obicna")) {
			return 3;
		}
		else {
			return 12;
		}
	}
	
	public void pojacaj () {
		this.jacinaRingle++;
		if (this.jacinaRingle > maxJacina()) {
			this.jacinaRingle = maxJacina();
		}
	}
	
	public void iskljuci () {
		this.jacinaRingle = 0;
	}
	
	public boolean radi () {
		if (this.jacinaRingle > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double potrosnja (double vreme) {
		return ((100 * 1.0 / maxJacina()) * jacinaRingle * jacinaGrejaca * vreme);
	}
	
	public void stampaj () {
		System.out.print("Ringla je ");
		if (radi() == true) {
			System.out.println("ukljucena");
		}
		else {
			System.out.println("iskljucena");
		}
		System.out.println("Tip ringle: " + this.tipRingle);
		System.out.println("Jacina: " + this.jacinaRingle);
		System.out.println("Grejac: " + this.jacinaGrejaca + " kW");
		System.out.println();
	}
	
	
	
	
	
	
	
}
