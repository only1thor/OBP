//import System.Math; //import so i can use the PI constant.

public abstract class Circle extends GeometricObject
{
	private int radius;
	abstract double findVolume();
	abstract double findSurfaceArea();
	abstract double findWeight();
	
	//##
	// Getters and setters
	//##
	int getRadius()
	{
		return this.radius;
	}
	void setRadius(int x)
	{
		this.radius=x;
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
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		String enStreng;
		enStreng = super.toString() + "\n" +
					"Radius:" + getRadius() + "\n" +
					"Areal:" + findArea() + "\n" +
					"Omkrets:" + findCircumference();
		return enStreng;
	}
	//###
	// Constructors
	//###
	Circle()
	{
		super();
		radius = 1;
	}
	
	Circle(int x)
	{
		super();
		radius=x;
	}
}
