import java.util.Scanner;

public class Circle extends Shape {
			
	private String userRadius = "0";
	
	@Override
	 void calculateArea(){
		
		System.out.println("Please input the radius of your circle");
		
		Scanner scan = new Scanner(System.in); 
		userRadius = scan.nextLine(); 
		
		Float radius = Float.parseFloat(userRadius);
		
		float  pi = 3.14f;
		
		float area = radius * radius * pi;
				
		System.out.print("Circle area is :");
		
		System.out.printf("%.2f", area);
	}
	
	@Override
	void calculatePerimeter() {
	}
}
