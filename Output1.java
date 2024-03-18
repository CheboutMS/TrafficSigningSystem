package demxième_ètude_de_cas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import premier_étude_de_cas.Output;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Output1 {
	public static Output1 instanse ;
	public JFrame frame;
	public JLabel lb;
	public JLabel lb1;
	public JLabel lb2;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_3_1;
	public JLabel lblNewLabel_3_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Output1 window = new Output1();
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
	public Output1() {
		initialize();
		instanse=this;
		lb = lblNewLabel_3;
		lb1=lblNewLabel_3_1;
	    lb2=lblNewLabel_3_2;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 443);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(0, 0, 706, 404);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBackground(new Color(152, 251, 152));
		lblNewLabel_7.setIcon(new ImageIcon(Output1.class.getResource("/demxi\u00E8me_\u00E8tude_de_cas/lib2em/ggggg.png")));
		lblNewLabel_7.setBounds(329, 182, 309, 185);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("punishement");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(338, 26, 103, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("reward");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(484, 32, 86, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("r\u00E8sulta");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(620, 32, 76, 14);
		panel.add(lblNewLabel_2);
		
		 lblNewLabel_3 = new JLabel("vide");
		lblNewLabel_3.setBounds(354, 97, 68, 14);
		panel.add(lblNewLabel_3);
		
		 lblNewLabel_3_1 = new JLabel("vide");
		lblNewLabel_3_1.setBounds(484, 97, 68, 14);
		panel.add(lblNewLabel_3_1);
		
	  lblNewLabel_3_2 = new JLabel("vide");
		lblNewLabel_3_2.setBounds(620, 97, 68, 14);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Output1.class.getResource("/demxi\u00E8me_\u00E8tude_de_cas/lib2em/jpg-removebg-preview.png")));
		lblNewLabel_4.setBounds(-109, -25, 437, 406);
		panel.add(lblNewLabel_4);
	}
}
