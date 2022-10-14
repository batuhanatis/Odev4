package main.oyunlar;

import java.util.Scanner;

import oyunlar.FPS;
import oyunlar.KartOyunu;
import oyunlar.PcOyunu;
import oyunlar.Oyun;


public class MainClass {

	public static void main(String[] args) {

		
		
		
		//ornek1();
		ornek2();
	}

	private static void ornek2() {
		System.out.println("kac kisisiniz");
		Scanner scn = new Scanner(System.in);
		int input;
		input = scn.nextInt();
		KartOyunu pisti = new KartOyunu("Pisti");
		pisti.setKartTuru("İskambil");
		pisti.setHesabinaMi(true);
		pisti.setKactaBiter(100);
		pisti.setKartSayisi(52);
		pisti.setKisiSayisi(4);
		pisti.setTakimSayisi(2);
		if (input == pisti.getKisiSayisi()) {
		pisti.kartOyna();
		}
		else {
			System.out.println("pişti oynamak için 4 kisi olmanız lazım");
		}
	}

	private static void ornek1() {

		FPS Valorant = new FPS("Valorant", "FPS", true);
		Valorant.shoot();
		
	}

}
