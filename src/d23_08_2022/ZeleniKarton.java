package d23_08_2022;

public class ZeleniKarton {
	
	private String punoIme;
	private String brojIndexa;
	private String nazivPredmeta;
	private String punoImeProfesora;
	private int ocena;
	
//	Predstavu nemam sta je zeleni karton za fakultet, google mi samo nalazi standardan sto ide uz vozacku
//	zato svi atributu idu u konstruktor :D
	public ZeleniKarton(String punoIme, String brojIndexa, String nazivPredmeta, String punoImeProfesora,
						int ocena) {
		this.punoIme = punoIme;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.punoImeProfesora = punoImeProfesora;
		this.ocena = ocena;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public String getPunoImeProfesora() {
		return punoImeProfesora;
	}

	public int getOcena() {
		return ocena;
	}
	
//	iz istog razloga nema setera
	
	public boolean polozioIspit () {
		if (this.ocena > 5) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void stampaj () {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.punoIme + ", " + this.brojIndexa);
		System.out.println("Profesor: " + this.punoImeProfesora);
		System.out.println();
	}
}
