import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SnakeBFSLatihan extends JPanel {
	int size = 20, n = 25;
	LinkedList<Point> snake = new LinkedList<>();
	Point food;
	javax.swing.Timer timer;
	Random rand = new Random();

	public SnakeBFSLatihan {
		setPreferredSize(new Dimension(n * size, n * size));
		setBackground(Color.BLACK);
		snake.add(new Point(10,10));
		spawnFood();
		timer = new javax.swing.Timer(100, e -> gameLoop());
		timer.start();
	}

	public static void main (String[] args ) {
	}
}
