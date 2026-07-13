package pkg_satu;
import java.util.Scanner;

public class LatihanDua {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if ("admin".equals(username) && "123".equals(password)) {
            System.out.println("Selamat datang admin!");
        } else {
            System.out.println("Username/password salah");
        }
        
        input.close();
    }
}