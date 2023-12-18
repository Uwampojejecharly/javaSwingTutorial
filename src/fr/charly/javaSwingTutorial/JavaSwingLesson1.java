package fr.charly.javaSwingTutorial;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson1 extends JFrame {

	private static final long serialVersionUID = 7768498545170471759L;

	public JavaSwingLesson1() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("Push me!"));
		contentPane.add(new JButton("Click me!!!!!"));
		contentPane.add(new JCheckBox("Check me"));
		contentPane.add(new JTextField("Edit me"));
	}

	public static void main(String[] args) throws Exception {
		// Apply a look and feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		// Start my window
		JavaSwingLesson1 javaSwingLesson1 = new JavaSwingLesson1();
		javaSwingLesson1.setVisible(true);
	}

}
