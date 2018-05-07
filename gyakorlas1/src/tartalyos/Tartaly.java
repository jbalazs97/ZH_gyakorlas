package tartalyos;

public class Tartaly extends Tarolo {

	@Override
	public int getTerfogat() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double nyomas;

	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}
	public boolean veszelyes_e() {
	
		if ((getTerfogat()*nyomas)>100) {
			return true;
		}
		else return false;
	}
	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + ", terfogat=" + terfogat + ", veszelyes_e()=" + veszelyes_e() + "]";
	}
	
	public boolean nagyobb_e(double masik) {
	if(masik<nyomas) return true;
	else return false;
	}
	
	public Tartaly nagyobb2(Tartaly tartaly1, Tartaly tartaly2) {
		
		if(tartaly1.terfogat>tartaly2.terfogat)
			return tartaly1;
		else return tartaly2;
		
	}
	
}
