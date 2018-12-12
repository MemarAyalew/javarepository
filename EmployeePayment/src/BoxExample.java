
public class BoxExample {

	public static void main(String[] args) {
		int sum = 0;
		
	  /* for ( int i = 1;  i < 20 ;  i = i +2)  {
		     sum = sum + i; 
		     
		     System.out.println(i);
		     */
		     
		     for ( int i = 1;  i < 20 ;  i ++)  {
				  
				   if ( i % 2 == 1) {
					   
					   System.out.println(i); 
					   sum = sum + i; 
		     
	   }
	   
	}
		     System.out.println("This is the sum of the numbers is : " + sum);     
	}
}

