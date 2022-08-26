package d25_08_2022;

public class Ispit {

	private String nazivPredmeta;
	private int ocena;
	private String punoImeProfesora;

	public Ispit(String nazivPredmeta, int ocena, String punoImeProfesora) {
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.punoImeProfesora = punoImeProfesora;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getPunoImeProfesora() {
		return punoImeProfesora;
	}

	public void setPunoImeProfesora(String punoImeProfesora) {
		this.punoImeProfesora = punoImeProfesora;
	}

	public boolean polozen() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.punoImeProfesora + " - " + this.ocena);
	}
}
