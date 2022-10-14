package oyunlar;

public class FPS extends PcOyunu  {
	
	private String oyunTipi;
	
	public FPS(String oyunAdi, String oyunTuru, boolean cevrimici) {
		super(oyunAdi, oyunTuru, cevrimici);
	}
		
		public void shoot() {
			super.launch();
		System.out.println("Ateş ediliyor.");
		}
}
