package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Panel;

import javax.swing.JPasswordField;

import java.awt.Window.Type;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import main.Login;

public class UI_Login {

	private JFrame frmLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Login window = new UI_Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 486, 507);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(107, 142, 35));
		panel.setBounds(0, 0, 479, 535);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(116, 97, 228, 128);
		panel.add(panel_1);
		
		Label label = new Label("Usu\u00E1rio:");
		label.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		label.setAlignment(Label.RIGHT);
		label.setBounds(10, 25, 87, 22);
		panel_1.add(label);
		
		Label label_1 = new Label("Senha:");
		label_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		label_1.setAlignment(Label.RIGHT);
		label_1.setBounds(10, 53, 87, 22);
		panel_1.add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(103, 25, 110, 22);
		panel_1.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(103, 53, 110, 20);
		panel_1.add(passwordField);
		
		Button button = new Button("Entrar");
		button.setFont(new Font("Verdana", Font.PLAIN, 12));
		button.setBackground(new Color(107, 142, 35));
		button.setBounds(142, 79, 71, 35);
		panel_1.add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(UI_Login.class.getResource("/img/login_logo.jpg")));
		label_2.setBounds(0, 0, 479, 479);
		panel.add(label_2);
	}
}
