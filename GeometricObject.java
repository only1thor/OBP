public abstract class GeometricObject
{
	private int numberOfObjects = 0;
	int length;
	int hight;
	int radius;
	double materialDencity; //skal inneholde egenvekten til objektet
	
	double abstract findArea();
	double abstract findVolume();
	double abstract findCircumference();
	double abstract findSurfaceArea();
	
	
	
	// Getters and setters:
	//#####
	//# Bør disse være abstrakte?? eller bare passe på at de kan 
	//# hentes i 3d objektene via 2d objektene? 
	//# (siden man ikke kan hente lengre en 1 arve nivå over.)
	//#####
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
	double getMaterialDencity()
	{
		return this.materialDencity;
	}
	void setMaterialDencity(double x)
	{
		this.materialDencity=x;
	}
	
	
	void GeometricObject()
	{
		numberOfObjects++;
	}
	
	public static void main(String[] args)
	{
	    
	}
}