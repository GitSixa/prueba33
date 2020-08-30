package ejercicios;

import java.util.Arrays;
import java.util.Scanner;
public class FindTheBone { // Find The Bone by Codeforces

public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		int m = ent.nextInt();
		int k = ent.nextInt();
		int[] holes = new int[m];
		int tempBone1;
		int tempBone2;
		
		for (int i=0; i<m; i++) {
			holes[i] = ent.nextInt();
		}
		
		Arrays.sort(holes);
		int bone = 1;
		
		for (int i=0; i<k; i++) {
			if (Arrays.binarySearch(holes, bone) > -1) {
				break;
			}
			
			tempBone1 = ent.nextInt();
			tempBone2 = ent.nextInt();
			
			if (tempBone1 == bone) {
				bone = tempBone2;
			} else if (tempBone2 == bone) {
				bone = tempBone1;
			}
			else {
				continue;
			}
		}
		
		System.out.println(bone);
	}

}