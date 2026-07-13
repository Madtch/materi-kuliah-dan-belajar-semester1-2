import java.util.Scanner;

public class PositifNegatif {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan Positif");
        } else {
            System.out.println("Bilangan Negatif");
        }
    }
}
