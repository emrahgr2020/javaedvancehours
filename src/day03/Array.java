package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin

		
		Scanner scan =new Scanner (System.in);//bu da bi obje dir
		System.out.println("Lutfen kac elemanli bir array olusturmak istiyorsunuz");
		int size =scan.nextInt();//arrey uzunlugu
		
		int sayilar []=new int[size];  //array olusturduk
		
		for (int i = 0; i< sayilar.length; i++) {
			System.out.println("Lutfen Array'in "+ (i+1)+".ci elemanini giriniz");//i+0 i kullanici 0. eleman diye gormesin diye
			sayilar[i]=scan.nextInt();//arrayin elemanlarini girdiriyoruz dongu bitene kadar
		}
		System.out.println(Arrays.toString(sayilar));//arrayi yazdirdik
		Arrays.sort(sayilar);//arrayi kucukten buyuge gore siraliyor
		System.out.println(Arrays.toString(sayilar));
		
		System.out.println(sayilar[size-1]-sayilar[0]);//son elemanla ilk elemanin farki
		scan.close();
	}

}
