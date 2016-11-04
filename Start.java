import java.util.Scanner; 
public class Start {
	
	public static String userInput;

	public static void main(String[] args) {
				
		Circle circl = new Circle();
		Square squar = new Square();
		Rectangle rectangl = new Rectangle();
		Triangle triangl = new Triangle();
		
		System.out.println("Choose your shape and input corresponding number: ");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("4.Triangle");
		//System.out.println("Choose your shape and input corresponding number: ");
		
		Scanner scan = new Scanner(System.in); 
		userInput = scan.nextLine(); 
		
	
		switch (userInput){
		case "1":
		circl.calculateArea();
		break;
		case "2":
		squar.calculatePerimeter();
		break;
		case "3":
		rectangl.calculatePerimeter();
		break;
		case "4":
		triangl.calculatePerimeter();
		break;
		}
		
	}
	
}
