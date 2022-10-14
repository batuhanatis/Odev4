package batuhan;

public class Strings {

	public static void main(String[] args) {
	
		String badouhan7 = "    İmparator Fatih Terim Ölene Dek Seninleyiz";
		String degisim1;
		String degisim2;
		String degisim3;
		String degisim4;
		String degisim5;
		String degisim6;
		degisim1=badouhan7.substring(0, 21);
		degisim2="Uzunluk" + badouhan7.length();
		degisim3="Fatih Terim başlangıcı" +badouhan7.indexOf("Fatih");
		degisim4=badouhan7.toUpperCase();
		degisim5=badouhan7.toLowerCase();
		degisim6=badouhan7.trim();
		System.out.println(badouhan7);
		System.out.println(degisim1);
		System.out.println(degisim2);
		System.out.println(degisim3);
		System.out.println(degisim4);
		System.out.println(degisim5);
		System.out.println(degisim6);
		
		
		

	}

}
