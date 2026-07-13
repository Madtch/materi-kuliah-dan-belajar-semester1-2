package pkg_satu;

public class Main {
    public static void main(String[] args) {
        String nama = "Budi";
        int usia = 19;
        double tinggiBadan = 175.5;
        char jenisKelamin = 'L';
        boolean mahasigma = false;
        System.out.println("Nama : " + nama );
        System.out.println("Usia : " + usia + "th");
        System.out.println("Tinggi Badan : " + tinggiBadan + "cm");
        
        if (mahasigma == true ) {
            System.out.println("Ya " + nama + ", " + "Kamu adalah Mahasigma");
        } else {
            System.out.println("Bukan " + nama + ", " + "Kamu bukan Mahasigma");
        }
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }
}

