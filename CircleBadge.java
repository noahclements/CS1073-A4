/**
	Represents a Circle Badge, used to find area and circumference of a circle
	@author Noah Clements 3585596
*/


public class CircleBadge {
	/** the radius of the circle */
	public double radius;

/**
	Constructs a circle badge given from a radius
	@param radiusIn the radius of the circle
*/
	public CircleBadge(double radiusIn) {
		radius = radiusIn;
	}
/**
	returns the radius of the circle
	@return the radius of the circle
*/
	public double getRadius() {
		return radius;
	}
/**
	returns the area of the circle
	@return the area of the circle
*/
	public double getMaterialNeeded() {
		return Math.PI * Math.pow(radius, 2);
	}
/**
	returns the circumference of the circle
	@return the circumference of the circle
*/
	public double getThreadNeeded() {
		return (2 * Math.PI) * radius; 
	}

}