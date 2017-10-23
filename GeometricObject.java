import System.MATH;

public abstract class GeometricObject
{
	private int numberOfObjects = 0;
	private int length;
	private int hight;
	private int radius;
	
	float abstract findArea();
	float abstract findVolume();
	float abstract findCircumference();
	float abstract findSurfaceArea();
	
	// Getters and setters:
	int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	int getLength()
	{
		return this.length;
	}
	void setLength(int x)
	{
		this.length=x;
	}
	int getHight()
	{
		return this.hight;
	}
	void setHight(int x)
	{
		this.hight=x;
	}
	int getRadius()
	{
		return this.radius;
	}
	void setRadius(int x)
	{
		this.radius=x;
	}
	
	
	void GeometricObject()
	{
		numberOfObjects++;
	}
	
	public static void main(String[] args)
	{
	    
	}
}