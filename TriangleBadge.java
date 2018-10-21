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
		} else if((sideA*sideA) + (sideB*sideB) == (sideC*sideC)) { // right-angle triangle if / else if statements
			area = Math.sqrt((sideA*sideA) + (sideB*sideB));
		} else if((sideA*sideA) + (sideC*sideC) == (sideB*sideB)) {
			area = Math.sqrt((sideA*sideA) + (sideC*sideC));
		} else if((sideB*sideB) + (sideC*sideC) == (sideA*sideA)) {
			area = Math.sqrt((sideB*sideB) + (sideC*sideC));
		} else {													// if they dont dont match the dimensions of the available triangles, it returns -1
			area = -1;
			System.out.println("Shape of badge is not available.");
		}
		return area;
	}

	public double getPerimeter() {
		return sideA + sideB + sideC;
	}



}