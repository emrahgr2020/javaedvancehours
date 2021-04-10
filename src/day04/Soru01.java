package day04;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Bir array'deki en buyuk ve en kucuk sayiyiiki ayri methodda Arrays.sort()
		 * methodu kullanmadan bir method olusturacak sekilde yapiniz
		 */

		int arr[] = { 3, 5, 2, 8, 1, 9, 4 ,-20,56};

		enKucuk(arr);
		System.out.println();
		enBuyuk(arr);
	}

	public static void enBuyuk(int[] arr) {
		int temp = Integer.MIN_VALUE;
		for (int each : arr) {

			if (each > temp) {
				temp = each;
				
			}
		}
		System.out.print(temp);
	}

	public static void enKucuk(int[] arr) {
		int temp = Integer.MAX_VALUE;

		for (int each : arr) {

			if (each < temp) {
				temp = each;
				
			}
		}
		System.out.print(temp);
	}

}
