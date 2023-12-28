package fr.charly.javaSwingTutorial;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson7ActionSample extends JFrame {

	public JavaSwingLesson7ActionSample() {
		super("Swing Action Sample");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setJMenuBar(this.createMenuBar());

		JPanel contentPane = (JPanel) getContentPane();
		contentPane.add(this.createToolBar(), BorderLayout.NORTH);

		JScrollPane leftScrollPane = new JScrollPane(new JTree());
		leftScrollPane.setPreferredSize(new Dimension(200, 0));

		JTextArea textArea = new JTextArea();
		JScrollPane rightScrollPane = new JScrollPane(textArea);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftScrollPane, rightScrollPane);
		contentPane.add(splitPane);

		JPopupMenu popupMenu = this.createPopupMenu();
		textArea.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent event) {
				if (SwingUtilities.isRightMouseButton(event)) {
					popupMenu.show(event.getComponent(), event.getX(), event.getY());
				}
			}
		});
	}

	private JPopupMenu createPopupMenu() {
		JPopupMenu popupMenu = new JPopupMenu();

		popupMenu.add(actNew);
		popupMenu.add(actRedo);
		popupMenu.addSeparator();
		popupMenu.add(actCopy);
		popupMenu.add(actCut);
		popupMenu.add(actPaste);

		return popupMenu;
	}

	private AbstractAction actNew = new AbstractAction() {
		{
			putValue(Action.NAME, "New File");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/new.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_N);
			putValue(Action.SHORT_DESCRIPTION, "New file... (CTRL+N)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("New");
		}
	};

	private AbstractAction actOpen = new AbstractAction() {
		{
			putValue(Action.NAME, "Open File...");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/open.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_O);
			putValue(Action.SHORT_DESCRIPTION, "Open file (CTRL+O)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Open");
		}
	};

	private AbstractAction actSave = new AbstractAction() {
		{
			putValue(Action.NAME, "Save File");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/save.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_S);
			putValue(Action.SHORT_DESCRIPTION, "Save file (CTRL+S)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Save");
		}
	};

	private AbstractAction actSaveAs = new AbstractAction() {
		{
			putValue(Action.NAME, "Save As...");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/save_as.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
			putValue(Action.SHORT_DESCRIPTION, "Save file");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Save as");
		}
	};

	private AbstractAction actExit = new AbstractAction() {
		{
			putValue(Action.NAME, "Exit");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/exit.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_X);
			putValue(Action.SHORT_DESCRIPTION, "Exit (ALT+F4)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Exit");
		}
	};

	private AbstractAction actRedo = new AbstractAction() {
		{
			putValue(Action.NAME, "Redo");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/redo.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
			putValue(Action.SHORT_DESCRIPTION, "Redo (CTRL+U)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Redo");
		}
	};

	private AbstractAction actCopy = new AbstractAction() {
		{
			putValue(Action.NAME, "Copy");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/copy.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
			putValue(Action.SHORT_DESCRIPTION, "Copy (CTRL+C)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Copy");
		}
	};

	private AbstractAction actCut = new AbstractAction() {
		{
			putValue(Action.NAME, "Cut");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/cut.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_T);
			putValue(Action.SHORT_DESCRIPTION, "Cut (CTRL+X)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Cut");
		}
	};

	private AbstractAction actPaste = new AbstractAction() {
		{
			putValue(Action.NAME, "Paste");
			putValue(Action.SMALL_ICON, new ImageIcon("icons/paste.png"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
			putValue(Action.SHORT_DESCRIPTION, "Paste (CTRL+V)");
			putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Paste");
		}
	};

	private JToolBar createToolBar() {
		JToolBar toolBar = new JToolBar();

		JButton btnNew = toolBar.add(actNew);
		btnNew.setHideActionText(true);
		toolBar.addSeparator();
		toolBar.add(actOpen).setHideActionText(true);
		toolBar.add(actSave).setHideActionText(true);
		toolBar.add(actSaveAs).setHideActionText(true);
		toolBar.addSeparator();
		toolBar.add(actExit).setHideActionText(true);

		return toolBar;
	}

	private JMenuBar createMenuBar() {

		JMenuBar menuBar = new JMenuBar();

		JMenu menuFile = new JMenu("File");
		menuFile.setMnemonic('F');

		menuFile.add(actNew);
		menuFile.addSeparator();
		menuFile.add(actOpen);
		menuFile.add(actSave);
		menuFile.add(actSaveAs);
		menuFile.addSeparator();
		menuFile.add(actExit);

		menuBar.add(menuFile);

		JMenu menuEdit = new JMenu("Edit");
		menuEdit.setMnemonic('E');

		menuEdit.add(actNew);
		menuEdit.add(actRedo);
		menuEdit.addSeparator();
		menuEdit.add(actCopy);
		menuEdit.add(actCut);
		menuEdit.add(actPaste);

		menuBar.add(menuEdit);

		JMenu mnuHelp = new JMenu("Help");
		mnuHelp.setMnemonic('H');

		menuBar.add(mnuHelp);

		menuBar.add(menuFile);

		return menuBar;
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		JavaSwingLesson7ActionSample frame = new JavaSwingLesson7ActionSample();
		frame.setVisible(true);

	}

}
