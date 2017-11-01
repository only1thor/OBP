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
	double findArea()
	{
		return this.findCircumference()*super.getRadius() + super.getRadius()*height;
	}
	double findVolume()
	{
		return super.getRadius()*super.getRadius()*this.height*Math.PI;//3.141592654;
	}
	double findSurfaceArea()
	{
		return 1.0;
	}
	double findWeight()
	{
		return 1.0;
	}
	
	
	double findCircumference()
	{
		return super.findCircumference();// er det dette som lar meg benytte super sin metode?	
	}
	

	//###
	// Constructors
	//###
	Cylinder(int x)
	{
		super(x);
		height=x;
	}
	Cylinder(int r, int h)
	{
		super(r);
		height=h;
	}
	Cylinder()
	{
		this(1); // bruker metoden over (constructoren) til å sette default verdier. 
	}
}