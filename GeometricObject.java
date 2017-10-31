public abstract class GeometricObject
{
	static double materialDencity; //skal inneholde egenvekten til objektet
	
	double abstract findArea();
	double abstract findVolume();
	double abstract findCircumference();
	double abstract findSurfaceArea();
	double abstract findWeight();
	
	
	
	// Getters and setters:
	//#####
	//# Bør disse være abstrakte?? eller bare passe på at de kan 
	//# hentes i 3d objektene via 2d objektene? 
	//# (siden man ikke kan hente lengre en 1 arve nivå over.)
	//#####
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
	public static void main(String[] args)
	{
	    
	}
}