package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 266;
		int sayi2 = 266;
		int sayi3 = 266;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("en Büyük =" + enBuyuk);

	}

}
