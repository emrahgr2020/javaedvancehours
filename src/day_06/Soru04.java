package day_06;

import java.util.ArrayList;


public class Soru04 {
	/*
	 * Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu
	 * yaziniz. String str=“ilovejavatoo” Output: o v a
	 */
	public static void main(String[] args) {

		String str = new String("ilovejavatoo");
		ArrayList<Character> charList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
			
		}
		//System.out.println(charList);
		tekrarliKarakterler(charList);
	}

	public static void tekrarliKarakterler(ArrayList<Character> a) {

		String tekrarli = "";
		for (int i = 0; i <a.size() ; i++) {
			for (int j = i+1; j < a.size(); j++) {
				if(a.get(i)==a.get(j) && !tekrarli.contains(a.get(i)+"")) {//a.get(i)+"" char i Stringe cevirdik
					tekrarli +=a.get(i);				
					}
				
			}
			
		}
		System.out.println(tekrarli);
	}
}
