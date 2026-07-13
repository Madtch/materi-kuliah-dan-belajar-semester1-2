package pkg_kampus;
import java.util.Scanner;


public class ProgramNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai;
        
        System.out.println("Masukkan Nilai 0-100");
        nilai = input.nextDouble();
        
        if (nilai >= 50 ) {
            System.out.println("Wah hebat!");
        } else {
            System.out.println("paok");
        }
    }
}
