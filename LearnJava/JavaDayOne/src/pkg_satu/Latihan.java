package pkg_satu;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Usia Anda: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan Anda: ");
        double tinggiBadan = input.nextDouble();  // lebih baik pake double
        input.nextLine();  // <-- TAMBAHKAN INI
        
        System.out.print("Status Menikah? (y/n) ");
        String nikah = input.nextLine();
        
        boolean statusNikah = false;
        
        if (nikah.equalsIgnoreCase("yes") || nikah.equalsIgnoreCase("y")) {
            statusNikah = true;
        } else if (nikah.equalsIgnoreCase("no") || nikah.equalsIgnoreCase("n")) {
            statusNikah = false;
        } else {
            System.out.println("Input not recognized as 'yes' or 'no', defaulting to false.");
        }
        
        // Tampilkan semua data
        System.out.println("\n=== DATA DIRI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Status Menikah: " + (statusNikah ? "Menikah" : "Belum Menikah"));
        
        input.close();
    }
}
