import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SnakeBFS extends JPanel {

    int size = 20, n = 25;
    LinkedList<Point> snake = new LinkedList<>();
    Point food;

    javax.swing.Timer timer;
    Random rand = new Random();

    public SnakeBFS() {
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

        // jika tidak ada jalan ? mati
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
                int nx = cur.x + d[0];
                int ny = cur.y + d[1];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (!visited[nx][ny] && !isSnake(nx, ny)) {
                        visited[nx][ny] = true;
                        parent[nx][ny] = cur;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
        return null;
    }

    boolean isSafe(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) return false;
        return !isSnake(x, y);
    }

    boolean isSnake(int x, int y) {
        for (Point p : snake) {
            if (p.x == x && p.y == y) return true;
        }
        return false;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // apel coklat
        g.setColor(new Color(139, 69, 19));
        g.fillOval(food.y * size, food.x * size, size, size);

        // ular hijau
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.y * size, p.x * size, size, size);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake BFS");
        frame.add(new SnakeBFS());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}