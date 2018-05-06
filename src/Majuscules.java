/**
 * @author Farid Mohamed Hassan
 */


import java.util.Scanner;

public class Majuscules {

	
	public static void conversion(){
		System.out.println("Saisissez votre mot : ");
		Scanner clavier = new Scanner(System.in);
		String s = clavier.nextLine();
		System.out.println("Saisisez la lettre que vous voulez convertir en majuscule");
		char lettre = clavier.next().charAt(0);
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==lettre){
				char c = Character.toUpperCase(s.charAt(i));
				s = s.replace(s.charAt(i), c);
			}
		}
		
	    System.out.println("votre mot converti est : "+ s);
	}
	
	
	public static void main(String[] args) {
		conversion();
	}
}
