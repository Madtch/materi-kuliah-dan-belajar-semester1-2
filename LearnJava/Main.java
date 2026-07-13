import java.util.Scanner;

public class Main {
		public static void main (String[] args) {
				Scanner input = new Scanner (System.in);

				double panjang, lebar, luas;

				System.out.println("Masukkan Panjang");
				panjang = input.nextDouble();

				System.out.println("Masukkan Lebar");
				lebar = input.nextDouble();

				luas = panjang * lebar;

				System.out.print("Luas Persegi Panjang" + luas);
			}
	}