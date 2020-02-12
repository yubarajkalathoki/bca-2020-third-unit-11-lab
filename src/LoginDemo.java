import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Login Form");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 400);
		
		jFrame.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(50, 50, 100, 20);// x,y,width,height
		jFrame.add(usernameLabel);
		
		JTextField usernameTextField = new JTextField();
		usernameTextField.setBounds(120, 50, 100, 20);
		jFrame.add(usernameTextField);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(50, 80, 100, 20);// x,y,width,height
		jFrame.add(passwordLabel);
		
		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setBounds(120, 80, 100, 20);
		jFrame.add(passwordTextField);
		
		jFrame.setVisible(true);
	}
}
