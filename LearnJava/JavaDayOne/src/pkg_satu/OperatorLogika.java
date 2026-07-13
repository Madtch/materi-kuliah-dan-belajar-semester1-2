package pkg_satu;

public class OperatorLogika {
    public static void main(String[] args) {
        
    int usia = 20;
    boolean punyaSIM = true;
    
    if (usia >= 17 && punyaSIM) {
    System.out.println("Boleh Bawa Motor");
    } else {
    System.out.println("Tidak Boleh Bawa Motor");
    }
    
    boolean hujan = true;
    boolean bawaPayung = false;
    if (hujan || bawaPayung) {
    System.out.println("Hati-hati jalan kaki");
    }
    
    boolean sedangHujan = false;
    if (!sedangHujan) {
    System.out.println("Cuaca cerah");
    } else {
        System.out.println("Sedang Hujan");
    }
        
    }
}
