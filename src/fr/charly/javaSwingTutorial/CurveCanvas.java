package fr.charly.javaSwingTutorial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;

public class CurveCanvas extends JComponent {

	private static final long serialVersionUID = 4464341399238484812L;

	private CurveFunction function = (x) -> Math.sin(x);

	@Override
	protected void paintComponent(Graphics graphicsSimple) {
		super.paintComponent(graphicsSimple);
		Graphics2D graphics = (Graphics2D) graphicsSimple;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());

		graphics.setColor(Color.GRAY);
		graphics.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		graphics.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());

		graphics.setColor(Color.BLACK);
		graphics.drawString("0,0", (int) (getWidth() * 0.51), (int) (getHeight() * 0.54));
		graphics.drawString("-\u03c0", (int) (getWidth() * 0.02), (int) (getHeight() * 0.54));
		graphics.drawString("\u03c0", (int) (getWidth() * 0.96), (int) (getHeight() * 0.54));

		double step = 0.05;
		graphics.setColor(new Color(255, 0, 255));

		int oldX = xToPixel(-Math.PI);
		int oldY = YToPixel(function.compute(-Math.PI));

		for (double lx = -Math.PI + step; lx < Math.PI + step; lx += step) {
			int x = xToPixel(lx);
			int y = YToPixel(function.compute(lx));

			graphics.drawLine(x, y, oldX, oldY);

			oldX = x;
			oldY = y;
		}

	}

	public void setFunction(CurveFunction function) {
		this.function = function;
		this.repaint();
	}

	private int xToPixel(double x) {
		return (int) (getWidth() * (x + Math.PI) / (2 * Math.PI));

	}

	private int YToPixel(double y) {
		return (int) (getHeight() * (1 - (y + 1) / 2.0));
	}

	public static interface CurveFunction {

		public double compute(double x);
	}

}
