import java.util.Scanner;
import java.text.NumberFormat;
public class BadgeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat format = NumberFormat.getNumberInstance();
		format.setMaximumFractionDigits(3);

		double sideA, sideB, sideC, radius;
		double area = 0;
		double maxTriangle = 0;
		double maxCircle = 0;
		int choice = 0;

		while(choice != 3) {

			System.out.println("Select one of the following options:");
			System.out.println("1 - Enter the information for a triangular badge.");
			System.out.println("2 - Enter the information for a circular badge.");
			System.out.println("3 - Quit.");
			System.out.print("Enter your choice:");

			choice = sc.nextInt();

			if(choice == 1) {
				System.out.println("Length of side (cm): ");
				sideA = sc.nextDouble();
				System.out.println("Length of side (cm): ");
				sideB = sc.nextDouble();
				System.out.println("Length of side (cm): ");
				sideC = sc.nextDouble();
				TriangleBadge t1 = new TriangleBadge(sideA, sideB, sideC);

				if(t1.getArea() == -1) {
					System.out.println("Shape not available.");
				} else {
					System.out.println("Material: " + format.format(t1.getArea()));
					System.out.println("Thread: " + format.format(t1.getPerimeter()));
					area = t1.getArea();
					if(area > maxTriangle) {
						maxTriangle = area;
					}
				}
			} else if(choice == 2) {
				System.out.println("Length of radius (cm): ");
				radius = sc.nextDouble();
				CircleBadge c1 = new CircleBadge(radius);
				System.out.println("Material: " + format.format(c1.getMaterialNeeded()));
				System.out.println("Thread: " + format.format(c1.getThreadNeeded()));
				area = c1.getMaterialNeeded();
				if(area > maxCircle) {
					maxCircle = area;
				}
			} 
				
		}
			if(maxCircle > maxTriangle) {
				System.out.println("The badge that requires the most is a Circle");
				System.out.println("The amount of material needed is: " + format.format(maxCircle));
			} else {
				System.out.println("The badge that requires the most is a Triangle");
				System.out.println("The amount of material needed is: " + format.format(maxTriangle));
			}




	}
}