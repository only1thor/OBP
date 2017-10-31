import System.Math; //import so i can use the PI constant.

public abstract class Circle extends GeometricObject
{
	int radius;
	GeometricObject(); //construktor? er det her jeg "lager" et geometrisk objekt?
						// er det denne som gir meg super sine vaiabbler? 
						// eller er det det som gjøres i konstruktoren?
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
	
	public static void main(String[] args)
	{
	    
	}
}
