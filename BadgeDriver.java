import java.util.Scanner;
public class BadgeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sideA, sideB, sideC, radius;

		System.out.println("Select one of the following options:");
		System.out.println("1 - Enter the information for a triangular badge.");
		System.out.println("2 - Enter the information for a circular badge.");
		System.out.println("3 - Quit.");
		System.out.print("Enter your choice:");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Length of side (cm): ");
			sideA = sc.nextDouble();
			System.out.println("Length of side (cm): ");
			sideB = sc.nextDouble();
			System.out.println("Length of side (cm): ");
			sideC = sc.nextDouble();
			TriangleBadge t1 = new TriangleBadge(sideA, sideB, sideC);
			System.out.println("Material: " + t1.getArea());
			System.out.println("Thread: " + t1.getPerimeter());
		} else if(choice == 2) {
			System.out.println("Length of radius (cm): ");
			radius = sc.nextDouble();
			CircleBadge c1 = new CircleBadge(radius);
			System.out.println("Material: " + c1.getMaterialNeeded());
			System.out.println("Thread: " + c1.getThreadNeeded());
		} else if(choice == 3) {
			System.out.println("Bye!");
		}





	}
}