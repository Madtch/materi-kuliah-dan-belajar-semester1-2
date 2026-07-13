import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, hasil;
        char operator;

        System.out.println("== Program Calculator Sederhana ==");
        System.out.println("Masukkan angka pertama");
        a = input.nextDouble();

        System.out.println("Masukkan Operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.println("Masukkan angka kedua");
        b = input.nextDouble();

        switch (operator) {
            case '+' -> hasil = a + b;
            case '-' -> hasil = a - b;
            case '*' -> hasil = a * b;
            case '/' -> {
                if (b != 0)
                    hasil = a / b;
                else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
                    return;
                }
            }
            default -> {
                System.out.println("Operator tidak valid!");
                return;
            }
        }

        System.out.println("Hasil: " + hasil);
        input.close();
    }
}