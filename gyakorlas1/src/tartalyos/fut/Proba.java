package tartalyos.fut;

import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) {
		
		Tartaly[] tarolok = new Tartaly[5];
		
		for (int i = 0; i < tarolok.length; i++) {
			tarolok[i] = new Tartaly
					((i+1),(4.2+i));
		
			System.out.println(tarolok[i]);
		}
	
		
	/*	Tartaly tarolo1= new Tartaly(10, 5.4);
		Tartaly tarolo2= new Tartaly(11, 5.9);
		Tartaly tarolo3= new Tartaly(19, 9.4);
		Tartaly tarolo4= new Tartaly(41, 1.4);
		Tartaly tarolo5= new Tartaly(20, 2.4);
	
	System.out.println(tarolo1);
	System.out.println(tarolo2);
	System.out.println(tarolo3);
	System.out.println(tarolo4);
	System.out.println(tarolo5);
*/
		Tartaly max= new Tartaly(0, 0.0);
		for (int i = 0; i < tarolok.length; i++) {
			if(tarolok[i].nyomas>max.nyomas) max=tarolok[i];
		}
	System.out.println("Legnagyobb Nyomas "+max);
	
	Tartaly max2= new Tartaly(0, 0.0);
	for (int i = 0; i < tarolok.length; i++) {
		if(tarolok[i].terfogat>max2.terfogat) max2=tarolok[i];
	}
System.out.println(max2);
	}

}
