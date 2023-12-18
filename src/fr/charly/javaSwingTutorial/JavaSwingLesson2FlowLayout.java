package fr.charly.javaSwingTutorial;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson2FlowLayout extends JFrame {

	private static final long serialVersionUID = 7768498545170471759L;

	public JavaSwingLesson2FlowLayout() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

		JButton btnPushMe = new JButton("Push me!");
		contentPane.add(btnPushMe);

		JButton btnClickMe = new JButton("Click me!!!!!");
		contentPane.add(btnClickMe);

		JCheckBox chkCheckMe = new JCheckBox("Check me");
		contentPane.add(chkCheckMe);

		JTextField txtEditMe = new JTextField("Edit me");
		txtEditMe.setPreferredSize(new Dimension(120, 30));
		contentPane.add(txtEditMe);
	}

	public static void main(String[] args) throws Exception {
		// Apply a look and feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		// Start my window
		JavaSwingLesson2FlowLayout javaSwingLesson1 = new JavaSwingLesson2FlowLayout();
		javaSwingLesson1.setVisible(true);
	}

}
