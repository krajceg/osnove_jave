package d25_08_2022;

import java.util.ArrayList;

public class Student {

	private String brojIndexa;
	private String punoIme;
	private String tipStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();

	public Student(String brojIndexa, String punoIme, String tipStudija) {
		this.brojIndexa = brojIndexa;
		this.punoIme = punoIme;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public void dodajIspit(Ispit ispit) {
		this.nizIspita.add(ispit);
	}

	public double prosekPolozenih() {
		double zbirPolozenihOcena = 0;
		int brojPolozenih = 0;
		for (int i = 0; i < nizIspita.size(); i++) {
			if (nizIspita.get(i).polozen() == true) {
				zbirPolozenihOcena = zbirPolozenihOcena + nizIspita.get(i).getOcena();
				brojPolozenih++;
			}
		}
		return (zbirPolozenihOcena/brojPolozenih);
	}
	
	public void stampaj () {
		System.out.println(this.brojIndexa + " - " + this.punoIme + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for (int i = 0; i < nizIspita.size(); i++) {
			this.nizIspita.get(i).stampaj();
		}
		System.out.println("Prosecna ocena: " + this.prosekPolozenih());
	}

}
