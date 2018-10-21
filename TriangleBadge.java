/**
	Represents a Triangle Badge class, used to find sides, area, and perimeter
	@author Noah Clements 3585596
*/
public class TriangleBadge {
	/** the sides of the triangle */
	double sideA, sideB, sideC;
	/** the extremely small number to compare to w/ absolute numbers */
	final double TOLERANCE = 1E-14;
	/** the height of the isosceles triangle */
	double height = 0;
	/** the base of the triangle*/
	double halfBase = 0;
	/** Constructs a Triangle Badge given 3 sides
	@param sideAIn side A of the triangle in cm
	@param sideBIn side B of the triangle in cm
	@param sideCIn side C of the triangle in cm
	*/
	public TriangleBadge(double sideAIn, double sideBIn, double sideCIn) {
		sideA = sideAIn;
		sideB = sideBIn;
		sideC = sideCIn;

	}

	/** Returns side A of the triangle
	@return side A of the triangle
	*/
	public double getSideA() {
		return sideA;
	}
	/** Returns side B of the triangle
	@return side B of the triangle
	*/
	public double getSideB() {
		return sideB;
	}
	/** Returns side C of the triangle
	@return side C of the triangle
	*/
	public double getSideC() {
		return sideC;
	}

	/** Returns the area of the triangle based on many if statements
	@return the area of a triangle
	*/

	public double getArea() {
		double area = 0;	// initializing area
		// EQUILATERAL TRIANGLE
		if((Math.abs(sideA - sideB) < TOLERANCE) && (Math.abs(sideB - sideC) < TOLERANCE)) { // if sideA equals sideB, and sideB equals sideC
			area = ((Math.sqrt(3) / 4) * Math.pow(sideA, 2)); // formula for finding equilateral triangle area, doesn't specifically have to be sideA
			// ISOSCELES TRIANGLE, if sideA equals sideB, or if sideB equals sideC, or if sideC equals sideA
		} else if(Math.abs(sideA - sideB) < TOLERANCE || Math.abs(sideB - sideC) < TOLERANCE || Math.abs(sideC - sideA) < TOLERANCE) {
			if(Math.abs(sideA - sideB) < TOLERANCE) {	// nested if statements to decide which formula to use (ie. which side minus the other)
				halfBase = sideC / 2;	// the base of the triangle divided by 2, makes the next formula more clean
				height = Math.sqrt((sideA*sideA)-(halfBase*halfBase));	// pythagorean theorem
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
			// RIGHT ANGLE TRIANGLES, basically checking if c^2=a^2+b^2 but with 3 checks based on inputs
		} else if(Math.abs(((sideA*sideA) + (sideB*sideB)) - (sideC*sideC)) < TOLERANCE) { 
			area = (sideA * sideB) / 2;
		} else if(Math.abs(((sideA*sideA) + (sideC*sideC)) - (sideB*sideB)) < TOLERANCE) {
			area = (sideA * sideC) / 2;
		} else if(Math.abs(((sideB*sideB) + (sideC*sideC)) - (sideA*sideA)) < TOLERANCE) {
			area = (sideB * sideC) / 2;
		} else {	// if they dont dont match the dimensions of the available triangles, it returns -1
			area = -1;
		}
		return area;
	}
	/** returns the perimeter of the triangle
	@return the perimeter of the triangle
	*/
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}



}