import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai;

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
