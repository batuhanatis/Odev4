package batuhan;

import java.util.Scanner;


public class Selam {
	
	int i;
    static String isim2;
	
	
	public static void main(String[] args) {
	 System.out.println("İsim Giriniz");
	 String isim = new String();
	 Scanner scn = new Scanner(System.in);
	 isim = scn.nextLine();
     System.out.println(isim);
    isim2 = isim.replace('a', '1');
    isim2 = isim2.replace('e', '2');
    isim2 = isim2.replace('ı', '3');
    isim2 = isim2.replace('i', '4');
    isim2 = isim2.replace('o', '5');
    isim2 = isim2.replace('ö', '6');
    isim2 = isim2.replace('u', '7');
    isim2 = isim2.replace('ü', '8');
	
    	System.out.println(isim2);
    	System.out.println("arıza var");
	}
	
}
