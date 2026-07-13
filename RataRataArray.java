public class ArrayDuaDimensi {
    public static void main(String[] args) {

        int[][] nilai = {
            {80, 85},
            {90, 95}
        };

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
}
