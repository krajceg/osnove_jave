package d22_08_2022;

public class Knjiga {
	
	private String isbn;
	private String naziv;
	private int godinaIzdranja;
	private Autor autor;
	
	public Knjiga(String isbn, String naziv, int godinaIzdranja, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdranja = godinaIzdranja;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdranja() {
		return godinaIzdranja;
	}

	public void setGodinaIzdranja(int godinaIzdranja) {
		this.godinaIzdranja = godinaIzdranja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void stampaj () {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdranja);
		autor.stampa();
		
	}
	
	
	
	
	
}
