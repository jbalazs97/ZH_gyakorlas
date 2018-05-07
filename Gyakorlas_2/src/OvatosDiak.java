
public class OvatosDiak extends Diak {

	
	
	public int hazaut;

	public OvatosDiak(String nev, int penz, int hazaut) {
		super(nev, penz);
		this.hazaut = hazaut;
	}
	
	public boolean sorozik() {
		if((penz-hazaut-sorAra)>0) {
			penz=penz-sorAra; 
			return true;
			
		}
		else return false;
	}
	
	public int penzminusz() {
		return penz-hazaut;
	}

	@Override
	public String toString() {
		return "OvatosDiak [Penzmag=" + penz + ", penzminusz()=" + penzminusz() + "]";
	}
	
	
}
