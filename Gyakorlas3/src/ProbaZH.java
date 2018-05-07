import java.util.Random;


public class ProbaZH extends InfosVizsgaZH {


	public ProbaZH(String nev, int pontszam, int puskak) {
		super(nev, pontszam, puskak);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int meret = 10;
		ProbaZH[] emberek= new ProbaZH[meret];
		Random veletlenszamomobjektum = new Random();
		Random veletlenszamomobjektum2 = new Random();
		int szamol = 0;

		for (int i = 0; i < emberek.length; i++) {
			emberek[i]=new ProbaZH ("ZHIRO" + (i+1),veletlenszamomobjektum.nextInt(101),veletlenszamomobjektum2.nextInt(2));
		
			System.out.println(emberek[i]);
			System.out.println(emberek[i].puskak);
						for (int j = 0; j < emberek.length; j++) {
				if(emberek[i].megfeleltE())
					szamol++;
			}
		
		
		}
		double eredmeny=szamol/meret*100;
		System.out.println(eredmeny);
	}

}
