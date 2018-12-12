
public class MarkofStudents {

	public static void main(String[] args) {
		int [] markofStudents = {20, 33, 45, 67, 87,58};
		int sum = 0;
		double average = 0;
		for(int myVal: markofStudents) {
			System.out.println(myVal);	
			sum = sum + myVal;
			
		}
		average = sum / markofStudents.length;
		System.out.println("Number of students: " +markofStudents.length );
		System.out.println("Average mark of students: " +average);
		System.out.println("Sum of  mark of students: " +sum);
	}
	
// the comment suppose to be first past to the contents of the calculation //
	

	
}
