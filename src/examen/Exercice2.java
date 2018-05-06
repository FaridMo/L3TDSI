/*
 * @author Farid Mohamed Hassan
 */

package examen;
import static java.lang.Math.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercice2 {
		static Scanner clavier = new Scanner(System.in);
		static double resultat,x1,x2;
		static DecimalFormat df = new DecimalFormat("#.##");
	public static void calculRacine(){
		System.out.println("### Programme calculant une équation du 2nd dégré : ax²+bx+c ###");
		System.out.println("Entrez l'entier a : ");
		int a = clavier.nextInt();
		System.out.println("Entrez l'entier b : ");
		int b = clavier.nextInt();
		System.out.println("Entrez l'entier c : ");
		int c = clavier.nextInt();
		double delta = pow(b,2)- (4*a*c);
		if(a==0){
			System.out.println("l'équation n'est pas du seconde dégré !");
		}
		else{
			if(delta == 0){
				System.out.println("l'équation n'admet aucune solution !");
			}
			if(delta<0){
				System.out.println("l'équation admet qu'une seule solution : ");
				System.out.println("x = \n"+df.format(((-b))/(2*a)));
			}
			if(delta>0){
				x1=(-b-(sqrt(delta)))/(2*a);
				x2=(-b+(sqrt(delta)))/(2*a);
				System.out.println("le système admet deux solutions [x1] et [x2] : \n"
						+ "x1 = "+ df.format(x1)+"\n"
						+"x2 = "+ df.format(x2) +"\n");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	calculRacine();
	}
}
