package day01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
	     * SORU 1
	     *
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
	     * kullaniciya musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa 10 urunden fazla alirsa %15,10 urunden az alirsa %10 indirim yapin
	     *
	     */

		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen aldiginiz urunlerin adedini giriniz");
		int quantity = scan.nextInt();
		System.out.println("Lutfen aldiginiz urunlerin liste fiyatini giriniz");
		double price = scan.nextDouble();

		double totalPrice;
		
		
		System.out.println("Musteri kartiniz var ise Y  yoksa N giriniz");
		char card = scan.next().charAt(0);
		
		if (card=='y') {
			if (quantity>10) {
				price *= 0.8; // %20 indirim
				totalPrice=price*quantity;
				System.out.println("%20 indirim kazandiniz. Toplam odememiz gereken miktar : " + totalPrice);
			} else {
				price*=0.85;
				totalPrice=price*quantity;
				System.out.println("%15 indirim hakki kazandiniz.Toplam odemeniz gereken miktar :" + totalPrice);

			}
			
		} else if(card=='n'){

			if(quantity>10) {
				price*=0.85;
				totalPrice=price*quantity;
				System.out.println("%15 indirim hakki kazandiniz.Toplam odemeniz gereken miktar : " + totalPrice);
				
			}else {
				price *=0.9;
				totalPrice=price*quantity;
				System.out.println("%10 indirim hakki kazandiniz.Toplam odemeniz gereken miktar : " + totalPrice);
			
			}
			
		}else {
		System.out.println("Lutfen gecerli islem giriniz");
		}
			scan.close();
	}

}
