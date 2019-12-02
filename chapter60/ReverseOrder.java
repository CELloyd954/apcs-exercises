public class ReverseOrder {
		
		public static void main ( String[] args )
  		{
    		int[] val = {0, 1, 2, 3}; 
 
    		System.out.println( "Original Array: " 
    		    + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
 			int[] newVal = new int[4];
     		for (int temp = 0; temp <= 3; temp++) {
    			newVal[temp] = val[3 - temp];
    		}

   			 System.out.println( "Reversed Array: " 
        		+ newVal[0] + " " + newVal[1] + " " + newVal[2] + " " + newVal[3] );

		}
}