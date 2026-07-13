import java.util.Scanner;

public class HitungNilai {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		double nilai;

		System.out.println("Masukkan Nilai");
		nilai = input.nextDouble();

		if(nilai < 45) {
			System.out.println("E");
		} else if(nilai >= 45 && nilai < 60) {
			System.out.println("D");
		} else if(nilai >= 60 && nilai < 70) {
			System.out.println("C");
		} else if(nilai >= 70 && nilai < 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
}