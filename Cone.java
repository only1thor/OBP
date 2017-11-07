public class Cone extends Circle
{
	private double height;
	private double thickness;

	//##
	// Getters and setters
	//##
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getThickness() 
	{
		return thickness;
	}
	public void setThickness(double thickness) 
	{
		this.thickness = thickness; // ! Remember to add a check to avoid negative volume 
	}
	
	//###  
	// Constructors
	//###
	Cone(double r,double h, double t)
	{
		setRadius(r);
		height=h;
		thickness = t;
	}
	Cone()
	{
		this(1, 1, 1);
	}


	//##
	// Methods
	//##
	double findSurfaceArea() 
	{
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
	// after finding one of the sides and an angle 
	// finding the rest of the inner geometry is trivial.

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

	@Override
	public String toString() 
	{
		String enStreng = "# Cone #"  + "\n" +
							super.toString() + "\n" +
							"Høyde:" + height  + "\n" + 
							"Tykkelse" + thickness + "\n" +
							"Volum:" + findVolume() + "\n" +
							"Hulerom:" + findInnerVolume() + "\n" +
							"Overflate:" + findSurfaceArea() + "\n" +
							"Vekt:" + findWeight();
		return enStreng;
	}
}
