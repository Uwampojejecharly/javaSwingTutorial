package fr.charly.javaSwingTutorial;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson2BorderLayout extends JFrame {

	private static final long serialVersionUID = 7768498545170471759L;

	public JavaSwingLesson2BorderLayout() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel contentPane = (JPanel) this.getContentPane();

		JButton btnPushMe = new JButton("Push me!");
		contentPane.add(btnPushMe, BorderLayout.NORTH);

		JButton btnClickMe = new JButton("Click me!!!!!");
		btnClickMe.setPreferredSize(new Dimension(200, 0));
		contentPane.add(btnClickMe, BorderLayout.WEST);

		JCheckBox chkCheckMe = new JCheckBox("Check me");
		contentPane.add(chkCheckMe, BorderLayout.SOUTH);

		JTextArea txtEditMe = new JTextArea("Edit me");
		contentPane.add(txtEditMe);
	}

	public static void main(String[] args) throws Exception {
		// Apply a look and feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		// Start my window
		JavaSwingLesson2BorderLayout javaSwingLesson1 = new JavaSwingLesson2BorderLayout();
		javaSwingLesson1.setVisible(true);
	}

}
