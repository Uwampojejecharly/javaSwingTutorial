package fr.charly.javaSwingTutorial;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JavaSwingLesson8JSplitPaneSample extends JFrame {

	private static final long serialVersionUID = -738300029906044920L;

	public JavaSwingLesson8JSplitPaneSample() {
		super("JSplitPane sample");
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JPanel contentPane = (JPanel) getContentPane();

		JTree projectTree = new JTree();
		JScrollPane projectScrollPane = new JScrollPane(projectTree);
		projectScrollPane.setPreferredSize( new Dimension( 200, 0));

		JTextArea editor = new JTextArea();
		JScrollPane editorScrollPane = new JScrollPane(editor);
		
		JTextArea console = new JTextArea();
		JScrollPane consoleScrollPane = new JScrollPane(console);
		
		JTree outLineTree = new JTree();
		JScrollPane outLineScrollPane = new JScrollPane(outLineTree);
		
		JSplitPane horizontalSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, editorScrollPane, outLineScrollPane);
		horizontalSplitPane.setResizeWeight( 0.8 );
		
		JSplitPane verticalSplitPane = new JSplitPane( JSplitPane.VERTICAL_SPLIT, horizontalSplitPane, consoleScrollPane);
		verticalSplitPane.setResizeWeight( 0.66 );


		JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, projectScrollPane, verticalSplitPane);
		
		

		contentPane.add(mainSplitPane, BorderLayout.CENTER);

	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		JavaSwingLesson8JSplitPaneSample frame = new JavaSwingLesson8JSplitPaneSample();
		frame.setVisible(true);

	}

}
