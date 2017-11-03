public abstract class Cone extends Circle
{
	int height;
	double thickness;

	//##
	// Getters and setters
	//##
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the thickness
	 */
	public double getThickness() {
		return thickness;
	}
	/**
	 * @param thickness the thickness to set
	 */
	public void setThickness(double thickness) {
		this.thickness = thickness; // ! Remember to add a check to avoid negative volume 
	}


	//##
	// Methods
	//##
	double findSurfaceArea() {
		return Math.PI*getRadius()*Math.sqrt(getRadius()*getRadius() + height*height)  + findArea(); //pi*r*s + pi*r²
	}


	//##
	// How to find inner radius
	//##
	// a = tan−1( H/R )
	// d =cos( a )* T
	// r= R - d 
	// r is the innervolumes radius. 
	// H is the height
	// R is the radius
	// T is the thickness
	// (all capital variables are known values)

	double findInnerVolume()
	{
		double v = Math.atan(height/getRadius()); //finding angle
		double d = Math.cos(v)*thickness; //finding diffrence between outer raduis and inner raduis
		double r = getRadius() - d; 
		double h = r*Math.tan(v);
		return (Math.PI*r*r*h)/3;
	}

	double findVolume()
	{
		return (Math.PI*getRadius()*getRadius()*height)/3; 
	}

	double findWeight() {
		return findVolume()*getMaterialDencity() - findInnerVolume()*getMaterialDencity();
	}

	
	//###  
	// Constructors
	//###
	Cone(int r,int h, double t)
	{
		setRadius(r);
		height=h;
		thickness = t;
	}
	Cone()
	{
		this(1, 1, 1);
	}
}
