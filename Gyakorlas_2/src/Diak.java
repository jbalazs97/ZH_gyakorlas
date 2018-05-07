
public class Diak {

	public String nev;
	public int penz;
	public Diak(String nev, int penz) {
		super();
		this.nev = nev;
		this.penz = penz;
	}
	
	public int penze() {
		return penz;
	}
	public static int sorAra;
	public boolean sorozik(int sorAra) {
		penz=penz-sorAra;
		if (penz>0) {
			return true;
		}
		else return false;
	}
}
