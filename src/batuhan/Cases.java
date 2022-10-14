package batuhan;

import java.util.Scanner;

public class Cases {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String cevap;
		System.out.println("Aşağıdakilerden hangisi bir sayının karesi değildir ?");
		System.out.println("a) 9");
		System.out.println("b) 16");
		System.out.println("c) 25");
		System.out.println("d) 38");
		cevap = input.nextLine();
		
		switch (cevap) {
		case "a" :
			System.out.println("Yanlış cevap, hayatında matematik görmedin bi birader");
			break;
		case "b" :
			System.out.println("Yanlış cevap, hayatında matematik görmedin bi birader");
			break;
		case "c" :
			System.out.println("Yanlış cevap, hayatında matematik görmedin bi birader");
			break;
		case "d" :
			System.out.println("Bravo lan doğru, bi kafası çalışan sensin");
			System.out.println("Şimdi bunu cevapla bakim. 5^3= kaçtır ?");
			Scanner input2 = new Scanner(System.in);
			int cevap2;
			cevap2 = input2.nextInt();
		switch (cevap2) {
		case 125 :
			System.out.println("Aferin lan matematik dehası seni");
			break;
			default :
				System.out.println("Yok ya sen de mal çıktın ilkini de sallamışsındır allah bilir");
				break;
		}
			break;
			
		default :
			System.out.println("Daha işaretlemeyi bilmeyen varmış");
			break;
		}
		
	}

}
