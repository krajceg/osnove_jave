package p05_09_2022;

public class TimeControl extends Control {
	
	private boolean naKojuStranuPomera;	// true = unapred;

	public TimeControl(boolean naKojuStranuPomera) {
		super();
		this.naKojuStranuPomera = naKojuStranuPomera;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (naKojuStranuPomera == true) {
			player.trenutnoVremeVidea = player.trenutnoVremeVidea + 15;
			if (player.trenutnoVremeVidea > player.duzinaVidea) {
				player.trenutnoVremeVidea = player.duzinaVidea;
			}
		}
		else {
			player.trenutnoVremeVidea = player.trenutnoVremeVidea - 15;
			if (player.trenutnoVremeVidea < 0) {
				player.trenutnoVremeVidea = 0;
			}
		}
	}
	
	
}
