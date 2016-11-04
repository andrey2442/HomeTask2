import java.util.Scanner;

public class Triangle extends Shape {
	
	private int perimeter = 0;
	
	
	@Override
	public void calculateArea(){
	}
	
	@Override
	public void calculatePerimeter(){
	
		System.out.println("Please input the length for your triangle sizes");
	
		Scanner scan = new Scanner(System.in);
		System.out.println("First side is: ");
		String a = scan.nextLine(); 
		System.out.println("Second side is: ");
		String b = scan.nextLine();
		System.out.println("Third side is: ");
		String c = scan.nextLine();
		
		Integer intA = Integer.parseInt(a);
		Integer intB = Integer.parseInt(b);
		Integer intC = Integer.parseInt(c);
	
			
		perimeter = intA + intB + intC;
		
		System.out.println("Triangle perimeter is: " + perimeter);
	}
}
