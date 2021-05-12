package kurs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kurs kurs1= new Kurs();
		kurs1.kursAd="C#";
		kurs1.egitmenAd ="Engin";
		kurs1.resimYolu="resimyolu1";
		kurs1.tamamlanmaOrani=0.0;
		
		Kurs kurs2 = new Kurs("Java","Engin","resimyolu2",0.4);
		
		Kurs[] kurslar = {kurs1, kurs2};
		
		KursYonetici kursYonetici = new KursYonetici();
		
		kursYonetici.kursListele(kurslar);
		
		kursYonetici.kursOlustur();
	}

}
