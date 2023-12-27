package fr.charly.javaSwingTutorial;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson6PopupMenuSample extends JFrame {

	public JavaSwingLesson6PopupMenuSample() {
		super("JPopupMenu sample");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JPanel contentPane = (JPanel) getContentPane();

		JScrollPane leftScrollPane = new JScrollPane(new JTree());
		leftScrollPane.setPreferredSize(new Dimension(200, 0));

		JTextArea textArea = new JTextArea();
		JScrollPane rightScrollPane = new JScrollPane(textArea);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftScrollPane, rightScrollPane);
		contentPane.add(splitPane);

		JPopupMenu popupMenu = this.createPopupMenu();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				if (SwingUtilities.isRightMouseButton(event)) {
					popupMenu.show(event.getComponent(), event.getX(), event.getY());
				}
			}
		});

	}

	private JPopupMenu createPopupMenu() {
		JPopupMenu popupMenu = new JPopupMenu();

		JMenuItem menuNew = new JMenuItem("New File");
		menuNew.setMnemonic('N');
		menuNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		menuNew.setIcon(new ImageIcon("icons/new.png"));
		menuNew.addActionListener(this::menuNewListener);
		popupMenu.add(menuNew);

		popupMenu.addSeparator();

		JMenuItem menuUndo = new JMenuItem("Undo");
		menuUndo.setIcon(new ImageIcon("icons/undo.png"));
		menuUndo.setMnemonic('U');
		menuUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
		popupMenu.add(menuUndo);

		JMenuItem menuRedo = new JMenuItem("Redo");
		menuRedo.setIcon(new ImageIcon("icons/redo.png"));
		menuRedo.setMnemonic('R');
		menuRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK));
		popupMenu.add(menuRedo);

		popupMenu.addSeparator();

		JMenuItem menuCopy = new JMenuItem("Copy");
		menuCopy.setIcon(new ImageIcon("icons/copy.png"));
		menuCopy.setMnemonic('C');
		menuCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		popupMenu.add(menuCopy);

		JMenuItem menuCut = new JMenuItem("Cut");
		menuCut.setIcon(new ImageIcon("icons/cut.png"));
		menuCut.setMnemonic('t');
		menuCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		popupMenu.add(menuCut);

		JMenuItem menuPaste = new JMenuItem("Paste");
		menuPaste.setIcon(new ImageIcon("icons/paste.png"));
		menuPaste.setMnemonic('P');
		menuPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
		popupMenu.add(menuPaste);

		return popupMenu;
	}

	private void menuNewListener(ActionEvent event) {
		JOptionPane.showMessageDialog(this, "New File!");
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		JavaSwingLesson6PopupMenuSample frame = new JavaSwingLesson6PopupMenuSample();
		frame.setVisible(true);

	}

}
