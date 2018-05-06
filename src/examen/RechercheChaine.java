/*
 * @author Farid Mohamed Hassan
 */
package examen;

import java.util.Scanner;

public class RechercheChaine {
	static Scanner clavier = new Scanner(System.in);
	
	
	static boolean trouveChaine(String chaine,String chainerecherche){
		boolean resultat = false;
		for(int i=0;i<chaine.length();i++){
			if(chaine.contains(chainerecherche)){
				resultat = true;
			}
		}
		
		
		return resultat;
	}
	
	public static void main(String[] args) {
		System.out.println("Saisissez votre phrase : ");
		String chaine = clavier.nextLine();
		System.out.println("Saisissez la chaine que vous recherchiez : ");
		String chainerecherche= clavier.nextLine();
		
		if(trouveChaine(chaine, chainerecherche) == true){
			System.out.println("vrai ! votre chaine fait partie de la phrase ");
		}
		if(trouveChaine(chaine, chainerecherche) == false){
			System.out.println("Faux ! votre chaine ne fait pas partie de la phrase ");
		}
		
	}
}
