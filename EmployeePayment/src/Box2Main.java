
public class Box2Main {

	public static void main(String[] args) {
	     Box2 mybox = new Box2();
	     int outcome=    mybox.volume( 7,  8, 10);
	     
           System.out.println("The volume of the box is : " + outcome);
	     
           
           double area =  mybox.calcArea(64.6, 4);
  	     
           System.out.println("The area of the box is : " + area);
	}
}
