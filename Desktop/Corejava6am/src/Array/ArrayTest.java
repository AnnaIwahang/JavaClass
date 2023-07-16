package Array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
		int age[] = new int[5];
		
		/* 
		 *  0  1  2  3  4
		 *  [] [] [] [] []
		 *   <---age--->
		 */
		
		//write data in array
		//for dynamic
		Scanner sc = new Scanner(System.in);
			
		
		for(int i=0; i<age.length; i++) {
			System.out.println("Enter your age ");
			//age[i] = 20;
			age[i] = sc.nextInt();
		}
		//read data from array
		for(int x:age) {
			System.out.println(x);
			
		}
	}

}
