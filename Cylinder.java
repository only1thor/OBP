class Cylinder extends Circle 
{
	private int height;
	private double thickness;

	//##
	// Getters and setters
	//##
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int x)
	{
		height=x;
	}
	public double getThickness() {
		return thickness;
	}
	public void setThickness(Double x) {
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

	//##
	// methods
	//##
	double findVolume()
	{
		return getRadius() * getRadius() * height * Math.PI;
	}
	double findInnerVolume()
	{
		return Math.PI * (getRadius() - thickness) * (getRadius() - thickness) * height;
	}
	double findSurfaceArea() // (2*pi*r)*r*h + 2*pi*r*h 
	{
		return findCircumference()*getRadius() + 2*Math.PI*getRadius()*height;
	}
	double findWeight()
	{
		return findVolume()*getMaterialDencity() - findInnerVolume()*getMaterialDencity();
	}
	

	//###
	// Constructors
	//###
	Cylinder(int r, int h, double t)
	{
		super(r);
		height=h;
		thickness=t;
	}
	Cylinder(int r, int h)
	{
		this(r, h, r);
	}
	Cylinder()
	{
		this(1,1,1); // bruker metoden over (constructoren) til å sette default verdier. 
	}
}