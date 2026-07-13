import java.util.Scanner;

public class Lingkaran {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double jari, keliling;

        System.out.print("Masukkan jari-jari: ");
        jari = input.nextDouble();

        keliling = 2 * 3.14 * jari;

        System.out.println("Keliling = " + keliling);
    }
}
