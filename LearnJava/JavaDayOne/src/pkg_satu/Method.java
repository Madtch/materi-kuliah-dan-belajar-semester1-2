package pkg_satu;

import java.util.Scanner;

public class Method {
    
    // Method tanpa return
    static void sapaUser(String nama) {
        System.out.println("Halo " + nama + ", selamat belajar Java! mari kita hitung luas persegi dan mencari nilai rata-rata siswa!");
    }
     
    // Method dengan return
    static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }
    
    // Method dengan multiple parameter
    static double hitungNilaiRata2(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input untuk sapaan
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        sapaUser(nama);
        
        // Input untuk luas persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegi: " + luas + "cm");
        
        // Input untuk nilai siswa
        System.out.print("Masukkan jumlah nilai siswa: ");
        int jumlahNilai = input.nextInt();
        
        double[] nilaiSiswa = new double[jumlahNilai];
        
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
        }
        
        double rata2 = hitungNilaiRata2(nilaiSiswa);
        System.out.println("Rata-rata nilainya adalah: " + rata2);
        
        input.close();
    }
}