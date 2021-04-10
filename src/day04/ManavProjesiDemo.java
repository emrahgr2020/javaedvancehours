package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProjesiDemo {

	/*
	 * Basit bir manav alisveris programi yaziniz.
	 *
	 * 1. Adim : Ürün listesinden ürün seçtir ve kaç kilo oldugunu sor. 2. Adim :
	 * Baska bir ürün almak isteyip istemedigini sor. Istemiyorsa toplam miktari
	 * göster, istiyorsa tekrar ürün seçtir. Bu islemi alisverisi bitirmek isteyene
	 * kadar tekrarla. 3. Adim : Muster her ürün seçtiginde, aldigi ürünün fiyatini
	 * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam ödemesi gereken tutari
	 * göster.
	 * 
	 */

	static List<String> urunListesi = new ArrayList<>();
	static List<Double> urunFiyatListesi = new ArrayList<>();

	static double odenecekToplamFiyat = 0;

	public static void main(String[] args) {

		// System.out.println("Asagidaki listeden urun kodunu ve kilosunu giriniz");
		urunListesi.add("0 - Elma");
		urunListesi.add("1 - Muz");
		urunListesi.add("2 - Erik");
		urunListesi.add("3 - Limon");

		System.out.println(urunListesi);

		urunFiyatListesi.add(2.50);
		urunFiyatListesi.add(1.50);
		urunFiyatListesi.add(3.50);
		urunFiyatListesi.add(4.50);
		// System.out.println(urunFiyatListesi);
		urunler();

	}

	public static void urunler() {
		double toplamFiyat = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yukaridaki listeden urun kodunu seciniz");
		int urun = scan.nextInt();
		System.out.println("Lutfen kac kilo istediginizi giriniz");
		double kilo = scan.nextDouble();

		toplamFiyat = (urunFiyatListesi.get(urun) * kilo);
		odenecekToplamFiyat += toplamFiyat;

		System.out.println("Ailisverisiniz :" + toplamFiyat + " $"
				+ " dir. \nLutfen alisverise devam etmek icin 'E' alisverisi sonlandirmak icin 'H' ye basin ");
		char tercih = scan.next().toUpperCase().charAt(0);

		if (tercih == 'E') {

			urunler();

		} else if (tercih == 'H') {
			System.out.println("Toplam odeyeceginiz tutar : " + odenecekToplamFiyat
					+ " $ dir. \nBizi tercih ettiginiz icin tesekkurler");
		} else {
			System.out.println("Yanlis islem sectiniz...");
		}
scan.close();
	}

}
