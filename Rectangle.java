public abstract class Rectangle extends GeometricObject
{
	private double length;
	private double width;

	//##
	// Getters and setters
	//##
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		this.length = length;
	}
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
		
	//###
	// Constructors
	//###
	Rectangle(double l,double w)
	{
		length = l;
		width = w;
	}
	Rectangle()
	{
		this(1, 1);
	}

	//##
	// Methods
	//##
	double findArea() 
	{
		return length*width;
	}
	double findCircumference()
	{
		return 2*length + 2*width;
	}

	@Override
	public String toString() 
	{
		String enStreng;
		enStreng = super.toString() + "\n" +
					"Lengde:" + getLength() + "\n" +
					"Bredde:" + getWidth()  + "\n" +
					"Areal:" + findArea() + "\n" +
					"Omkrets:" + findCircumference();
		return enStreng;
	}
}
