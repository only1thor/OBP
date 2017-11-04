public class Sphere extends Circle
{
	private double thickness;
	//##
	// Getters and setters
	//##
	/**
	 * @return the thickness
	 */
	public double getThickness() {
		return thickness;
	}
	/**
	 * @param thickness the thickness to set
	 */
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	//##
	// Methods
	//##

	private double powThree(double x)
	{
		return x*x*x; 
	}

	double findSurfaceArea() {
		return 4*Math.PI*getRadius()*getRadius();
	}

	double findVolume() {
		return (4*Math.PI*powThree( (double)getRadius() ) )/3;
	}
	double findInnerVolume()
	{
		return powThree(getRadius() - thickness);
	}
	double findWeight() {
		return findVolume()*this.getMaterialDencity() - findInnerVolume()*this.getMaterialDencity();
	}

	@Override
	public String toString() {
		String enStreng = "# Sphere #"  + "\n" +
							super.toString() + "\n" +
							"Tykkelse" + thickness + "\n" +
							"Volum:" + findVolume() + "\n" +
							"Hulerom:" + findInnerVolume() + "\n" +
							"Overflate:" + findSurfaceArea() + "\n" +
							"Vekt:" + findWeight();
		return enStreng;
	}


	//###
	// Constructors
	//###
	Sphere(int r, double t)
	{
		setRadius(r);
		thickness=t;
	}

	Sphere()
	{
		this(1,1.0);
	}

}
