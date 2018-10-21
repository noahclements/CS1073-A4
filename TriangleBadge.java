public class TriangleBadge {
	double sideA, sideB, sideC;
	final double TOLERANCE = 1E-14;

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
		double area = 0;
		if(sideA == sideB && sideB == sideC) {
			// equilateral
			area = ((Math.sqrt(3) / 4) * Math.pow(sideA, 2)); // formula for finding equilateral triangle area
											// could be either side to the power of 2, doesn't have to be sideA
		} else if(Math.abs(sideA - sideB) < TOLERANCE || Math.abs(sideB - sideC) < TOLERANCE || Math.abs(sideC - sideA) < TOLERANCE) {
			// isoceles
			if(Math.abs(sideA - sideB) < TOLERANCE) {
				area = sideC * Math.sqrt((sideB*sideB)-(0.5*(sideC*sideC)) / 2);
			}  else if(Math.abs(sideB - sideC) < TOLERANCE) {
				area = sideA * Math.sqrt((sideC*sideC)-(0.5*(sideA*sideA)) / 2);
			}  else if(Math.abs(sideC - sideA) < TOLERANCE) {
				area = sideB * Math.sqrt((sideA*sideA)-(0.5*(sideB*sideB)) / 2);
			}
		} else if(Math.abs(((sideA*sideA) + (sideB*sideB)) - (sideC*sideC) < TOLERANCE)) { // right-angle triangle if / else if statements
			area = Math.sqrt((sideA*sideA) + (sideB*sideB));
		} else if(Math.abs(((sideA*sideA) + (sideC*sideC)) - (sideB*sideB) < TOLERANCE)) {
			area = Math.sqrt((sideA*sideA) + (sideC*sideC));
		} else if(Math.abs(((sideB*sideB) + (sideC*sideC)) - (sideA*sideA) < TOLERANCE)) {
			area = Math.sqrt((sideB*sideB) + (sideC*sideC));
		} else {													// if they dont dont match the dimensions of the available triangles, it returns -1
			area = -1;
		}
		return area;
	}

	public double getPerimeter() {
		return sideA + sideB + sideC;
	}



}