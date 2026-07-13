import java.util.*;

/*
========================================
BELAJAR DASAR BFS + DFS + LINKEDLIST
========================================

Code ini dibuat SENGAJA sederhana
agar kamu paham konsep inti UAS.

Yang dipelajari:
1. Method
2. Array 2D
3. LinkedList
4. Queue
5. BFS
6. DFS
7. Recursion
*/

public class BelajarUAS {

    // ========================================
    // ARRAY 2 DIMENSI (MAP)
    // ========================================

    /*
        0 = jalan kosong
        1 = tembok

        Visual map:

        S = Start
        F = Finish

        S 0 0 1
        1 0 0 1
        0 0 0 F
        1 1 0 0
    */

    static int[][] map = {
        {0, 0, 0, 1},
        {1, 0, 0, 1},
        {0, 0, 0, 0},
        {1, 1, 0, 0}
    };

    // ukuran map
    static int n = 4;

    // posisi start
    static int startX = 0;
    static int startY = 0;

    // posisi finish
    static int finishX = 2;
    static int finishY = 3;

    // ========================================
    // MAIN
    // ========================================

    public static void main(String[] args) {

        System.out.println("=== BELAJAR DFS ===");

        // array visited
        boolean[][] visitedDFS = new boolean[n][n];

        // jalankan DFS
        dfs(startX, startY, visitedDFS);

        System.out.println("\n=== BELAJAR BFS ===");

        // jalankan BFS
        bfs();

        System.out.println("\n=== BELAJAR LINKEDLIST ===");

        belajarLinkedList();
    }

    // ========================================
    // DFS
    // ========================================

    /*
        DFS = Depth First Search

        Konsep:
        menyelam jauh dulu

        DFS memakai RECURSION
    */

    static void dfs(int x, int y, boolean[][] visited) {

        // ========================================
        // CEK KELUAR MAP
        // ========================================

        if (x < 0 || y < 0 || x >= n || y >= n) {
            return;
        }

        // ========================================
        // CEK TEMBOK
        // ========================================

        if (map[x][y] == 1) {
            return;
        }

        // ========================================
        // CEK SUDAH DIKUNJUNGI
        // ========================================

        if (visited[x][y]) {
            return;
        }

        // ========================================
        // TANDAI SUDAH DIKUNJUNGI
        // ========================================

        visited[x][y] = true;

        System.out.println("DFS Kunjungi: (" + x + "," + y + ")");

        // ========================================
        // CEK APAKAH SUDAH SAMPAI FINISH
        // ========================================

        if (x == finishX && y == finishY) {
            System.out.println("DFS MENEMUKAN FINISH!");
            return;
        }

        // ========================================
        // DFS KE 4 ARAH
        // ========================================

        /*
            bawah
            atas
            kanan
            kiri
        */

        dfs(x + 1, y, visited);

        dfs(x - 1, y, visited);

        dfs(x, y + 1, visited);

        dfs(x, y - 1, visited);
    }

    // ========================================
    // BFS
    // ========================================

    /*
        BFS = Breadth First Search

        Konsep:
        menyebar ke semua arah

        BFS memakai QUEUE
    */

    static void bfs() {

        // ========================================
        // ARRAY VISITED
        // ========================================

        boolean[][] visited = new boolean[n][n];

        // ========================================
        // QUEUE
        // ========================================

        Queue<int[]> queue = new LinkedList<>();

        // ========================================
        // MASUKKAN TITIK AWAL
        // ========================================

        queue.add(new int[]{startX, startY});

        visited[startX][startY] = true;

        // ========================================
        // SELAMA QUEUE TIDAK KOSONG
        // ========================================

        while (!queue.isEmpty()) {

            // ========================================
            // AMBIL DEPAN ANTREAN
            // ========================================

            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];

            System.out.println("BFS Kunjungi: (" + x + "," + y + ")");

            // ========================================
            // CEK FINISH
            // ========================================

            if (x == finishX && y == finishY) {
                System.out.println("BFS MENEMUKAN FINISH!");
                return;
            }

            // ========================================
            // ARAH GERAK
            // ========================================

            int[][] directions = {
                {1, 0},   // bawah
                {-1, 0},  // atas
                {0, 1},   // kanan
                {0, -1}   // kiri
            };

            // ========================================
            // LOOP SEMUA ARAH
            // ========================================

            for (int[] d : directions) {

                int nx = x + d[0];
                int ny = y + d[1];

                // ========================================
                // CEK APAKAH VALID
                // ========================================

                if (isValid(nx, ny, visited)) {

                    // tandai visited
                    visited[nx][ny] = true;

                    // masukkan ke queue
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        System.out.println("BFS TIDAK MENEMUKAN JALAN");
    }

    // ========================================
    // CEK VALID
    // ========================================

    static boolean isValid(int x, int y, boolean[][] visited) {

        // keluar map
        if (x < 0 || y < 0 || x >= n || y >= n) {
            return false;
        }

        // tembok
        if (map[x][y] == 1) {
            return false;
        }

        // sudah dikunjungi
        if (visited[x][y]) {
            return false;
        }

        return true;
    }

    // ========================================
    // LINKEDLIST
    // ========================================

    static void belajarLinkedList() {

        /*
            LinkedList sering dipakai
            untuk snake.

            addFirst = tambah kepala
            removeLast = hapus ekor
        */

        LinkedList<String> snake = new LinkedList<>();

        // tambah badan ular
        snake.add("Badan 1");
        snake.add("Badan 2");
        snake.add("Badan 3");

        System.out.println("Isi awal:");
        System.out.println(snake);

        // tambah kepala baru
        snake.addFirst("KEPALA BARU");

        System.out.println("Setelah addFirst:");
        System.out.println(snake);

        // hapus ekor
        snake.removeLast();

        System.out.println("Setelah removeLast:");
        System.out.println(snake);
    }
}