package $;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestSwing extends JFrame implements ActionListener{
	
	JLabel jlabel = new JLabel("nom : ");
	JTextField jtext = new JTextField(12);
	
	JButton b1 = new JButton("Ajouter");
	JButton b2 = new JButton("Supprimer");
	JButton b3 = new JButton("Déplacer");
	
	List liste1 = new List();
	List liste2 = new List();
	
	public TestSwing(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(jlabel);
		p1.add(jtext);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		this.add(p1,BorderLayout.NORTH);
		
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout());
		p2.add(liste1);
		p2.add(liste2);
		
		this.add(p2, BorderLayout.CENTER);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new TestSwing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			if(!jtext.getText().isEmpty()){
				String chaine = jtext.getText();
				liste1.add(chaine);
				jtext.setText("");
			}
		}
		
		if(e.getSource() == b2){
			int index = liste1.getSelectedIndex();
			int index2 = liste2.getSelectedIndex();
			
				
			
		}
		
		if(e.getSource() == b3){
			int index = liste1.getSelectedIndex();
			liste2.add(liste1.getItem(index));
			liste1.remove(index);
		}
	}
}
