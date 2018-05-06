package $;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Farid extends JFrame implements ActionListener {
	
	JLabel jl = new JLabel("Noms :");
	JTextField jt = new JTextField(12);
	
	JButton b1 = new JButton("Ajouter");
	JButton b2 = new JButton("Supprimer");
	
	List liste1 = new List();
	List liste2 = new List();
	
	public Farid(){
		this.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		
		jp1.setLayout(new FlowLayout());
		
		jp1.add(jl);
		jp1.add(jt);
		jp1.add(b1);
		jp1.add(b2);
		this.add(jp1,BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout());
		jp2.add(liste1);
		jp2.add(liste2);
		
		b1.addActionListener(this);
		
		this.add(jp2,BorderLayout.CENTER);
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Farid();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			String chaine = jt.getText();
			liste1.add(chaine);
		}
	}
	
}
