package Array;

import java.util.Scanner;

public class ArrayPractice {
	//q1. Calculate the total an average price of 10 books.
	/*
	 * q2. Subject     Marks
	 *     -------     -----
	 *     Math         99
	 *     English      90
	 *     ....         ..
	 *     ......       ..
	 *     ....         ...
	 *     ------------------
	 *     Total    =   ?
	 *     average  =   ?
	 *     ------------------
	 */
	
	public static void main(String[] args) {
		
		int BookPrice[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int Total = 0;
		int Avg = 0;
		for(int i=0; i<BookPrice.length; i++) {
			System.out.println("Enter the price of book ");
			BookPrice[i] = sc.nextInt();
			
		}
		for(int UnitPrice:BookPrice) {
			Total += UnitPrice;
		}
		
		Avg = Total/BookPrice.length;
		System.out.println("Total price of all book = "+Total);
		System.out.println("Average price of all book = "+Avg);
		
		sc.close();
	}

}
