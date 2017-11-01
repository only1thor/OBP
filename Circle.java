import System.Math; //import so i can use the PI constant.

public abstract class Circle extends GeometricObject
{
	private int radius;
	abstract double findArea();
	abstract double findVolume();
	abstract double findSurfaceArea();
	abstract double findWeight();
	
	double findCircumference()
	{
		return 2*radius*Math.PI;
	}
	int getRadius()
	{
		return this.radius;
	}
	void setRadius(int x)
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
	
	Circle(x)
	{
		super();
		radius=x;
	}
}
