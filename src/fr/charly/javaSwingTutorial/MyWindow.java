package fr.charly.javaSwingTutorial;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = 7524982076060823004L;

	public MyWindow() {
		super("My first swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel contentpane = (JPanel) this.getContentPane();
		contentpane.setLayout(new FlowLayout());
		contentpane.add(new JButton("Push me!"));
		contentpane.add(new JButton("Click me!!!!!!!!!"));
		contentpane.add(new JCheckBox("Check me!"));
		contentpane.add(new JTextField("Edit me!"));
	}

	public static void main(String[] args) throws Exception {
		// Apply a look'n feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		// Start my window
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);
		
	}
}
