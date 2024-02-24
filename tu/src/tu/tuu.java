package tu;

import java.util.Scanner;

public class tuu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("KM Verinizi Giriniz: ");
		double km = scanner.nextDouble();
		double price = 10 + (km * 2.20);
		if (price < 20) price = 20;
		System.out.print("Odeyeceginiz Tutar: " + price);
	}
}
