package p16_08_2022;

public class SlackMessage_Main {

	public static void main(String[] args) {
		
		SlackMessage a = new SlackMessage();
		SlackMessage b = new SlackMessage();
		
		a.tekst = "Cao";
		a.punoIme = "Svetolik Kljajic";
		a.datumVreme = "26.08.2021 18:55";
		
		b.tekst = "blabla";
		b.punoIme = "Pera Peric";
		b.datumVreme = "26.08.2021 18:57";
		
		System.out.println("[" + a.punoIme + "] - [" + a.datumVreme + "]");
		System.out.println("[" + a.tekst + "]");
		System.out.println();
		System.out.println("[" + b.punoIme + "] - [" + b.datumVreme + "]");
		System.out.println("[" + b.tekst + "]");

	}

}
