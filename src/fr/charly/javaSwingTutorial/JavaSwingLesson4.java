package fr.charly.javaSwingTutorial;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson4 extends JFrame {

	private static final long serialVersionUID = 7517942446656141786L;

	public JavaSwingLesson4() {
		super(" JMenuBar sample ");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setJMenuBar(createMenuBar());
	}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		JMenu menuFile = new JMenu("File");
		menuFile.setMnemonic('F');

		JMenuItem menuNew = new JMenuItem("new file");
		menuNew.setMnemonic('N');
		menuNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		menuNew.setIcon(new ImageIcon("icons/new.png"));
		menuNew.addActionListener(this::menuNewListener);
		menuFile.add(menuNew);

		menuFile.addSeparator();

		JMenuItem menuOpenFile = new JMenuItem("Open File ...");
		menuOpenFile.setIcon(new ImageIcon("icons/open.png"));
		menuOpenFile.setMnemonic('O');
		menuOpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		menuFile.add(menuOpenFile);

		JMenuItem menuSaveFile = new JMenuItem("Save File ...");
		menuSaveFile.setIcon(new ImageIcon("icons/save.png"));
		menuSaveFile.setMnemonic('S');
		menuSaveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		menuFile.add(menuSaveFile);

		JMenuItem menuSaveFileAs = new JMenuItem("Save File As ...");
		menuSaveFileAs.setIcon(new ImageIcon("icons/save_as.png"));
		menuSaveFileAs.setMnemonic('A');
		menuFile.add(menuSaveFileAs);

		menuFile.addSeparator();

		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setIcon(new ImageIcon("icons/exit.png"));
		menuExit.setMnemonic('x');
		menuExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK));
		menuFile.add(menuExit);

		menuBar.add(menuFile);

		JMenu menuEdit = new JMenu("Edit");
		menuEdit.setMnemonic('E');

		JMenuItem menuUndo = new JMenuItem("Undo");
		menuUndo.setIcon(new ImageIcon("icons/undo.png"));
		menuUndo.setMnemonic('U');
		menuUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
		menuEdit.add(menuUndo);

		JMenuItem menuRedo = new JMenuItem("Redo");
		menuRedo.setIcon(new ImageIcon("icons/redo.png"));
		menuRedo.setMnemonic('R');
		menuRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK));
		menuEdit.add(menuRedo);

		menuEdit.addSeparator();

		JMenuItem menuCopy = new JMenuItem("Copy");
		menuCopy.setIcon(new ImageIcon("icons/copy.png"));
		menuCopy.setMnemonic('C');
		menuCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		menuEdit.add(menuCopy);

		JMenuItem menuCut = new JMenuItem("Cut");
		menuCut.setIcon(new ImageIcon("icons/cut.png"));
		menuCut.setMnemonic('t');
		menuCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		menuEdit.add(menuCut);

		JMenuItem menuPaste = new JMenuItem("Paste");
		menuPaste.setIcon(new ImageIcon("icons/paste.png"));
		menuPaste.setMnemonic('P');
		menuPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
		menuEdit.add(menuPaste);

		menuBar.add(menuEdit);

		JMenu menuHelp = new JMenu("Help");
		menuHelp.setMnemonic('H');

		menuBar.add(menuHelp);
		return menuBar;
	}

	private void menuNewListener(ActionEvent event) {
		JOptionPane.showMessageDialog(this, "new document is required");
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		JavaSwingLesson4 window = new JavaSwingLesson4();
		window.setVisible(true);

	}

}
