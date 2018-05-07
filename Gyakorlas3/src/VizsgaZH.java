
public class VizsgaZH {

	public String nev;
	public int pontszam;
	public static final int max=100;
	
	public void nevBeallito(String neve) {
		nev=neve;
	}
	
	public void pontBeallito(int pont) {
		pontszam=pont;
	}

	public VizsgaZH(String nev, int pontszam) {
		super();
		this.nev = nev;
		this.pontszam = pontszam;
	}
	
	public boolean megfeleltE() {
		if(pontszam>=max/2) return true;
		else return false;
	}
}
