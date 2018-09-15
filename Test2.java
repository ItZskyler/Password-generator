package test2;

import java.awt.EventQueue;
import java.util.UUID;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Test2 {

	private JFrame frame;
	private JTextField txtText;
	private JButton btnOntop;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 window = new Test2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Test2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\skyle\\Pictures\\Programming.png"));
		frame.getContentPane().setBackground(new Color(102, 51, 153));
		frame.setBounds(100, 100, 578, 281);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Password generator");
		frame.setVisible(true);
		
		
		txtText = new JTextField();
		txtText.setBackground(new Color(153, 204, 102));//green
		txtText.setText("password:");
		txtText.setEditable(false);
		frame.getContentPane().add(txtText, BorderLayout.CENTER);
		txtText.setColumns(10);
		for(int i = 5; i < 8; i++) {
			String uuid = UUID.randomUUID().toString().toUpperCase();
			txtText.setText("password:" + uuid);
			}
		
		JButton btn1 = new JButton("exit");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		frame.getContentPane().add(btn1, BorderLayout.SOUTH);
		
		btnOntop = new JButton("OnTop");
		btnOntop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setAlwaysOnTop(true);
				txtText.setBackground(new Color(176,224,230)); //light blue
			}
		});
		frame.getContentPane().add(btnOntop, BorderLayout.EAST);
		
		btnNewButton = new JButton("New password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uuid = UUID.randomUUID().toString().toUpperCase();
				txtText.setText("password:" + uuid);
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
	}

}
