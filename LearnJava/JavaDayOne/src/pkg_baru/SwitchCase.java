package pkg_baru;
import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Hari!");
        String day = input.nextLine();
        
        switch(day) {
            case "Senin" -> System.out.println("ini hari senin");
            case "Selasa" -> System.out.println("ini hari selasa");
            case "Rabu" -> System.out.println("ini hari rabu");
            case "Kamis" -> System.out.println("ini hari kamis");
            default -> System.out.println("input salah");
        }
    }
}
