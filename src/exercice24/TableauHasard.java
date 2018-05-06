package exercice24;


import java.util.Scanner;

public class TableauHasard {
		
	public static int[]  creationTableau(){
		Scanner clavier = new Scanner(System.in);
		int nombre =(int)(Math.random()*100);
		
		int[] tableau = new int[nombre];
			for(int i=0;i<tableau.length;i++){
				tableau[i]=nombre;
				nombre--;
			}
		return tableau;
	}
	
	
	public static void afficheTableau(int[] t){
//		for(int i=0;i<t.length;i++){
//			System.out.println(t[i]);
//		}
		
		for(int nv : t){
			System.out.println(nv);
		}
	}
	
	
	public static int[] triDesc(int[] tab){
		int[] tabInv = new int[tab.length];
		for(int i=tab.length-1;i>=0;i--){
			tabInv[tab.length-i-1]=tab[i];
		}
		return tabInv;
	}
	public static void main(String[] args) {
		afficheTableau(triDesc(creationTableau()));
	}
}
