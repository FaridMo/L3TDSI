/*
 * @author Farid Mohamed Hassan
 */
package examen;

import java.util.Scanner;

public class ExisteMotDansListe {

	static Scanner clavier = new Scanner(System.in);
	public static boolean existeDans(String mot, String[] liste){
		boolean resultat = false;
		
		for(int i=0;i<liste.length;i++){
			if(liste[i].contentEquals(mot)){
				resultat = true;
			}
		}
		return resultat;
	}
	
	
	public static void main(String[] args) {
		
		String[] maListe ={"farid","mohamed","hassan","cherif","mamadou","kasse","ballon"};
		System.out.println("### BIENVENUS ###");
		System.out.println("Saisissez votre mot : ");
		String mot = clavier.nextLine();
		System.out.println(existeDans(mot, maListe));
	}
}
