package day_06;

public class Soru02 {

	/*
	 * Bir array e uzunlugundan fazla eleman eklemeye calisin ve 
	 * karsilasilan Exception i handle edin
	 */
	public static void main(String[] args) {
		
		int arr[]= {2, 15, 67, 2, 56};
		
		
		try {
			arr[5]=90;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array in uzunlugundan fazla "
					+ "eleman giremezsiniz");
		}

	}

}
