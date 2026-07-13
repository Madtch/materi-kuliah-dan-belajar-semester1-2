import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SnakeBFSblue extends JPanel {

    int size = 20, n = 25;
    LinkedList<Point> snake = new LinkedList<>();
    Point food;

    javax.swing.Timer timer;
    Random rand = new Random();

    public SnakeBFSblue() {
        setPreferredSize(new Dimension(n * size, n * size));
        setBackground(Color.BLACK);

        snake.add(new Point(10, 10));
        spawnFood();

        timer = new javax.swing.Timer(100, e -> gameLoop());
        timer.start();
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

    void gameLoop() {
        Point next = bfs();

        if (next == null || !isSafe(next.x, next.y)) {
            JOptionPane.showMessageDialog(this, "Game Over (BFS)!");
            System.exit(0);
        }

        snake.addFirst(next);

        if (next.equals(food)) {
            spawnFood();
        } else {
            snake.removeLast();
        }

        repaint();
    }

    Point bfs() {
        boolean[][] visited = new boolean[n][n];
        Point[][] parent = new Point[n][n];

        Queue<Point> q = new LinkedList<>();
        Point head = snake.getFirst();

        q.add(head);
        visited[head.x][head.y] = true;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!q.isEmpty()) {
            Point cur = q.poll();

            if (cur.equals(food)) {
                Point p = cur;
                while (parent[p.x][p.y] != null &&
                       !parent[p.x][p.y].equals(head)) {
                    p = parent[p.x][p.y];
                }
                return p;
            }

            for (int[] d : dir) {
                int nx = (cur.x + d[0] + n) % n; // TEMBUS DINDING
                int ny = (cur.y + d[1] + n) % n; // TEMBUS DINDING

                if (!visited[nx][ny] && !isSnake(nx, ny)) {
                    visited[nx][ny] = true;
                    parent[nx][ny] = cur;
                    q.add(new Point(nx, ny));
                }
            }
        }
        return null;
    }

    boolean isSafe(int x, int y) {
        return !isSnake(x, y); // tidak perlu cek batas lagi
    }

    boolean isSnake(int x, int y) {
        for (Point p : snake) {
            if (p.x == x && p.y == y) return true;
        }
        return false;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // apel kuning
        g.setColor(Color.YELLOW);
        g.fillOval(food.y * size, food.x * size, size, size);

        // ular coklat
        g.setColor(new Color(139, 69, 19));
        for (Point p : snake) {
            g.fillRect(p.y * size, p.x * size, size, size);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake BFS Tembus Dinding");
        frame.add(new SnakeBFSblue());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}