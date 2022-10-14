package oyunlar;

public class Oyun {

	
		
		private int kisiSayisi;
	    private double oyunSuresi  ;	    
	    private int takimSayisi;
	    private final String oyunAdi;
	    private String nasilBitecek;
		
	    public int getKisiSayisi() {
			return kisiSayisi;
		}
		public void setKisiSayisi(int kisiSayisi) {
			this.kisiSayisi = kisiSayisi;
		}
		public double getOyunSuresi() {
			return oyunSuresi;
		}
		public void setOyunSuresi(double oyunSuresi) {
			this.oyunSuresi = oyunSuresi;
		}
		public int getTakimSayisi() {
			return takimSayisi;
		}
		public void setTakimSayisi(int takimSayisi) {
			this.takimSayisi = takimSayisi;
		}
		public Oyun(String oyunAdi) {
			this.oyunAdi = oyunAdi;
		}
		public String getOyunAdi() {
			return oyunAdi;
		}
		
	    public String getNasilBitecek() {
			return nasilBitecek;
		}
		public void setNasilBitecek(String nasilBitecek) {
			this.nasilBitecek = nasilBitecek;
		}
		public void play() {
	    	System.out.println("I am a game");
	    }
	    
	}


