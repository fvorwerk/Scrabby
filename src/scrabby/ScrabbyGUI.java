package scrabby;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;

import java.util.*;

public class ScrabbyGUI extends JFrame {
	
	String wort = "";
	int clicks = 0;

	private JPanel contentPane;
	private JTextField textField;
	private ScrabbyLogik sl;
	
	
	
	

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
				
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrabbyGUI frame = new ScrabbyGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	/**
	 * Create the frame.
	 * @param scrabbyLogik 
	 */
	
	public ScrabbyGUI(ScrabbyLogik sl) {
		
		this();
		this.sl = sl;
		
		
	}
	
	
	public ScrabbyGUI() {
		

		

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(149, 165, 166));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		contentPane.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
				String bst = Character.toString(e.getKeyChar());
				bst = bst.toUpperCase();
				
				// if (button1.getText() == bst){
					
					

				
			}
			
			
		});


		
		JLabel lblWort = new JLabel("Wort:");
		lblWort.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblWort.setBounds(10, 74, 52, 35);
		contentPane.add(lblWort);
		
		JButton button1 = new JButton("S");
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(52, 73, 94));
		button1.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblWort.setText("Bitch Lasagna!");
				wort = wort + button1.getText();
				clicks ++;
				
				textField.setText(wort);
				
				button1.setEnabled(false);
				
				
			}
		});
		button1.setBounds(10, 11, 52, 52);
		contentPane.add(button1);
		
		JButton button2 = new JButton("C");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = wort + button2.getText();
				clicks ++;
				
				textField.setText(wort);
				
				button2.setEnabled(false);
				
			}
		});
		button2.setForeground(Color.WHITE);
		button2.setBackground(new Color(52, 73, 94));
		button2.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button2.setBounds(72, 11, 52, 52);
		contentPane.add(button2);
		
		JButton button3 = new JButton("R");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = wort + button3.getText();
				clicks ++;
				
				textField.setText(wort);
				button3.setEnabled(false);
				
			}
		});
		button3.setForeground(Color.WHITE);
		button3.setBackground(new Color(52, 73, 94));
		button3.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button3.setBounds(134, 11, 52, 52);
		contentPane.add(button3);
		
		JButton button4 = new JButton("A");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = wort + button4.getText();
				clicks ++;
				
				textField.setText(wort);
				button4.setEnabled(false);
				
			}
		});
		button4.setForeground(Color.WHITE);
		button4.setBackground(new Color(52, 73, 94));
		button4.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button4.setBounds(199, 11, 52, 52);
		contentPane.add(button4);
		
		JButton button5 = new JButton("B");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = wort + button5.getText();
				clicks ++;
				
				textField.setText(wort);
				button5.setEnabled(false);
				
			}
		});
		button5.setBackground(new Color(52, 73, 94));
		button5.setForeground(Color.WHITE);
		button5.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button5.setBounds(261, 11, 52, 52);
		contentPane.add(button5);
		
		JButton button6 = new JButton("B");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = wort + button6.getText();
				clicks ++;
				
				textField.setText(wort);
				button6.setEnabled(false);
				
				
				
			}
		});
		button6.setBackground(new Color(52, 73, 94));
		button6.setForeground(Color.WHITE);
		button6.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button6.setBounds(323, 11, 52, 52);
		contentPane.add(button6);
		
		JButton button7 = new JButton("Y");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = wort + button7.getText();
				clicks ++;
				
				textField.setText(wort);
				button7.setEnabled(false);
				
			}
		});
		button7.setBackground(new Color(52, 73, 94));
		button7.setForeground(Color.WHITE);
		button7.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		button7.setBounds(385, 11, 52, 52);
		contentPane.add(button7);
		
		
		JLabel lblPunkte = new JLabel("Punkte:");
		lblPunkte.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblPunkte.setBounds(10, 187, 211, 42);
		contentPane.add(lblPunkte);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField.setBounds(82, 75, 355, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAuswerten = new JButton("Wort auswerten");
		btnAuswerten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sl.punkteBerechen1(wort);
				
				//lblPunkte.setText("Punkte: " + wort);
				

				
				 
				
				
				
			}
		});
		btnAuswerten.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnAuswerten.setBackground(new Color(46, 204, 113));
		btnAuswerten.setBounds(10, 134, 211, 42);
		contentPane.add(btnAuswerten);
		
		JButton btnNeu = new JButton("Neue Buchstaben");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = "";
				textField.setText(wort);
				
				
				char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
				StringBuilder sb = new StringBuilder();
				Random random = new Random();
				
				for (int q = 0; q <= 10; q++) {
					
					
					for (int i = 0; i < 20; i++) {
					    char c = chars[random.nextInt(chars.length)];
					    sb.append(c);
					}
					
				}
					
					
					
				
				
				
				String output = sb.toString();
				
				button1.setText(Character.toString(output.charAt(0)));
				button2.setText(Character.toString(output.charAt(1)));
				button3.setText(Character.toString(output.charAt(2)));
				button4.setText(Character.toString(output.charAt(3)));
				button5.setText(Character.toString(output.charAt(4)));
				button6.setText(Character.toString(output.charAt(5)));
				button7.setText(Character.toString(output.charAt(6)));
				
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				
				
				
			}
		});
		btnNeu.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnNeu.setBackground(new Color(52, 152, 219));
		btnNeu.setBounds(227, 187, 211, 42);
		contentPane.add(btnNeu);
		
		JButton btnLoeschen = new JButton("Buchstaben l\u00F6schen");
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				wort = "";
				textField.setText(wort);
				
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				
			}
		});
		btnLoeschen.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		btnLoeschen.setBackground(new Color(231, 76, 60));
		btnLoeschen.setBounds(226, 134, 211, 42);
		contentPane.add(btnLoeschen);
		
		JCheckBox cbBehalten = new JCheckBox("behalten");
		cbBehalten.setBackground(new Color (149, 165, 166));
		cbBehalten.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		cbBehalten.setBounds(227, 236, 97, 23);
		contentPane.add(cbBehalten);
		
	
		
		button1.setFocusPainted(false);
		button2.setFocusPainted(false);
		button3.setFocusPainted(false);
		button4.setFocusPainted(false);
		button5.setFocusPainted(false);
		button6.setFocusPainted(false);
		button7.setFocusPainted(false);
		btnLoeschen.setFocusPainted(false);
		btnNeu.setFocusPainted(false);
		btnAuswerten.setFocusPainted(false);
		
	}
}
