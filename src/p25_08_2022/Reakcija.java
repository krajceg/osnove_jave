package p25_08_2022;

public class Reakcija {
	
	private String tipReakcije;
	private String punoImeReagovao;
	
	public Reakcija(String tipReakcije, String punoImeReagovao) {
		this.tipReakcije = tipReakcije;
		this.punoImeReagovao = punoImeReagovao;
	}
	public String getTipReakcije() {
		return tipReakcije;
	}
	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}
	public String getPunoImeReagovao() {
		return punoImeReagovao;
	}
	public void setPunoImeReagovao(String punoImeReagovao) {
		this.punoImeReagovao = punoImeReagovao;
	}
	
	
}
