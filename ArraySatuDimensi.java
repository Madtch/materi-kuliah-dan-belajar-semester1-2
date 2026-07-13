public class RataRataArray {
    public static void main(String[] args) {

        int[] nilai = {80, 85, 90, 95, 100};

        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }

        double rata = total / nilai.length;

        System.out.println("Rata-rata = " + rata);
    }
}
