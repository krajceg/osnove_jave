package p05_09_2022;

public class AudioControl extends Control {

	protected boolean pojacava; // false = smanjuje;

	public AudioControl(boolean pojacava) {
		super();
		this.pojacava = pojacava;
	}

	public boolean isPojacava() {
		return pojacava;
	}

	public void setPojacava(boolean pojacava) {
		this.pojacava = pojacava;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (pojacava == true) {
			player.jacinaZvuka = player.jacinaZvuka + 1;
			if (player.jacinaZvuka > 100) {
				player.jacinaZvuka = 100;
			}
		} else {
			player.jacinaZvuka = player.jacinaZvuka - 1;
			if (player.jacinaZvuka < 0) {
				player.jacinaZvuka = 0;
			}
		}
	}

}
