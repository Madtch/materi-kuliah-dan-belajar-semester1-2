package pkg_kampus;
import java.util.Scanner;

public class GameTebakAngka {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angkaRahasia, angkaUser;
    // Buat program tebak angka sederhana
        System.out.println("Tebak angka rahasia!");
    // 1. Simpan angka rahasia (misal: 7)
    angkaRahasia = 7;
    // 2. Kasih user 3 kali kesempatan
        for (int i = 0; i < 3; i++) { 
            System.out.println("Coba tebak berapa angka rahasianya?: ");
            angkaUser = input.nextInt();
            
            if (angkaUser == angkaRahasia) {
                System.out.println("Selamat!, Wow itu beneran jago? atau cuma hoki?!");
            } else if (angkaUser > angkaRahasia) {
                System.out.println("Lebih Kecil! Ayo Coba Lagi!");
                angkaUser = input.nextInt();
            } else {
                System.out.println("Yahaha Kalah");
            }
        }
        
        
    // 3. Setiap tebakan:
    //    - Kalo benar: "Selamat!" dan program selesai
    //    - Kalo salah: "Salah, coba lagi" (atau kasih tau "lebih besar/kecil")
    //    - Kalo habis kesempatan: "Yahahah kalah"
    }
}
