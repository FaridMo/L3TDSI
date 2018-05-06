
import java.util.Arrays;
import java.util.Collections;
public class TestTri {

	
	public static void main(String[] args) {
		
		String tab[] = {"farid","mohamed","hassan","kasse","mamadou","cherif"};
		
		System.out.println("tableau avant le tri");
		for(String string : tab){
			  System.out.println(string);
		}
		
		Arrays.sort(tab);
		
		System.out.println("\n\n\ntableau apr�s le tri");
		for(String string :tab){
			System.out.println(string);
		}
		
		System.out.println("\n\n\ntableau apr�s le tri inverse");
		
		Arrays.sort(tab,Collections.reverseOrder());
		
		for(String string : tab){
			System.out.println(string);
		}
		
		
	}

}
