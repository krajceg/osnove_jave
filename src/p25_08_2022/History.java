package p25_08_2022;

import java.util.ArrayList;

public class History {
	
	private ArrayList<HistoryPage> niz1 = new ArrayList<HistoryPage>();
	
	public void otvoriStranicu(HistoryPage page) {
		this.niz1.add(page);
	}
	
	public void obrisiPremaLinku (String link) {
		for (int i = 0; i < this.niz1.size(); i++) {
			if (this.niz1.get(i).getLinkStranice().equals(link)) {
				this.niz1.remove(i);
			}
		}
	}
	
	public void obrisiKolacicePremaLinku (String link) {
		for (int i = 0; i < this.niz1.size(); i++) {
			if (this.niz1.get(i).getLinkStranice().equals(link)) {
				this.niz1.get(i).obrisiKolacice();
			}
		}
	}
	
	public void obrisiIstoriju () {
		for (int i = niz1.size()-1; i >= 0; i--) {
			this.niz1.remove(i);
		}
	}
	
	public void sacuvajKredencija (String nazivStranice, String username, String password) {
		for (int i = 0; i < niz1.size(); i++) {
			if (this.niz1.get(i).getNazivStranice().equals(nazivStranice)) {
				this.niz1.get(i).sacuvajKredencijale(username, password);
			}
		}
	}
	
	public void pogledajIstoriju () {
		for (int i = 0; i < niz1.size(); i++) {
			this.niz1.get(i).stampaj();
		}
		System.out.println();
	}
	
	public void obrisiSveKolacice () {
		for (int i = 0; i < niz1.size(); i++) {
			this.niz1.get(i).obrisiKolacice();
			
		}
	}
	
	public void obrisiSveKolaciceZaZadnjihSatVremena (int sat, int minut) {
		int vreme = minut + sat * 60;
		for (int i = 0; i < niz1.size(); i++) {
			int vreme2 = this.niz1.get(i).getVremeMinut() + this.niz1.get(i).getVremeSat()*60;
			if (vreme2 > vreme - 60 && vreme2 <= vreme) {
				this.niz1.get(i).obrisiKolacice();
			}
		}
	}
}
