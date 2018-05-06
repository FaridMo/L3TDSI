
public class testTabInverse {

	public static int[] inverseTab(int[] t){
		int tableau[] = new int[t.length];
		for(int i=t.length-1;i>=0;i--){
			tableau[t.length-i-1]=t[i];
		}
		return tableau;
	}
	
	public static void affiche(int t[]){
		for(int i=0;i<t.length;i++){
			System.out.println(t[i]+ " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int tableau[] = {1,2,3,4,5,6,7,8};
		
		affiche(inverseTab(tableau));	}
}
