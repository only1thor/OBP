class Cylinder extends Circle 
{
	private int height;


	double findArea()
	{
		return 1.0;
	}
	double findVolume()
	{
		return 1.0;
	}
	double findSurfaceArea()
	{
		return 1.0;
	}
	double findWeight()
	{
		return 1.0;
	}
	
	int getHeight()
	{
		return this.height;
	}
	void setHeight(int x)
	{
		this.height=x;
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