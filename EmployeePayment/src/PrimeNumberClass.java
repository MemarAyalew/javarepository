
public class PrimeNumberClass {

	public static void main(String[] args) {
		int givenNumber = 8;
		
		 for(int i =2; i < givenNumber;  i++) {
			 
			 if ((givenNumber %  i) == 0) {
				 
				 System.out.println("Given Number is not prime: " +  "  "  +  i);
				 
				 break;
			 }
		 }

	}

}
