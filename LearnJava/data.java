import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double a, b, hasil;
        char operator;

            System.out.println("Masukkan angka pertama");
            a = input.nextDouble();

            System.out.println("Masukkan angka kedua");
            b = input.nextDouble();

            System.out.println("Perkalian: " + (a * b));
            System.out.println("Pembagian: " + (a / b)) ;
            System.out.println("Penjumlahan: " + (a + b)) ;
            System.out.println("Pengurangan: " + (a - b) );
            System.out.println("Perpangkatan: " + Math.pow(5,4));
            System.out.println("Sisa Bagi: " + (a % b)) ;
            System.out.println("Nilai Mutlak: " + Math.abs(19));
    }
}