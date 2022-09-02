package mini_projekat;

import java.util.ArrayList;

public class XandOGame {

	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;

	public XandOGame() {
		super();
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public XandOGame(Player playerX, Player playerO) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void stampaj() {
		for (int i = 0; i < table.size(); i++) {
			if (i != 0 && (i + 1) % 3 == 0) {
				System.out.println(this.table.get(i) + " | ");
			} else {
				System.out.print(this.table.get(i) + " | ");
			}
		}
	}

	public void startGame() {
		this.table.set(0, " ");
		this.table.set(1, " ");
		this.table.set(2, " ");
		this.table.set(3, " ");
		this.table.set(4, " ");
		this.table.set(5, " ");
		this.table.set(6, " ");
		this.table.set(7, " ");
		this.table.set(8, " ");

		this.nextPlayer = "x";
	}

	public boolean isGameOver() {
		boolean isGameOver = true;
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				isGameOver = false;
			}
		}
		return isGameOver;
	}

	public boolean isFrieldFree(int polje) {
		if (this.table.get(polje).equals("x") || this.table.get(polje).equals("o")) {
			return false;
		} else {
			return true;
		}
	}

	public void playNext() {
		if (nextPlayer.equals("x")) {
			nextPlayer = "o";
		} else {
			nextPlayer = "x";
		}
	}

	public void makeAMove(int polje) {
		if (isFrieldFree(polje) == true) {
			this.table.set(polje, nextPlayer);
		}
	}

	public boolean isWinnerX() {
		if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")
				|| this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")
				|| this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")
				|| this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")
				|| this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinnerO() {
		if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")
				|| this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")
				|| this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")
				|| this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")
				|| this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidMove(int polje) {
		if (polje < 0 || polje > 8) {
			return false;
		} else {
			return true;
		}
	}

	public int gameScore() {
		if (isWinnerX() == true) {
			return 1;
		} else if (isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}
}
