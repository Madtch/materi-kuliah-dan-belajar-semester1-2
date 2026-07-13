package pkg_satu;
import java.util.Scanner;

public class ProgramKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga, jumlah, uangDibayar, totalHarga, kembalian;
        
        System.out.println("=== Program Kasir Sederhana ===");
        
        System.out.print("Silahkan Masukkan Harga Barang: Rp ");
        harga = input.nextDouble();
        
        System.out.print("Masukkan Jumlah Barang: ");
        jumlah = input.nextDouble();
        
        totalHarga = harga * jumlah;
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        
        System.out.print("Berapa Uang yang anda bayarkan?: Rp ");
        uangDibayar = input.nextDouble();
        
        // CEK APAKAH UANGNYA CUKUP
        if (uangDibayar < totalHarga) {
            double kekurangan = totalHarga - uangDibayar;
            System.out.println("\n❌ Uang Anda KURANG Rp " + kekurangan);
            System.out.println("Silahkan tambah uang atau kurangi jumlah barang!");
        } else {
            kembalian = uangDibayar - totalHarga;
            
            System.out.println("\n========== STRUK ==========");
            System.out.println("Harga Barang: Rp " + harga);
            System.out.println("Jumlah: " + jumlah);
            System.out.println("---------------------------");
            System.out.println("Total: Rp " + totalHarga);
            System.out.println("Bayar: Rp " + uangDibayar);
            System.out.println("Kembalian: Rp " + kembalian);
            System.out.println("============================");
            System.out.println("Terima kasih telah berbelanja! 🛍️");
        }
        
        input.close();
    }
}