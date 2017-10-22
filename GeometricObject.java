import System.MATH;

public abstract class GeometricObject
{
	private int numberOfObjects = 0;
	private int length;
	private int hight;
	private int radius;
	
	float findArea()
	{
		return length*hight;
	}
	
	float findVolume()
	{
		
	}
	
	float findCircumference()
	{
		return radius*MATH.PI;
	}
	
	float findSurfaceArea()
	{
		
	}
	
	public static void main(String[] args)
	{
	    
	}
}