public class CircleBadge {
	public double radius;

	public CircleBadge(double radiusIn) {
		radius = radiusIn;
	}

	public double getRadius() {
		return radius;
	}

	public double getMaterialNeeded() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getThreadNeeded() {
		return (2 * Math.PI) * radius; 
	}

}