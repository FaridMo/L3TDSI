import java.util.*;
public class TriString {
	
	private  static String [ ] triTabChaine (String tab []){
		for(int i=0;i<tab.length;i++){
			for(int j=i+1;j<tab.length;j++){
				if(tab[j].compareTo(tab[i])<0){
					String tmp;
					tmp=tab[i];
					tab[i]=tab[j];
					tab[j]=tmp;
				}
//				Arrays.sort(tab,Collections.reverseOrder());
			}
		}
		
		return tab;
	}
	
	private static void afficheTabTri (String tab[]){
//		System.out.println(triTabChaine(tab));
		for(int i=0;i<tab.length;i++){
			System.out.println(tab[i]);
		}
	}
	
	private static void echange (String t[] ,int i, int j){
		
	}
	
	public static void main(String[] args) {
		String[] tableau={"yaya","mohamed","hasan","zoro"};
		
	TriString.afficheTabTri(triTabChaine(tableau));
		
	}
}
