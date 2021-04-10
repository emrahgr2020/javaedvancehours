package day01;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan kilosunu ve boyunu alip Vucut kitle indeksini hesaplayan bir
		 * program yaziniz. Ipucu : Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) /
		 * Boy uzunlugunun karesi (m.) ORNEK: INPUT : Kilo: 71 Boy: 1,72 OUTPUT : Vucut
		 * Kitle Indeksiniz : 23
		 */

		/*
		 * Scanner scan= new Scanner (System.in);
		 * System.out.println("Lutfen kilonuzu kg cinsinden giriniz"); float kilo =
		 * scan.nextFloat();
		 * System.out.println("Lutfen boyunuzu mt. cinsinden giriniz(orn: 1,75)"); float
		 * boy = scan.nextFloat();
		 * 
		 * float vucutKitleIndexi=kilo/(boy*boy);
		 * System.out.println("Vucut kitle indexsiniz : " + vucutKitleIndexi);
		 * 
		 * if (vucutKitleIndexi>=16 && vucutKitleIndexi<18.5) {
		 * System.out.println("Zayifsiniz. Luftfen biraz yemek yiyiniz..."); System.out.
		 * println("Eger kilonuzu kontrol edemiyorsaniz bir diyetisyene basvurunuz...");
		 * } else if(vucutKitleIndexi>=18.5 && vucutKitleIndexi<25) {
		 * System.out.println("Normal kilodasiniz. Luftfen bu kilonuzu koruyunuz...");
		 * }else if (vucutKitleIndexi>=25 && vucutKitleIndexi<40) { System.out.
		 * println("Asiri kilolusunuz. Luftfen artik beslenmenize dikkat ediniz...");
		 * System.out.
		 * println("Eger kilonuzu kontrol edemiyorsaniz bir diyetisyene basvurunuz...");
		 * }else { System.out.println("Lutfen gecerli degerler giriniz"); }
		 * 
		 * scan.close();
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kilonuzu kg cinsinden giriniz ve boyunuzu cm cinsinden giriniz");

		double kilo = scan.nextDouble();
		double boy = scan.nextDouble();
		boy /= 100;// mt cinsine cevirdik
		double vki = kilo / (boy * boy);
		System.out.println(Math.round(vki));

		scan.close();
	}

}
