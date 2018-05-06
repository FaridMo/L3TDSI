package $;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public  class faridmo extends JFrame implements ActionListener{

	JLabel jlabel = new JLabel("Nom : ");
	JTextField jtext = new JTextField(12);
	JButton bouton1 = new JButton("Ajouter");
	JButton bouton2 = new JButton("Supprimer");
	JButton bouton3 = new JButton("Déplacer");
 	List liste1 = new List();
	List liste2 = new List();
	public faridmo(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel panneau1 = new JPanel();
		panneau1.setLayout(new FlowLayout());
		panneau1.add(jlabel);
		panneau1.add(jtext);
		panneau1.add(bouton1);
		panneau1.add(bouton2);
		panneau1.add(bouton3);
		
		this.add(panneau1,BorderLayout.NORTH);
		
		JPanel panneau2 = new JPanel();
		panneau2.setLayout(new GridLayout());
		panneau2.add(liste1);panneau2.add(liste2);
		
		this.add(panneau2,BorderLayout.CENTER);
		
		bouton1.addActionListener(this);
		bouton2.addActionListener(this);
		bouton3.addActionListener(this);
		this.setVisible(true);
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		}
	
	public static void main(String[] args) {
		new faridmo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bouton1){
			if(!jtext.getText().isEmpty()){
				String chaine = jtext.getText();
				liste1.add(chaine);
				jtext.setText("");
			}
		}
		if(e.getSource() == bouton2){
			int index = liste1.getSelectedIndex();
			liste1.remove(index);
		}
		
		if(e.getSource()==bouton3){
			int index = liste1.getSelectedIndex();
			String chaine = liste1.getSelectedItem();
			liste1.remove(index);
			liste2.add(chaine);
		}
	}

}
