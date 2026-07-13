package pkg_satu;

public class IncrementDecrement {
    public static void main(String[] args) {
        
//    int counter = 1;
//    counter++; // counter jadi 2 (nambah 1)
//    counter--; // counter jadi 1 lagi (kurang 1)
//        System.out.println(counter);

    // Biasanya dipakai di looping
    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            System.out.println(i + " Genap");
        } else {
            System.out.println(i + " Ganjil");
        }     
    }
  }
}
