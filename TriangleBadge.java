public class TriangleBadge {
	double sideA, sideB, sideC;
	final double TOLERANCE = 1E-14;
	double height = 0;
	double halfBase = 0;
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
		if((Math.abs(sideA - sideB) < TOLERANCE) && (Math.abs(sideB - sideC) < TOLERANCE)) {
			// equilateral
			area = ((Math.sqrt(3) / 4) * Math.pow(sideA, 2)); // formula for finding equilateral triangle area
											// could be either side to the power of 2, doesn't have to be sideA
		} else if(Math.abs(sideA - sideB) < TOLERANCE || Math.abs(sideB - sideC) < TOLERANCE || Math.abs(sideC - sideA) < TOLERANCE) {
			// isoceles
			if(Math.abs(sideA - sideB) < TOLERANCE) {
				halfBase = sideC / 2;
				height = Math.sqrt((sideA*sideA)-(halfBase*halfBase));
				area = (halfBase * height);
			}  else if(Math.abs(sideB - sideC) < TOLERANCE) {
				halfBase = sideA / 2;
				height = Math.sqrt((sideB*sideB)-(halfBase*halfBase));
				area = (halfBase * height);
			}  else if(Math.abs(sideC - sideA) < TOLERANCE) {
				halfBase = sideB / 2;
				height = Math.sqrt((sideC*sideC)-(halfBase*halfBase));
				area = (halfBase * height);
			}
		} else if(Math.abs(((sideA*sideA) + (sideB*sideB)) - (sideC*sideC)) < TOLERANCE) { // right-angle triangle if / else if statements
			area = (sideA * sideB) / 2;
		} else if(Math.abs(((sideA*sideA) + (sideC*sideC)) - (sideB*sideB)) < TOLERANCE) {
			area = (sideA * sideC) / 2;
		} else if(Math.abs(((sideB*sideB) + (sideC*sideC)) - (sideA*sideA)) < TOLERANCE) {
			area = (sideB * sideC) / 2;
		} else {													// if they dont dont match the dimensions of the available triangles, it returns -1
			area = -1;
		}
		return area;
	}

	public double getPerimeter() {
		return sideA + sideB + sideC;
	}



}