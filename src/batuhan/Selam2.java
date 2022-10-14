package batuhan;

import java.util.Scanner;


public class Selam2 {
	
	int i;
    static String isim2;
    
	
	
	public static void main(String[] args) {
	 System.out.println("İsim Giriniz");
	 String isim = new String();
	 Scanner scn = new Scanner(System.in);
	 isim = scn.nextLine();
     System.out.println(isim);
     for (int i=0; i < isim.length(); i++) {
    	 if (isim.charAt(i) == 'a' ) {
    	    isim = isim.replace('a', '1');
    	 }
    	    else if (isim.charAt(i) == 'e' ) {
        	    isim = isim.replace('e', '2');
        	    
	}
    	    else if (isim.charAt(i) == 'ı' ) {
        	    isim = isim.replace('ı', '3');
        	    
	}
    	    else if (isim.charAt(i) == 'i' ) {
        	    isim = isim.replace('i', '4');
        	    
	}
    	    else if (isim.charAt(i) == 'o' ) {
        	    isim = isim.replace('o', '5');
        	    
	}
    	    else if (isim.charAt(i) == 'ö' ) {
        	    isim = isim.replace('ö', '6');
        	    
	}
    	    else if (isim.charAt(i) == 'u' ) {
        	    isim = isim.replace('u', '7');
        	    
	}
    	    else if (isim.charAt(i) == 'ü' ) {
        	    isim = isim.replace('ü', '8');
        	    
	}
     
}
     System.out.println(isim);
	}
}
