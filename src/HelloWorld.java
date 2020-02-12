import javax.swing.*;

public class HelloWorld {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setTitle("Hello World Title!");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 400);
		
		jFrame.setLayout(null);
		
		JLabel helloWorldLabel = new JLabel("Hello World");
		helloWorldLabel.setBounds(50, 50, 100, 40);// x,y,width,height
		jFrame.add(helloWorldLabel);
		
		jFrame.setVisible(true);
	}
}
