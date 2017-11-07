public class Sphere extends Circle
{
	private double thickness;
	//##
	// Getters and setters
	//##
	public double getThickness() 
	{
		return thickness;
	}
	public void setThickness(double thickness) 
	{
		this.thickness = thickness;
	}
	
	//###
	// Constructors
	//###
	Sphere(double r, double t)
	{
		setRadius(r);
		thickness=t;
	}

	Sphere()
	{
		this(1,1.0);
	}

	//##
	// Methods
	//##
	double findSurfaceArea() 
	{
		return 4*Math.PI*Math.pow(getRadius(),3);
	}

	double findVolume() 
	{
		return (4*Math.PI*Math.pow(getRadius(),3))/3;
	}
	double findInnerVolume()
	{
		return 4*Math.PI*Math.pow((getRadius() - thickness),3);
	}
	double findWeight() 
	{
		return (findVolume() - findInnerVolume())*getMaterialDencity();
	}

	@Override
	public String toString() 
	{
		String enStreng = "# Sphere #"  + "\n" +
							super.toString() + "\n" +
							"Tykkelse" + thickness + "\n" +
							"Volum:" + findVolume() + "\n" +
							"Hulerom:" + findInnerVolume() + "\n" +
							"Overflate:" + findSurfaceArea() + "\n" +
							"Vekt:" + findWeight();
		return enStreng;
	}
}
