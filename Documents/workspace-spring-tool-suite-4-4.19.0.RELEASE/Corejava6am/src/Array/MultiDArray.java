package Array;

public class MultiDArray {
	
	/*
	 * ============= Multi Dimension Array ===========
	 * # use to store and processing data in rows and cols form/matrix/table
	 * 
	 * syntax:
	 *  
	 *  data_type array_name[] = new data_type[row] [col];
	 *  
	 */
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		//write data in array
		//for dynamic write scanner here
		 for(int i=0; i<2; i++) {
			 for(int j=0; j<2; j++) {
				 mat[i][j] = 500;
				 
			 }
		 }
		 
		//read data in array
		 for(int i=0; i<2; i++) {
			 for(int j=0; j<2; j++) {
				 System.out.print(mat[i][j]+ " ");
				 
			 }
			 
			 System.out.println();
		 }
		
	}

}
