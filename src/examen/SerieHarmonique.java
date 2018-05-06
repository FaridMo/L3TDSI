/*
 * @author Farid Mohamed Hassan
 */
package examen;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SerieHarmonique {
	static Scanner clavier = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	public static void main(String[] args) {
		int essai = 0;
		double somme = 0;
		System.out.println("Veuillez saisir un nombre entier strictement positif compris entre 1 et 100");
		int nombre = clavier.nextInt();
		while (nombre > 100 || nombre < 1 || nombre < 0 ) {
			essai++;
			if (essai == 5) {
				clavier.close();
				System.exit(0);
			}
			System.out.println("Réessayez ! \nIndice : nombre>0 et 1<nombre<100 ");
			nombre = clavier.nextInt();

		}
		for (double i = 1; i <= nombre; i++) {
			somme+=(1/i);
		}
		System.out.println("### Somme harmonique ==>  " + somme);
	}

	
	
}
