package Login;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DBUtil.ButtonListener;

public class Login extends JFrame {
	
	public Login() {
		setTitle("���ģʽLogin�������");
		setSize(600, 600);
		Font font = new Font("����",Font.BOLD,40);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("�û���:");
		usernameLabel.setBounds(100, 50, 50, 50);
		
		JTextField usernameField = new JTextField();
		usernameField.setBounds(160, 60, 140, 30);
		
		JLabel codeJLabel = new JLabel("���룺");
		codeJLabel.setBounds(100, 80, 50, 50);
		
		JTextField codeField = new JTextField();
		codeField.setBounds(160, 90, 140, 30);
		
		JButton loginButton = new JButton("��¼");
		loginButton.setBounds(170, 150, 70, 35);
		
		loginButton.addMouseListener(new ButtonListener(usernameField,codeField));
		
		panel.add(codeJLabel);
		panel.add(codeField);
		panel.add(usernameField);
		panel.add(usernameLabel);
		panel.add(loginButton);
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
