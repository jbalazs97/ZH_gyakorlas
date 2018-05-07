
public class InfosVizsgaZH extends VizsgaZH {

	public int puskak;

	public InfosVizsgaZH(String nev, int pontszam, int puskak) {
		super(nev, pontszam);
		this.puskak = puskak;
	}
	
	public boolean megfeleltE() {
	
		if((pontszam>=max/2)&&puskak==0) return true;
		else return false;
	}

	@Override
	public String toString() {
		return "InfosVizsgaZH [nev=" + nev + ", pontszam=" + pontszam + ", megfeleltE()=" + megfeleltE() + "]";
	}
	
	
}
