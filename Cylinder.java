class Cylinder extends Circle 
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
	public void setHeight(double x)
	{
		height=x;
	}
	public double getThickness() {
		return thickness;
	}
	public void setThickness(Double x) 
	{
		if (thickness <= getRadius() & thickness > 0 ) 
		{
			thickness = x;
		}
		else
		{
			thickness = getRadius()/2.0;
			System.out.println("The thickness was invalid, thickness set to:" + getThickness() );
		}
	}

	//###
	// Constructors
	//###
	Cylinder(double r, double h, double t)
	{
		super(r);
		height=h;
		thickness=t;
	}
	Cylinder(double r, double h)
	{
		this(r, h, r);
	}
	Cylinder()
	{
		this(1,1,1); // bruker metoden over (constructoren) til å sette default verdier. 
	}

	//##
	// methods
	//##
	double findVolume()
	{
		return Math.pow(getRadius(), 2) * height * Math.PI;
	}
	double findInnerVolume()
	{
		return Math.PI * Math.pow((getRadius() - thickness),2) * height;
	}
	double findSurfaceArea() // (2*pi*r)*r*h + 2*pi*r*h 
	{
		return findCircumference()*getRadius() + 2*Math.PI*getRadius()*height;
	}
	double findWeight()
	{
		return (findVolume() - findInnerVolume())*getMaterialDencity();
	}
	
	@Override
	public String toString() 
	{
		String enStreng = "# Cylinder #" + "\n" +
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