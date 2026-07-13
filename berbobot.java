public class berbobot {
	public static void main (String[] args) {

		int V = i;
		int [] [] matrix = new int [V] [V];

		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				matrix[i] [j] = 0;
			}
		}

		matrix[0][1] = 2;
		matrix[1][0] = 2;
		matrix[0][2] = 4;
		matrix[2][0] = 4;
		matrix[1][3] = 7;
		matrix[3][1] = 7;
		System.out.println("Adjacency Matrix (Weighted) : ");
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}