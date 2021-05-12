package kurs;
import java.util.*;
public class KursYonetici {
	
	public void kursOlustur() {
		
		Scanner girdi = new Scanner(System.in);
		Kurs kurs = new Kurs();
		System.out.println("Kurs adýný giriniz:");
		kurs.kursAd = girdi.nextLine();
		System.out.println("Kurs eðitmen adýný giriniz:");
		kurs.egitmenAd = girdi.nextLine();
		System.out.println("Kurs resim yolunu giriniz:");
		kurs.resimYolu = girdi.nextLine();

		kurs.tamamlanmaOrani = 0.0;
		
		System.out.println(kurs.kursAd+" adlý kurs oluþturuldu.");
		
	}
	
    
	
	public void kursListele(Kurs[] kurslar) {
		for(Kurs kurs: kurslar) {
			System.out.println("kurs: "+ kurs.kursAd);
		}
	}
}
