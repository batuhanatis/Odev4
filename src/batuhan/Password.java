
package batuhan;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String kullaniciadi1 = "badouhan7";
		String kullaniciadi2 = "badouhan77";
		String kullaniciadi3 = "badouhan777";
		String sifre1 = "atis53";
		String sifre2 = "atis5353";
		String sifre3 = "atis535353";

	       Scanner scn = new Scanner(System.in);
	       String input;
	       System.out.println("kullanıcı adınızı giriniz");
	       input = scn.nextLine();
	       if (input.equals(kullaniciadi1)==true || input.equals(kullaniciadi2)==true || input.equals(kullaniciadi3)==true) {
	       System.out.println("şifreyi giriniz");
	       Scanner scn2 = new Scanner(System.in);
	       String input2;
	       input2 = scn.nextLine();
	       if ((kullaniciadi1.equals(input)==true) && (sifre1.equals(input2))==true)  {
	    	   System.out.println("giriş başarılı");
	       }
	    	   else if ((kullaniciadi2.equals(input)==true) && (sifre2.equals(input2))==true) {
	    		   System.out.println("giriş başarılı");
	    	   }
	    	   else if ((kullaniciadi3.equals(input)==true) && (sifre3.equals(input2))==true) {
	    		   System.out.println("giriş başarılı");
	    	   }
	    	   else {
		    	   System.out.println("kullanıcı adı ya da şifre hatalı");
		       }
	       
	       }
	       else {
	    	   System.out.println("kullanıcı adı hatalı");
	    	   
	       }
	      
	       
	      
	       
	       }
}









