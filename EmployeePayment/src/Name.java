
public class Name {

	public static void main(String[] args) {
		/*String str1 = " My name is Memar Demeke  ";
		 System.out.println(str1.toUpperCase());
		
		String str2 = str1;
	
    		//System.out.println(str1);
    	
            System.out.println(str1.length());
            
           str1 = " My name is Addisalem G Micheal   ";
           
           System.out.println(str1.toUpperCase());
           
           System.out.println(str1.charAt(9));
     
           
           //System.out.println(str1);
       	
           System.out.println(str1.length());
           
           System.out.println("This is the value of str2:   " + str2);*/
		//--------------------------------------------------------------------------------//
		
		/*String str1 = "Memar";
		String str2 = "Fedlu";
		
		if (str1.equals(str2)) {
			
			System.out.println("The two string are EQUAL");
			
		}
		else {
			
			System.out.println("The two string are DIFFERENT");
		}
		*/
           
		// A code to  check of string contains digits 
		String str1 = "2874086B9635";
	          	char ch;
	         	for ( int i = 0; i < str1.length(); i++  ) {
	         		ch = str1.charAt(i);
	         		System.out.println(ch);
	         		if (Character.isDigit(ch)) {
	         			continue;
	         			
	         		} else {
	         			System.out.println("The string contains NO Digits");
	         		}
	      
		}
	}

}
