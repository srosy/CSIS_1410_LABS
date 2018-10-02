package labBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Creates a building graphic.
 * 
 * @author SpencerR
 *
 */

@SuppressWarnings("serial")
public class Building extends JPanel {
	private final Color[] colors = { Color.WHITE, Color.PINK, Color.YELLOW, Color.BLUE, Color.CYAN };
	private final Random rand = new Random();
	private final int[] xPoints = { 100, 125, 150, 175, 200 };
	private final int[] yPoints = { 100, 75, 50, 75, 100 };
	private final int nPoints = 5;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, nPoints);

		g.setColor(Color.RED);
		g.fillRect(100, 100, 100, 200);

		for (int i = 0; i < 1; i++) {

			for (int j = 0; j < 2; j++) {
				g.setColor(getRandomColor());
				g.fillRect((50 * j + 115), 150, 25, 25);
				g.setColor(getRandomColor());
				g.fillRect((50 * j + 115), 200, 25, 25);
			}

		}

		g.setColor(Color.BLACK);
		g.fillRect(145, 250, 25, 50);

		g.setColor(Color.YELLOW);
		g.fillOval(157, 275, 10, 10);

	}

	private Color getRandomColor() {
		int randomIndex = rand.nextInt(colors.length);
		return colors[randomIndex];
	}
}
