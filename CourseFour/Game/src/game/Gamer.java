package game;

public class Gamer {
	private String tcNo;
	private String ad;
	private String soyad;
	private String dogumYili;
	private Game boughtGame;
	public Gamer() {
		super();
	}
	public Gamer(String tcNo, String ad, String soyad, String dogumYili, Game boughtGame) {
		super();
		this.tcNo = tcNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
		this.boughtGame = boughtGame;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(String dogumYili) {
		this.dogumYili = dogumYili;
	}
	public Game getBoughtGame() {
		return boughtGame;
	}
	public void setBoughtGame(Game boughtGame) {
		this.boughtGame = boughtGame;
	}
}
