package oyunlar;

public class PcOyunu extends Oyun {
	
	private final String oyunTuru;
	private double kacGB;
	private final boolean cevrimici;

	public PcOyunu(String oyunAdi, String oyunTuru, boolean cevrimici) {
		super(oyunAdi);
		this.oyunTuru = oyunTuru;
		this.cevrimici = cevrimici;
		
	}

	public double getKacGB() {
		return kacGB;
	}

	public void guncelleme(double guncelleme) {
		kacGB += guncelleme;
	}

	public String getOyunTuru() {
		return oyunTuru;
	}

	public boolean isCevrimici() {
		return cevrimici;
	}
	
	public void launch() {
		super.play();
		System.out.println("Launching");
	}

	
}
	
	
	
