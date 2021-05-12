package kurs;

public class Kurs {
	String kursAd;
	String resimYolu;
	String egitmenAd;
	double tamamlanmaOrani;
	
	public Kurs() {
		System.out.println("Kurslar");
	}
	public Kurs(String kursAd, String resimYolu, String egitmenAd, double tamamlanmaOrani) {
		this.kursAd = kursAd;
		this.resimYolu = resimYolu;
		this.egitmenAd = egitmenAd;
		this.tamamlanmaOrani = tamamlanmaOrani;
	}
	
}
