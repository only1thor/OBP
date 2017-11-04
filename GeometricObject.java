public abstract class GeometricObject
{
	private static double materialDencity; //skal inneholde egenvekten til objektet
	
	abstract double findArea();
	abstract double findCircumference();
	abstract double findVolume();
	abstract double findSurfaceArea();
	abstract double findWeight();
	
	double getMaterialDencity()
	{
		return materialDencity;
	}

	@Override
	public String toString() {
		return "Matreal tetthet:" + materialDencity;
	}

	//###
	// Constructors
	//###
	GeometricObject()
	{
		materialDencity = 7.8;
	}
}