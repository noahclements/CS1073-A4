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
			area = ((Math.sqrt(3) / 4) * Math.pow(sideA, 2)); // formula for finding equilateral triangle area
											// could be either side to the power of 2, doesn't have to be sideA
		} else if(sideA == sideB || sideB == sideC || sideC == sideA) {
			// isoceles
			if(sideA == sideB) {
				area = sideC * Math.sqrt((sideB*sideB)-(0.5(sideC*sideC)) / 2);
			}  else if(sideB == sideC) {
				area = sideA * Math.sqrt((sideC*sideC)-(0.5(sideA*sideA)) / 2);
			}  else if(sideC == sideA) {
				area = sideB * Math.sqrt((sideA*sideA)-(0.5(sideB*sideB)) / 2);
			}
		} else if() {

			// right-angle triangle TO DO
			area = 

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