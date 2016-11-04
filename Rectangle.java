import java.util.Scanner;

public class Rectangle extends Shape {
	
	private int perimeter = 0;

	private double tringlesP = 0;
	
	@Override
	public void calculateArea(){
		
	}
	
	@Override
public void calculatePerimeter(){
	
	System.out.println("Please input the length for your rectangle sizes");
	
	Scanner scan = new Scanner(System.in); 
	System.out.println("First side length is: ");
	String a = scan.nextLine();
	String c = a;
	System.out.println("Second side length is: ");
	String b = scan.nextLine();
	String d = b;
	
		
	Integer intA = Integer.parseInt(a);
	Integer intB = Integer.parseInt(b);
	Integer intC = Integer.parseInt(c);
	Integer intD = Integer.parseInt(d);
		
	perimeter = intA + intB + intC + intD;
		
		System.out.println("rectangle perimeter is: " + perimeter);
		
		tringlesP = intA + intB + Math.sqrt(Math.pow(intA, 2)+Math.pow(intB, 2));
		
		System.out.print("Also your rectangle consist from 2 triangles, their perimiter are: ");
	
		System.out.printf("%.2f", tringlesP);
	}
}
