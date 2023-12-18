package fr.charly.javaSwingTutorial;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson2GridLayout extends JFrame {

	private static final long serialVersionUID = 7768498545170471759L;

	public JavaSwingLesson2GridLayout() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new GridLayout(2, 2, 10, 10));

		JButton btnPushMe = new JButton("Push me!");
		contentPane.add(btnPushMe);

		JButton btnClickMe = new JButton("Click me!!!!!");
		contentPane.add(btnClickMe);

		JCheckBox chkCheckMe = new JCheckBox("Check me");
		contentPane.add(chkCheckMe);

		JTextField txtEditMe = new JTextField("Edit me");
		contentPane.add(txtEditMe);
	}

	public static void main(String[] args) throws Exception {
		// Apply a look and feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		// Start my window
		JavaSwingLesson2GridLayout javaSwingLesson1 = new JavaSwingLesson2GridLayout();
		javaSwingLesson1.setVisible(true);
	}

}
