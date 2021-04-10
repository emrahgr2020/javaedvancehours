package day02;

import java.util.Scanner;

public class Qusetion02 {

	public static void main(String[] args) {
		// sayinin basamak degerlerinin toplamini while loop ile yaziniz

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		System.out.println(basamakToplama(sayi));
		scan.close();
	}

	public static int basamakToplama(int sayi) {
	
		int toplam=0;
		
		while(sayi!=0) {
			
			toplam +=sayi%10;
			sayi /=10;
			
			
		}
		return toplam;
		
	}

}
