public abstract class GeometricObject
{
	static double materialDencity; //skal inneholde egenvekten til objektet
	
	abstract double findArea();
	abstract double findVolume();
	abstract double findCircumference();
	abstract double findSurfaceArea();
	abstract double findWeight();
	
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
		setMaterialDencity(7.8);
	}
}