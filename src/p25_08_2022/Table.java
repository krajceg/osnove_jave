package p25_08_2022;

import java.util.ArrayList;

public class Table {

	private TableHeader tableHeader;
	private ArrayList<TableRow> tableRoW = new ArrayList<TableRow>();
	private int brojRedovaPoStrani;

	public Table() {
		this.brojRedovaPoStrani = 5;	// broj redova po strani sam stavio da je 5, ne znam da l za ovo treba seter ili se uvek stavi
	}									// po difoltu vrednost?

	public void setTableHeader(TableHeader tableHeader) {
		this.tableHeader = tableHeader;
	}

	public void dodajRed(TableRow red) {
		this.tableRoW.add(red);
	}

	public void stampaj(int redniBrojStrane) {
		this.tableHeader.stampaj();
		for (int i = ((redniBrojStrane - 1) * brojRedovaPoStrani); i < ((redniBrojStrane - 1) * brojRedovaPoStrani)
				+ brojRedovaPoStrani; i++) {
			this.tableRoW.get(i).stampaj();
			if (i + 1 > this.tableRoW.size() - 1) {	// mora granicnik inace ce da puca ako stampas zadnju stranu a ona nije puna 5/5
				break;
			}
		}
	}

	public void printHTML() {
		System.out.println("<table>");
		System.out.println("<thead>");
		this.tableHeader.printHTML();
		for (int i = 0; i < tableRoW.size(); i++) {
			this.tableRoW.get(i).printHTML();
		}
		System.out.println("</thead>");
		System.out.println("</table>");
	}

	public void filter(String celija) {
		this.tableHeader.stampaj();
		for (int i = 0; i < tableRoW.size(); i++) {
			if (this.tableRoW.get(i).celijaPostoji(celija) == true) {
				this.tableRoW.get(i).stampaj();
			}
		}
	}

	public void stampaPaginator() {
		for (int i = 1; i <= this.tableRoW.size(); i = i + this.brojRedovaPoStrani) {
			System.out.print("| " + (i / this.brojRedovaPoStrani + 1) + " "); // +1 jer se zaokruzuje na veci broj
		}
	}

}
