
public class RockWell extends OvatosDiak {

	public RockWell(String nev, int penz, int hazaut) {
		super(nev, penz, hazaut);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 OvatosDiak ovatos = new OvatosDiak("Robi",2000,500);
		 
		sorAra=300;
		int i=0;
		
		 while (ovatos.penz >= 300) {
			i++;
			ovatos.penz -= sorAra;
			System.out.println(i+".sör  "+ovatos.penz);
			
		}
	}

}
