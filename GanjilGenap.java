import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
