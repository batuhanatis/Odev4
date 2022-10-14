package batuhan;

public class Odev2 {

	public static void main(String[] args) {
        int initial=1;
		int satir=3;
		int sutun=3;
		int array[][] = new int[satir][sutun];
		for (int i=0; i<satir; i++ ) {
		  for (int j=0; j<sutun; j++) {
			array[i][j]=initial;
			initial++;
		} 
	}
		matrisYazdir(array);
		stringReplace(array);
		arrayFlip2(array);
}
	
	
	
	
	
	public static void arrayFlip2(int[][] arrays) {
		int satir = arrays.length;
		int sutun= arrays[0].length;
		int array[][] = new int[satir][sutun];
		for (int i=0; i<satir; i++) {		
			for (int j=0; j<sutun; j++) {
		array[i][j] = arrays[sutun-j-1][i];
	}	
		}
		matrisYazdir(array);
	}
	
	
	
	public static void stringReplace(int[][] arrays) {
		int satir = arrays.length;
		int sutun= arrays[0].length;
		int array[][] = new int[satir][sutun];
		for (int i=0; i<satir; i++) {		
			for (int j=0; j<sutun; j++) {
		array[i][j] = arrays[satir-i-1][sutun-j-1];
	}	
		}
		matrisYazdir(array);
	}
	
	
	
	public static void matrisYazdir(int[][] arrays)	 {
		 for (int i = 0; i < arrays.length; i++) 	 	{
				for (int j = 0; j < arrays[0].length; j++) { 
					System.out.print(arrays[i][j] + " ");
				}
				System.out.println();
			}
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	