package p25_08_2022;

public class HistoryPage {

	private String nazivStranice;
	private String linkStranice;
	private int vremeSat;
	private int vremeMinut;
	private String username;
	private String password;

	public HistoryPage(String nazivStranice, String linkStranice, int vremeSat, int vremeMinut) {
		this.nazivStranice = nazivStranice;
		this.linkStranice = linkStranice;
		this.vremeSat = vremeSat;
		this.vremeMinut = vremeMinut;
	}

	public String getNazivStranice() {
		return nazivStranice;
	}

	public void setNazivStranice(String nazivStranice) {
		this.nazivStranice = nazivStranice;
	}

	public String getLinkStranice() {
		return linkStranice;
	}

	public void setLinkStranice(String linkStranice) {
		this.linkStranice = linkStranice;
	}

	public int getVremeSat() {
		return vremeSat;
	}

	public void setVremeSat(int vremeSat) {
		this.vremeSat = vremeSat;
	}

	public int getVremeMinut() {
		return vremeMinut;
	}

	public void setVremeMinut(int vremeMinut) {
		this.vremeMinut = vremeMinut;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void sacuvajKredencijale(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void obrisiKolacice() {
		this.username = null;
		this.password = null;
	}

	public void stampaj() {
		System.out.print(
				this.vremeSat + ":" + this.vremeMinut + " - " + this.nazivStranice + " - " + this.linkStranice);
		if (this.username != null && this.password != null) {
			System.out.print("*");
		}
		System.out.println();
	}

}
