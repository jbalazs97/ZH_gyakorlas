package tartalyos;

public abstract class Tarolo {

	public int terfogat;

	public Tarolo(int terfogat) {
		this.terfogat = terfogat;
	}
	
	public boolean veszelyes_e(boolean veszely) {
	if (veszely==true) return true;
	else return false;
	}
	
	public  int getTerfogat() {
		return terfogat;
	}
}
