class Cylinder extends Circle 
{
	private int height;

	//##
	// Getters and setters
	//##
	int getHeight()
	{
		return this.height;
	}
	void setHeight(int x)
	{
		this.height=x;
	}

	//##
	// methods
	//##
	double findArea() // (2*pi*r)*r*h + 2*pi*r*h 
	{
		return super.findCircumference()*super.getRadius() + 2*Math.PI*super.getRadius()*height;
	}
	double findVolume()
	{
		return super.getRadius() * super.getRadius() * this.height * Math.PI;
	}
	double findSurfaceArea()
	{
		return findArea();
	}
	double findWeight()
	{
		return findVolume()*this.getMaterialDencity();
	}
	

	//###
	// Constructors
	//###
	Cylinder(int r, int h)
	{
		super(r);
		height=h;
	}
	Cylinder()
	{
		this(1,1); // bruker metoden over (constructoren) til å sette default verdier. 
	}
}