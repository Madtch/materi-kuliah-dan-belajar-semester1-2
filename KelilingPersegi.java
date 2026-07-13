import java.util.Scanner;

public class KelilingPersegi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sisi, keliling;

        System.out.print("Masukkan sisi: ");
        sisi = input.nextInt();

        keliling = 4 * sisi;

        System.out.println("Keliling = " + keliling);
    }
}
