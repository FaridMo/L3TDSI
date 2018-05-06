
public class TableauDimensions {

	public static void main(String[] args) {
		
		String a = "bonjour";
		String b = "bonsoir";
		
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='o'){
				char c = Character.toUpperCase(a.charAt(i));
				a = a.replace(a.charAt(i), c);
			}
		}
		System.out.println(a);
		
	}
}
