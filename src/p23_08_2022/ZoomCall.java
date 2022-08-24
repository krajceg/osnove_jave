package p23_08_2022;

public class ZoomCall {
	
	private String linkZaPoziv;
	private String password;
	private Korisnik host;
	private Korisnik guest;
	
	public ZoomCall(String linkZaPoziv, String password, Korisnik host) {
		this.linkZaPoziv = linkZaPoziv;
		this.password = password;
		this.host = host;
	}
	public Korisnik getGuest() {
		return guest;
	}
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLinkZaPoziv() {
		return linkZaPoziv;
	}
	public String getPassword() {
		return password;
	}
	public Korisnik getHost() {
		return host;
	}
	
	public void stampa () {
		System.out.println("Zoom Call: " + this.linkZaPoziv);
		System.out.println("Password: " + this.password);
		System.out.print("Host: ");
		host.stampaj();
		System.out.print("Guest: ");
		guest.stampaj();
		System.out.print("Maximalno trajanje poziva je " + host.maxVideo() + "min");
	}
}
