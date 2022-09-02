package mini_projekat;

import java.util.Scanner;

public class Mini_Projekat {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Player sveta = new Player("Svetolik Kljajic");
		Player pera = new Player("Pera Peric");
		XandOGame game = new XandOGame(sveta, pera);

		int potez;

		game.stampaj();
		game.startGame();

		do {
			do {
				System.out.print(game.getNextPlayer() + " is on the move. Enter position: ");
				potez = s.nextInt();
				if (game.isValidMove(potez) == true) {
					if (game.isFrieldFree(potez) == true) {
						game.makeAMove(potez);
					} else {
						System.out.println("You enter invalid position.");
					}
				} else {
					System.out.println("You enter invalid position.");
				}
			} while (potez > 8 || potez < 0);
			game.playNext();
			game.stampaj();
			game.isGameOver();

		} while (game.isGameOver() == false && game.isWinnerX() == false && game.isWinnerO() == false);

		System.out.println();
		System.out.println("Score: " + game.gameScore());
		System.out.println(sveta.getPunoIme());
		System.out.println(pera.getPunoIme());
		
		
	}
}