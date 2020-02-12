import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class JMenuDemo extends JFrame {

	public JMenuDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu Demo");
		setSize(500, 500);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");

		JMenuItem newMenuItem = new JMenuItem("New");
//		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(
//		        KeyEvent.VK_CONTROL, KeyEvent.VK_N));
		fileMenu.add(newMenuItem);

		JMenuItem exitMenuItem = new JMenuItem("Exit");

		FrameExitListener frameExitListener = new FrameExitListener();
		exitMenuItem.addActionListener(frameExitListener);

		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);

		setJMenuBar(menuBar);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuDemo();
	}
}

class FrameExitListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		JOptionPane.showConfirmDialog(null, "Are you suer", "Warning", JOptionPane.ERROR_MESSAGE);
		;
		System.exit(0);

	}

}
