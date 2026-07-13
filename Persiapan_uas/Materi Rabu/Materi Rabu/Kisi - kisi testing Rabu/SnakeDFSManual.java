import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SnakeDFSManual extends JPanel implements KeyListener {

    int size = 20, n = 25;
    LinkedList<Point> snake = new LinkedList<>();
    Point food;

    char direction = 'R';
    Random rand = new Random();

    public SnakeDFSManual() {
        setPreferredSize(new Dimension(n * size, n * size));
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);

        snake.add(new Point(10, 10));
        spawnFood();
    }

    void spawnFood() {
        while (true) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);
            if (!isSnake(x, y)) {
                food = new Point(x, y);
                break;
            }
        }
    }

    // ================= GERAK SAAT TEKAN TOMBOL =================
    void move() {
        Point head = snake.getFirst();
        int nx = head.x, ny = head.y;

        if (direction == 'U') nx--;
        if (direction == 'D') nx++;
        if (direction == 'L') ny--;
        if (direction == 'R') ny++;

        // DFS bantu jika arah tidak aman
        if (!isSafe(nx, ny)) {
            int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
            for (int[] d : dirs) {
                int tx = head.x + d[0];
                int ty = head.y + d[1];
                if (isSafeDFS(tx, ty)) {
                    nx = tx;
                    ny = ty;
                    break;
                }
            }
        }

        // TABRAKAN
        if (!isSafe(nx, ny)) {
            JOptionPane.showMessageDialog(this, "Game Over (DFS Manual)!");
            System.exit(0);
        }

        snake.addFirst(new Point(nx, ny));

        if (nx == food.x && ny == food.y) {
            spawnFood();
        } else {
            snake.removeLast();
        }

        repaint();
    }

    // ================= CEK AMAN =================
    boolean isSafe(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) return false;
        return !isSnake(x, y);
    }

    // ================= DFS =================
    boolean isSafeDFS(int x, int y) {
        boolean[][] visited = new boolean[n][n];
        return dfs(x, y, visited) > snake.size();
    }

    int dfs(int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= n || y >= n) return 0;
        if (visited[x][y] || isSnake(x, y)) return 0;

        visited[x][y] = true;

        return 1 + dfs(x+1,y,visited)
                 + dfs(x-1,y,visited)
                 + dfs(x,y+1,visited)
                 + dfs(x,y-1,visited);
    }

    boolean isSnake(int x, int y) {
        for (Point p : snake) {
            if (p.x == x && p.y == y) return true;
        }
        return false;
    }

    // ================= GAMBAR =================
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // apel merah
        g.setColor(Color.RED);
        g.fillOval(food.y * size, food.x * size, size, size);

        // ular pink
        g.setColor(Color.PINK);
        for (Point p : snake) {
            g.fillRect(p.y * size, p.x * size, size, size);
        }
    }

    // ================= KEYBOARD =================
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP && direction != 'D') {
            direction = 'U';
            move();
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN && direction != 'U') {
            direction = 'D';
            move();
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && direction != 'R') {
            direction = 'L';
            move();
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT && direction != 'L') {
            direction = 'R';
            move();
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake DFS Manual (Pink)");
        SnakeDFSManual game = new SnakeDFSManual();

        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}