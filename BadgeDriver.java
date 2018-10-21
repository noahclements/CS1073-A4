import java.util.Scanner;
public class BadgeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sideA, sideB, sideC, radius;
		double area = 0;
		double max = 0;
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
					System.out.println("Shape of badge is not available.");
				} else {
					System.out.println("Material: " + t1.getArea());
					System.out.println("Thread: " + t1.getPerimeter());
					area = t1.getArea();
				}
			} else if(choice == 2) {
				System.out.println("Length of radius (cm): ");
				radius = sc.nextDouble();
				CircleBadge c1 = new CircleBadge(radius);
				System.out.println("Material: " + c1.getMaterialNeeded());
				System.out.println("Thread: " + c1.getThreadNeeded());
				area = c1.getMaterialNeeded();
			} 
				if(area > max) {
					max = area;
				}
		}





	}
}