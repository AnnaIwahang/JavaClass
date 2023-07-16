package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraywithMethod {
	
	/*
	 * ============= Array With Method ============
	 * 1> Array as parameter/argument:
	 *    void sum(int a[]) {
	 *    }
	 *    sum(array);
	 * 2> Array as return type: 
	 * 
	 *    int[] getValue() {
	 *      //return =  900, 600, 400, 500, 300;
	 *      
	 *      return array;
	 *      }
	 */ 
	
	public static void main(String[] args) {
		
		int data[] = {89, 76, 54, 32, 46, 78, 94};
		add(data);
		int[] odds = getoddnums1to100();
		System.out.println(Arrays.toString(odds));
		add(odds);
		
		printArray(new String[] {"anna", "ball", "cat", "dog"});
		//printArray(getStringArray());

		
	}
	//============ array as argument ===========
			static void add(int values[]) {
				
				int s = 0;
				
				for(int x : values) {
					s = s + x;
					
					
				}
				System.out.println("Total = "+ s);
			}
			
   //============= array as return type ===========
			static int[] getoddnums1to100() {
				
				int oddnums[] = new int[50];
				
				int j = 0;
				
				for(int i=1; i<=100; i++) {
					if(i%2 != 0) {
						oddnums[j] = i;
						j++;
					}
				}
				return oddnums;
			}
			
			//String array
			
			static void printArray(String array[]) {
				System.out.println(Arrays.toString(array));
			}
			static String[] getStringArray() {
				String[] array = {"anna", "ball", "cat", "dog"};
				return array;
				
			}
			

}
