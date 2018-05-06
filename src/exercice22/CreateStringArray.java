package exercice22;

import java.util.StringTokenizer;

public class CreateStringArray {

	public static String[] arrayFromString(String s){
		StringTokenizer st = new StringTokenizer(s," ");
		int compt = st.countTokens();
		int i=0;
		String[] chaineTab = new String[compt];
		while(st.hasMoreTokens()){
			chaineTab[i]=st.nextToken();
			i++;
		}
		
		return chaineTab;
	}
	
	public static void affiche(String[] t){
		for(int i=0;i<t.length;i++){
			System.out.println(t[i]);
		}
	}
	public static void main(String[] args) {
		affiche(arrayFromString("farid mohamed hassan"));
	}
}
