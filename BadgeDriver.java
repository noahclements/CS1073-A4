/**
	Represents the driver class used to find area/perimeter of circle and triangle badges
	@author Noah Clements 3585596
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class BadgeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat(".000"); // max decimals = 3
		double sideA, sideB, sideC, radius;
		double area = 0;
		double maxTriangle = 0;		// declaring and initializing variables 
		double maxCircle = 0;
		int choice = 0;

		while(choice != 3) {	// loop this until user inputs 3

			System.out.println("Select one of the following options:");
			System.out.println("1 - Enter the information for a triangular badge.");
			System.out.println("2 - Enter the information for a circular badge.");
			System.out.println("3 - Quit.");
			System.out.print("Enter your choice:");

			choice = sc.nextInt();

			if(choice == 1) {	// if user decides on a triangle badge, asks and waits for user to input all 3 sides
				System.out.println("Length of side (cm): ");
				sideA = sc.nextDouble();
				System.out.println("Length of side (cm): ");
				sideB = sc.nextDouble();
				System.out.println("Length of side (cm): ");
				sideC = sc.nextDouble();
				TriangleBadge t1 = new TriangleBadge(sideA, sideB, sideC);	// constructs a TriangleBadge with the 3 inputs

				if(t1.getArea() == -1) {	// getArea() returns -1 if the user inputs dont meet the requirements
					System.out.println("Shape not available.");
				} else {
					System.out.println("Material: " + format.format(t1.getArea()) + "cm^2");	// prints out the area and perimeter
					System.out.println("Thread: " + format.format(t1.getPerimeter()) + "cm");	// with the correct format
					area = t1.getArea();
					if(area > maxTriangle) {	// used to determine the biggest triangle area as the loop goes
						maxTriangle = area;
					}
				}
			} else if(choice == 2) {	// if the user decides on a circle badge, asks and waits on user to input the radius
				System.out.println("Length of radius (cm): ");
				radius = sc.nextDouble();
				CircleBadge c1 = new CircleBadge(radius);	// constructs a CircleBadge with the radius
				System.out.println("Material: " + format.format(c1.getMaterialNeeded()) + "cm^2");	// prints out the area and circumference
				System.out.println("Thread: " + format.format(c1.getThreadNeeded()) + "cm");		// with the correct format
				area = c1.getMaterialNeeded();
				if(area > maxCircle) {	// used to determine the biggest circle area as the loops goes
					maxCircle = area;
				}
			} 
				
		}
			if(maxCircle > maxTriangle) {	// used to determine the biggest area out of the two variables
				System.out.println("The badge that requires the most is a Circle");
				System.out.println("The amount of material needed is: " + format.format(maxCircle) + "cm^2");
			} else {
				System.out.println("The badge that requires the most is a Triangle");
				System.out.println("The amount of material needed is: " + format.format(maxTriangle) + "cm^2");
			}




	}
}