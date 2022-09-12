package test_2;

public class InstagramUser {
	
	private String username;
	private String punoIme;
	
	public InstagramUser(String username) {
		super();
		this.username = username;
	}

	public InstagramUser(String username, String punoIme) {
		super();
		this.username = username;
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getUsername() {
		return username;
	}
	
	public void stampaj() {
		System.out.println("@" + this.username + "\t" + this.punoIme);
	}
	
	public String linkDoProfila() {
		return "https://www.instagram.com/" + this.username + "/";
	}
	
}
