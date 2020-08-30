package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplejackandStorages {

public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		ArrayList<Integer> size = new ArrayList<>();
		ArrayList<Integer> quantity = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			int newPlank = ent.nextInt();
			if (size.indexOf(newPlank) == -1) {
				size.add(newPlank);
				quantity.add(1);
			} else {
				int ii = size.indexOf(newPlank);
				quantity.set(ii, quantity.get(ii)+1);
			}
		}
		System.out.println(size);
		System.out.println(quantity);
		
		int q = ent.nextInt();
		
		for (int i=0; i<q; i++) {
			char operation = ent.next().charAt(0);
			
			if (operation == '+') {
				int plank = ent.nextInt();
				
				if (size.indexOf(plank) == -1) {
					size.add(plank);
					quantity.add(1);
				} else {
					int ii = size.indexOf(plank);
					quantity.set(ii, quantity.get(ii)+1);
				}
				
				System.out.println(size);
				System.out.println(quantity);
				
				System.out.println(checker(quantity));
			} else if (operation == '-') {
				int plank = ent.nextInt();
				int ii = size.indexOf(plank);
				quantity.set(ii, quantity.get(ii)-1);
				
				System.out.println(size);
				System.out.println(quantity);
				
				System.out.println(checker(quantity));
			}
		}
	}
	
	public static String checker (ArrayList<Integer> array2) {
		String parcialBuild = "NO";
		String finalBuild = "NO";
		
		System.out.println(array2);
		
		for (int i=0; i<array2.size(); i++) {
			if (array2.get(i) >= 4) {
				array2.set(i, array2.get(i) - 4);
				parcialBuild = "YES";
				break;
			}
		}
		
		for (int i=0; i<array2.size() && parcialBuild == "YES"; i++) {
			if (array2.get(i) >= 2) {
				array2.set(i, array2.get(i) - 2);
				for (; i<array2.size(); i++) {
					if (array2.get(i) >= 2) {
						array2.set(i, array2.get(i)-2);
						finalBuild = "YES";
						break;
					}
				}
				break;
			}
		}
		System.out.println(array2);
		return finalBuild;
	}
}
