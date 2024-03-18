package demxième_ètude_de_cas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

import premier_étude_de_cas.Enforcement;
import premier_étude_de_cas.Monitoring;
import premier_étude_de_cas.Output;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Interface2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 window = new Interface2();
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
	public Interface2() {
	  // Jf.main(null);
		initialize();
	}
	public  class Jfream extends JFrame   {
		
		
		//JButton button;
		Jfream (){
		 
			setSize(500,800);
			setTitle("\"1er cas d ètude\"");
			setBounds(0,0, 500, 800);
			//add(background);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(true);
			
			Ggraphics panel = new Ggraphics();
		    add(panel);
		    //add(button);
	}
	}
		public class Ggraphics extends JPanel {
			int j =0;
			int x=0;
			 int vg =Integer.parseInt(textField.getText());
			 public void paint(Graphics g) {
				  super.paint(g);
				  
//				  Image image = new ImageIcon("2em.png").getImage();
//				   g.drawImage(image,0,0,600,600,null);
				  // Image image1 = new ImageIcon("40.png").getImage();
				  // g.drawImage(image1,410,235,30,80,null);
				  
				   g.setColor(Color.BLACK);
					  g.fillRect(100,0,300,800);
					
					  g.setColor(Color.decode("#7CFC00"));  
					  g.fillRect(0,0,100,800);
					  g.setColor(Color.decode("#7CFC00"));
					  g.fillRect(400,0,300,800);
					  g.setColor(Color.WHITE);
					  
			      g.fillRect(250,0,9,800);
			      g.setColor(Color.red);
			      g.fillOval(280,400, 100, 100);
			      g.setColor(Color.white);
			      g.fillOval(290,410, 80, 80);
			      g.setColor(Color.black); g.setFont(new Font(" ",Font.PLAIN,45));
				  g.drawString(" 40 ", 293, 463);
				  g.setColor(Color.red);
				  g.fillRect(260,350,140,9);
				  g.setColor(Color.red);
				  g.fillRect(260,150,140,9);
				 
				  g.setColor(Color.GRAY);
				  g.fillRect(299,640-j,50,70);
				  for(int i=0;i<20;i++) {
					  j++;  
					  repaint();
					//  setIgnoreRepaint(false);
					 
				    
			 }
				  axe(vg);
		
		}
			  public void axe( int s) {
			      int cat=speed(s);
			   if (cat<=5) {
				     if (cat==1) {
				    	 try { Thread.sleep(200);
						  
						  } catch (Exception e) {
						  
						  }
				    	
				    
				     }
				     }
				     if(cat==2){
				    	 try { Thread.sleep(150);
						  
						  } catch (Exception e) {
						  
						  }
				    	 }
				     
				     if(cat==3){
				    	 try { Thread.sleep(100);
						  
						  } catch (Exception e) {
						  
						  }
					     }
				     if(cat==4){
				    	 try { Thread.sleep(50);
						  
						  } catch (Exception e) {
						  
						  }
					     }
				     if(cat==5){
				    	 
				    	 try { Thread.sleep(10);
						  
						  } catch (Exception e) {
						  
						  }
							
					     }
			   }
			 
				
				  
			  
		}
	
	
	  public int speed(int x) {
	  if(x<180) {
		  if (x>=1 && x<=50) {
			   return 1;
		  }
		  if(x>=51 && x<=80) {
			  return 2;
		  }
		  if(x>=81 && x<=100) { 
			  return 3;	
		  }
		 if(x>=101 && x<=150) { 
				  return 4;	
		 }
		 if(x>=151 && x<=180) { 
					  return 5;	
		 }
	  }else
		  return 6;
	  
	return 0;
		  
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frame.setBounds(500, 100, 666, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(195, 0, 455, 477);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(0, 100, 309, 172);
		panel.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon(Interface2.class.getResource("/demxi\u00E8me_\u00E8tude_de_cas/lib2em/ggggg.png")));
		
		JLabel lblNewLabel_2 = new JLabel("speed:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(38, 75, 46, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("rainny:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(25, 310, 89, 20);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(317, 209, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(209, 360, 86, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_5 = new JLabel("km/h");
		lblNewLabel_5.setBounds(458, 111, 28, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("mm");
		lblNewLabel_6.setBounds(458, 223, 36, 14);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_3 = new JButton("Restart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Copie1.instanse1.lb.setText(textField.getText());
				Copie1.instanse1.lb6.setText(textField_3.getText());
				//date Copie.instanse.lb3.setText(textField.getText());
			}
		});
		btnNewButton_3.setBounds(327, 27, 89, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton(">");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monitoring1 M1  = new Monitoring1();
				
				  Enforcemont1 E1 = new  Enforcemont1();
				  E1.main(null);
			int t[] =	M1.informationR(Integer.parseInt(textField.getText()), Integer.parseInt(textField_3.getText()));
			
				double[] x=E1.function(t);
				//System.out.println(x[0]);
				//String s = String.valueOf(10);
				new Output1().frame.setVisible(true);
				 DecimalFormat df1 = new DecimalFormat("#.00");
			        String s = df1.format(x[0]);
			        String s1 = df1.format(x[1]);
			        double rus=(x[1]-x[0]);
			        String s6 = df1.format(rus);
			        Output1.instanse.lb.setText(s);
					Output1.instanse.lb1.setText(s1);
					Output1.instanse.lb2.setText(s6);
			        
			}
		});
		btnNewButton.setBounds(327, 430, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Interface2.class.getResource("/demxi\u00E8me_\u00E8tude_de_cas/lib2em/rainy.png")));
		lblNewLabel_4.setBounds(97, 341, 74, 58);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7_1 = new JLabel("mm");
		lblNewLabel_7_1.setBounds(327, 351, 63, 14);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("km/h");
		lblNewLabel_7_2.setBounds(413, 212, 63, 14);
		panel.add(lblNewLabel_7_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 196, 477);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("PV");
		btnNewButton_2.setBounds(72, 422, 86, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("RUN\r\n");
		btnNewButton_1.setBounds(72, 448, 86, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 196, 477);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Interface2.class.getResource("/demxi\u00E8me_\u00E8tude_de_cas/lib2em/R (2) (1).png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Jfream().setVisible(true);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Copie1().frame.setVisible(true);
			}
		});
	}
}
