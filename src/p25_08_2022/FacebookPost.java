package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {

	private String punoImeObjavioPost;
	private String tekst;
	private ArrayList<Reakcija> nizReakcija = new ArrayList<Reakcija>();

	public FacebookPost(String punoImeObjavioPost, String tekst) {
		this.punoImeObjavioPost = punoImeObjavioPost;
		this.tekst = tekst;
	}

	public String getPunoImeObjavioPost() {
		return punoImeObjavioPost;
	}

	public void setPunoImeObjavioPost(String punoImeObjavioPost) {
		this.punoImeObjavioPost = punoImeObjavioPost;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public ArrayList<Reakcija> getNizReakcija() {
		return nizReakcija;
	}

	public void reaguj(Reakcija reakcija) {
		for (int i = 0; i < nizReakcija.size(); i++) {
			if (reakcija.getPunoImeReagovao().equals(nizReakcija.get(i).getPunoImeReagovao())) {
				this.nizReakcija.remove(i);
			}
		}
		this.nizReakcija.add(reakcija);
	}

	private int brojRazlicitihReakcija(String tipReakcije) {
		int brojReakcije = 0;
		for (int i = 0; i < nizReakcija.size(); i++) {
			if (this.nizReakcija.get(i).getTipReakcije().equals(tipReakcije)) {
				brojReakcije++;
			}
		}
		return brojReakcije;
	}

	public void stampaj() {
		System.out.println(this.punoImeObjavioPost);
		System.out.println(this.tekst);
		System.out.println("Smajli " + brojRazlicitihReakcija("smajli") + " | Like " + brojRazlicitihReakcija("like")
				+ " | Srce " + brojRazlicitihReakcija("srce"));
		System.out.println();
	}
}
