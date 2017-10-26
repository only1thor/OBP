import System.Math; //import so i can use the PI constant.

public abstract class Circle extends GeometricObject
{
	int radius;
	
	double findArea();
	double abstract findVolume();
	double findCircumference()
	{
		return radius*radius*Math.PI;
	}
	double abstract findSurfaceArea();
	
	GeometricObject(); //construktor? er det her jeg "lager" et geometrisk objekt?
	public static void main(String[] args)
	{
	    
	}
}
