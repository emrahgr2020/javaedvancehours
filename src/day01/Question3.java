package day01;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*Soru 4:
		 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
	     * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
	     * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
	     * 3. Adim : Ekrana yazdiralim.				
	       	INPUT      : 41			
	        OUTPUT  : Kullanicidan Aldigimiz sayi = 41		
				
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("char tipinde bir deger giriniz");
		char harf = scan.next().charAt(0);
		System.out.println("Kullanicidan Aldigimiz sayi = " + harf);
		
		System.out.println("byte tipinde bir deger giriniz");
		byte by=scan.nextByte();
		System.out.println("Kullanicidan Aldigimiz deger = "  + by);
		System.out.println("short tipinde bir deger giriniz");
		short st=scan.nextShort();
		System.out.println("Kullanicidan Aldigimiz deger = " +st);
		System.out.println("intiger tipinde bir deger giriniz");
		int sayi1=scan.nextInt();
		System.out.println("Kullanicidan Aldigimiz deger = " +sayi1);
		System.out.println("long tipinde bir deger giriniz");
		long sayi2=scan.nextLong();
		System.out.println("Kullanicidan Aldigimiz deger = " +sayi2);
		System.out.println("double tipinde bir deger giriniz");
		double sayi3=scan.nextDouble();
		System.out.println("Kullanicidan Aldigimiz deger = " +sayi3);
		System.out.println("float tipinde bir deger giriniz");
		float sayi4=scan.nextFloat();
		System.out.println("Kullanicidan Aldigimiz deger = " +sayi4);
		
		
		
		
		scan.close();
		
	}

}
