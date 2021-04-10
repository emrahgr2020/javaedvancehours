package day_06;

import java.util.Scanner;

public class Soru01 {
	/*
 	Kullanicidan yasini alin ve eger kullanici yasini
 	 0 veya daha az bir yas girerse
 kullaniciya musade etmeyin(Exception throw edin)
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		
		if(scan.nextInt()<=0) {
			try {
			throw new IllegalArgumentException();
			}catch(Exception e) {
				System.out.println("Yas 0 girilmez");
			}
		}else {
			System.out.println("Yasiniz"+ scan.nextInt());
		}
		
	}

}
