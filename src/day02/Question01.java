package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Bir sayının mükemmel olup olmadığını bulan bir program yazınız. Mükemmel sayı
		 * : bir sayının kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayı
		 * mükemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (Mükemmel)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		System.out.println(checkPerfectNumber(sayi));
		String result = checkPerfectNumber(sayi) ? "Sayi mukkemel sayi" : "Sayi mukkemel sayi degil";
		System.out.println(result);
		scan.close();
	}

	public static boolean checkPerfectNumber(int sayi) {

		int toplam = 0;
		boolean flag = false;// durum kontrolu
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;

			}
		}
		if (toplam == sayi) {
			flag = true;
		}

		return flag;
	}
}
