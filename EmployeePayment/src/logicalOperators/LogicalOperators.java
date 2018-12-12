package logicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {
	/*	int x = 2;
		int y = 4;
		
		// &&---> AND, ||---> OR
		
		
		if ((x>=20) && (y>=45)) {
			System.out.println("The condition is true");
		} 
		
		else  {
			System.out.println("The condition is false");
		}
		
		*/
		
		
		int score = 30;
		switch (score)
		{
		case 90:
			System.out.println("A-Excellent");
			break;
		case 80:
			System.out.println("B-Very Good");
			break;
		case 70:
			System.out.println("C-Good");
			break;
		case 60:
			System.out.println("D-Bad");
			break;
		default:
			System.out.println("Grade is not being defined!");
			break;
			
		}
		
	}

}
