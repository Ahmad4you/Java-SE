package drawLine;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTextField;

//@SuppressWarnings("serial")
public class JTextBox extends JTextField{
	
	public JTextBox(int size) {
		super(size);
		setOpaque(false);  // to hide
	}
	@Override
	protected void paintComponent( Graphics g) {
		g.setColor(getBackground());
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
		super.paintComponent(g);
	}
	@Override
	protected void paintBorder(Graphics g) {
		g.setColor(Color.red);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
	}

}
