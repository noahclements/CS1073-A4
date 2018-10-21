public class TriangleBadge {
	double sideA, sideB, sideC;

	public TriangleBadge(double sideAIn, double sideBIn, double sideCIn) {
		sideA = sideAIn;
		sideB = sideBIn;
		sideC = sideCIn;
	}


	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}


	public double getArea() {
		double area;	// using Heron's formula to calculate the area
		double s = (sideA + sideB + sideC) / 2; //semi-perimeter of the triangle
		if(sideA == sideB && sideB == sideC) {
			// equilateral
			area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)); // finds area using 3 sides
		} else if(sideA == sideB || sideB == sideC || sideC == sideA) {
			// isoceles
			area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		} else if() {

			// right-angle triangle TO DO

		} else {
			area = -1;
			System.out.println("Shape of badge is not available.");
		}
		return area;
		// finish
	}

	public double getPerimeter() {
		return sideA + sideB + sideC;
	}



}