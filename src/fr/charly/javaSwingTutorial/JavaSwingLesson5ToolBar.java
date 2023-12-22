package fr.charly.javaSwingTutorial;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson5ToolBar extends JFrame {

	private static final long serialVersionUID = 7517942446656141786L;

	public JavaSwingLesson5ToolBar() {
		super(" JToolbar sample ");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JPanel contentPane = (JPanel) this.getContentPane();

		contentPane.add(createToolBar(), BorderLayout.NORTH);
		contentPane.add(new JTree(), BorderLayout.WEST);
	}

	private JToolBar createToolBar() {
		JToolBar toolBar = new JToolBar();

		JButton btnNew = new JButton(new ImageIcon("icons/new.png"));
		btnNew.setToolTipText("New File (CTRL+N)");
		btnNew.addActionListener(this::btnNewListener);
		toolBar.add(btnNew);

		JButton btnSave = new JButton(new ImageIcon("icons/save.png"));
		btnSave.setToolTipText("Save (CTRL+S)");
		toolBar.add(btnSave);

		JButton btnSaveAs = new JButton(new ImageIcon("icons/save_as.png"));
		btnSaveAs.setToolTipText("Save As...");
		toolBar.add(btnSaveAs);

		toolBar.addSeparator();

		JButton btnCopy = new JButton(new ImageIcon("icons/copy.png"));
		btnCopy.setToolTipText("Copy (CTRL+C)");
		toolBar.add(btnCopy);

		JButton btnCut = new JButton(new ImageIcon("icons/cut.png"));
		btnCut.setToolTipText("Cut (CTRL+X)");
		toolBar.add(btnCut);

		JButton btnPaste = new JButton(new ImageIcon("icons/paste.png"));
		btnPaste.setToolTipText("Paste (CTRL+V)");
		toolBar.add(btnPaste);

		toolBar.addSeparator();

		JButton btnExit = new JButton(new ImageIcon("icons/exit.png"));
		btnExit.setToolTipText("Exit (ALT+F4)");
		toolBar.add(btnExit);

		toolBar.addSeparator();

		toolBar.add(new JCheckBox("Check me!"));
		toolBar.add(new JTextField("Edit Me!"));

		return toolBar;

	}

	private void btnNewListener(ActionEvent event) {
		JOptionPane.showMessageDialog(this, "New document is required");
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		JavaSwingLesson5ToolBar window = new JavaSwingLesson5ToolBar();
		window.setVisible(true);

	}

}
