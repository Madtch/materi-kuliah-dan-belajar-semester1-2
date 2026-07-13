public class Faktorial {

    static int faktorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(faktorial(5));
    }
}
