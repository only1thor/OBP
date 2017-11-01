class Cylinder extends Circle 
{
	private int height;
	
	int getHeight()
	{
		return this.height;
	}
	void setHeight(int x)
	{
		this.height=x;
	}
	
	findCircumference()
	{
		return super.findCircumference();// er det dette som lar meg benytte super sin metode?	
	}
	

	//###
	// Constructors
	//###
	Cylinder(x)
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