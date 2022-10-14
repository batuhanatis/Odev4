package oyunlar;

public class KartOyunu extends Oyun {

	private String kartTuru;
	private int kartSayisi;
	private int kactaBiter;
	private boolean hesabinaMi;
	
	public KartOyunu(String oyunAdi) {
		super(oyunAdi);
	}

	public String getKartTuru() {
		return kartTuru;
	}

	public void setKartTuru(String kartTuru) {
		this.kartTuru = kartTuru;
	}

	public int getKartSayisi() {
		return kartSayisi;
	}

	public void setKartSayisi(int kartSayisi) {
		this.kartSayisi = kartSayisi;
	}

	public int getKactaBiter() {
		return kactaBiter;
	}

	public void setKactaBiter(int kactaBiter) {
		this.kactaBiter = kactaBiter;
	}

	public boolean isHesabinaMi() {
		return hesabinaMi;
	}

	public void setHesabinaMi(boolean hesabinaMi) {
		this.hesabinaMi = hesabinaMi;
	}
	
	public void kartOyna() {
		super.play();
		System.out.println("Önce kartları karıştır sonra herkese dağıt.");
	
	}

}
