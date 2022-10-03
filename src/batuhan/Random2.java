package batuhan;

import java.util.Random;

public class Random2 {
	
	

	public static void main(String[] args) {
        int sayac=1;
        int yazi=0;
        int tura=0;
		Random r = new Random();	
		while (sayac<11) {
			boolean a=r.nextBoolean();
			if (a==false) {
				System.out.println("yazı");
				yazi++;
			}
				else {
					System.out.println("tura");
					tura++;
				}
			sayac++;
			}
		System.out.println(yazi + " yazı");
		System.out.println(tura + " tura");
		if (yazi<tura) {
			System.out.println("Atamın yüzü yere gelmedi.");
		}
			else if (tura < yazi){
				System.out.println("Zaten hep yazı geliyo ya");
			}
			else 
				System.out.println("Olsun be dostluk kazandı");
		}
		}
		

		

	

