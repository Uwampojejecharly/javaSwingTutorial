package fr.charly.javaSwingTutorial;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson3Listener1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 7768498545170471759L;

	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnClickMe = new JButton("Click me!!!!!");

	public JavaSwingLesson3Listener1() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

		btnPushMe.addActionListener(this);
		contentPane.add(btnPushMe);

		btnClickMe.addActionListener(this);
		contentPane.add(btnClickMe);

		JCheckBox chkCheckMe = new JCheckBox("Check me");
		contentPane.add(chkCheckMe);

		JTextField txtEditMe = new JTextField("Edit me");
		txtEditMe.setPreferredSize(new Dimension(120, 30));
		contentPane.add(txtEditMe);
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == btnPushMe) {
			System.out.println("Bouton click me clique");
		} else {
			System.out.println("Autre bouttton clique");
		}

	}

	public static void main(String[] args) throws Exception {
		// Apply a look and feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		// Start my window
		JavaSwingLesson3Listener1 javaSwingLesson1 = new JavaSwingLesson3Listener1();
		javaSwingLesson1.setVisible(true);
	}

}
