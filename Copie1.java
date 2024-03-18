package demxième_ètude_de_cas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Copie1 extends javax.swing.JFrame{
     public static Copie1 instanse1 ;
	public JFrame frame;
	
	public JLabel lb;
	
	public JLabel lb3;

	
	public JLabel lb6;
	public JLabel lblNewLabel_6;
	public JLabel lblNewLabel_6_3;
	public JLabel lblNewLabel_6_2_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Copie1 window = new Copie1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Copie1() {
		initialize();
		instanse1=this;
		lb = lblNewLabel_6;
	    lb3=lblNewLabel_6_3;
	    lb6=lblNewLabel_6_2_3;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100,100, 450, 423);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 434, 384);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("v\u00E8hicules :");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(27, 11, 79, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("peugeot301 gris 2007 :");
		lblNewLabel_1.setBounds(27, 36, 147, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("km/h");
		lblNewLabel_2.setBounds(288, 36, 32, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("la date :");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(27, 123, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("condition:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(27, 196, 65, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(27, 221, 39, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("il est interdit de d\u00E8passer la limite de vitesse de 40");
		lblNewLabel_1_1_2.setBounds(84, 221, 312, 14);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("taux de precipitation:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(27, 296, 173, 14);
		panel.add(lblNewLabel_5);
		
		 lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(240, 36, 32, 14);
		panel.add(lblNewLabel_6);
		
		 
		
		 lblNewLabel_6_3 = new JLabel("");
		lblNewLabel_6_3.setBounds(116, 150, 126, 14);
		panel.add(lblNewLabel_6_3);
		
		
		
		 
		 lblNewLabel_6_2_3 = new JLabel("");
		lblNewLabel_6_2_3.setBounds(168, 319, 52, 14);
		panel.add(lblNewLabel_6_2_3);
		
		JLabel lblNewLabel_6_2_4 = new JLabel("mm");
		lblNewLabel_6_2_4.setBounds(240, 319, 32, 14);
		panel.add(lblNewLabel_6_2_4);
	}

	
}
