/*
 * @author Farid Mohamed Hassan
 */
package examen;
import examen.RechercheChaine;
import java.util.Scanner;

public class Exercice5 {

	static Scanner clavier = new Scanner(System.in);
	
	
	static int extraireSousChaine(String chaine, String sousChaine){
		int compteur =0;
		
		for(int i=0;i<chaine.length();i++){
			if(chaine.contains(sousChaine)){
				compteur++;
			}
		}
		
		return compteur;
	}
/*
	 public static String extraireSousChaine(String chaine, char debut, char fin) {
	      int indexDebut;
	      int indexFin;
	      String sousChaine = null;

	      if (chaine != null) {
	         indexDebut = chaine.indexOf(debut);
	         if (indexDebut != -1) {
	            indexFin = chaine.indexOf(fin, indexDebut + 1);
	            if (indexFin != -1) {
	               sousChaine = chaine.substring(indexDebut + 1, indexFin);
	            }
	         }
	      }
	      return sousChaine;
	   }
*/	
	static int[] extraireChiffres (String s){
		int[] chiffre ={0,1,2,3,4,5,6,7,8,9};
		int [] stock = null;
		int compteur = 0;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<chiffre.length;i++){
				if(s.charAt(i)==chiffre[j]){
					compteur++;
				}
			}
		}
		return stock;
	}
	public static void main(String[] args) {

		System.out.println("entrez");
		String chaine = clavier.nextLine();
//		System.out.println("entrez");
//		String sousChaine=clavier.nextLine();
		
//		System.out.println("le nombre de fois que la chaine + ' "+sousChaine+" 'apparaît est : \n"
//				+ extraireSousChaine(chaine, sousChaine) + " fois ");
//		
//		
		
		System.out.println(extraireChiffres(chaine));
	}
	
}
