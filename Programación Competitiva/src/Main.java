import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);
		String s = ent.next();
		byte i = 0;
		
		while (s.charAt(i) == s.charAt(s.length()-1-i) && i < s.length()-1) {
			i++;
		}
		
		if (i == s.length()-1) {
			byte ii = 0;
			while (s.charAt(s.length()-1) == s.charAt(ii) && ii < s.length()-1){
				ii++;
			}
			
			if (ii == s.length()-1) {
				System.out.println(0);
			} else {
				System.out.println(s.length()-1);
			}
		} else {
			System.out.println(s.length());
		}
	}
}