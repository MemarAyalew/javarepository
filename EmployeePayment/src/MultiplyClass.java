
public class MultiplyClass {

	public static void main(String[] args) {
		double value1 = 30.76;
		double value2 = 57.33;
		double result = value1 * value2;
		
				
		System.out.println("Inpute val1:" + value1);		
		System.out.println("Inpute val2:" + value2);
		System.out.println("Result of multiplication:"  + result);
		
		/*
		 * 
		 * demonstrating a modulo
		
		int n1 = 8 ; 
		
		int result2 = 8 % 3 ;
		
		System.out.println("This is the modulo result:" + result2); 
		*
		*
		*/ 
		
	// to check whether the number is odd or even....> modulo--the reminder 
		
		// we use 2 to check if the number is an even number or not....if the result is 0 then the number is even, if 1, then the number is odd
		
            int number = 13 ; 
		
		    int result3 = number % 2 ;
		
	    	System.out.println("This is the modulo result:" + result3); 
	    	
	    	// modulo with if else logical statement 
	    	
	    	 int number1 = 13 ; 
	 		
			    int result4 = number1 % 2 ;
			   
			    if (result4 == 0) {
			    	System.out.println("This given number" + number1 + "is EVEN");
			    	
			    	
			    } else {
			    	
			    	System.out.println("This given number" + number1 + "is ODD");
			    	
			    }
		
			 
		    	System.out.println("This is the modulo result:" + result4); 
	    	
	    	
	    	
		
		

	}

}
