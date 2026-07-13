package pkg_satu;
import java.util.Scanner;

public class Ngawi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
       
        System.out.print("Masukkan Usia Anda: ");
        int usia = input.nextInt();
        input.nextLine();  // <-- TAMBAHKAN INI untuk membersihkan buffer
        
        System.out.print("Apakah Anda Memiliki KTP ? Jawab (y/n): ");
        String KTP = input.nextLine();  // sekarang akan bekerja dengan benar
                
//        boolean cekKTP = false;  // lebih baik inisialisasi dengan false
        
        if (KTP.equalsIgnoreCase("ya") || KTP.equalsIgnoreCase("y")) {
//            cekKTP = true;
            System.out.println("Halo " + nama + ", Usia " + usia + ", Punya KTP: YA!");
        } else if (KTP.equalsIgnoreCase("tidak") || KTP.equalsIgnoreCase("n")) {
//            cekKTP = false;
            System.out.println("Halo " + nama + ", Usia " + usia + ", Punya KTP: TIDAK!");
        } else {
            System.out.println("Input tidak ditemukan, mohon menjawab 'yes/y' or 'no/n'.");
            // Program tetap lanjut dengan cekKTP = false
        }
        
        
        
        input.close();
    }
}
