import javax.swing.*;

public class JFrameExtendingDemo extends JFrame {

	public void displayGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello");
		setSize(300, 300);
		
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		JFrameExtendingDemo jFrameExtendingDemo = new JFrameExtendingDemo();
		jFrameExtendingDemo.displayGUI();
	}
}
