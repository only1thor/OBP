//import System.Math; //import so i can use the PI constant.

public abstract class Circle extends GeometricObject
{
	private double radius;
	
	//##
	// Getters and setters
	//##
	double getRadius()
	{
		return this.radius;
	}
	void setRadius(double x)
	{
		this.radius=x;
	}

	//###
	// Constructors
	//###
	Circle()
	{
		super();
		radius = 1;
	}
	
	Circle(double x)
	{
		super();
		radius=x;
	}

	//##
	// Methods
	//##
	double findCircumference()
	{
		return 2*radius*Math.PI;
	}
	double findArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() 
	{
		String enStreng;
		enStreng = super.toString() + "\n" +
					"Radius:" + getRadius() + "\n" +
					"Areal:" + findArea() + "\n" +
					"Omkrets:" + findCircumference();
		return enStreng;
	}
}
