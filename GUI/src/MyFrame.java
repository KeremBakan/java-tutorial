import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
	JLabel label = new JLabel();
	Border border = BorderFactory.createLineBorder(Color.green, 3);
	MyFrame(){
		this.setTitle("First GUI Application");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420);
		ImageIcon image = new ImageIcon("kerby.jpg");
		label.setText("Is this working?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.magenta);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		//label.setIconTextGap(-20);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0,0,300,300);
		//this.setLayout(null);
		this.add(label);
		this.setVisible(true);
		this.pack();
		
		ImageIcon icon = new ImageIcon("kerby.jpg");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(189, 236, 182));
	}
	
	
}
