public class Box extends Rectangle
{
	private double height;
	private double thickness;
	//##
	// Getters and setters
	//##
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
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
	double findSurfaceArea() {
		return 2*findArea() + 2*height*getWidth() + 2*height*getLength();
	}

	double findVolume() {
		return getHeight()*getLength()*height;
	}
	double findInnerVolume()
	{
		return ( getHeight() - thickness)*( getLength - thickness )*( height - thickness );
	}
	double findWeight() {
		return findVolume()*getMaterialDencity() - findInnerVolume()*getMaterialDencity();
	}
	@Override
	public String toString() {
		String enStreng = "# Box #"  + "\n" +
							super.toString() + "\n" +
							"Volum:" + findVolume() + "\n" +
							"Tykkelse" + thickness + "\n" +
							"Hulerom:" + findInnerVolume() + "\n" +
							"Overflate:" + findSurfaceArea() + "\n" +
							"Vekt:" + findWeight();
		return enStreng;
	}


	//###
	// Constructors
	//###
	Box(double l, double w, double h, double t)
	{
		setLength(l);
		setWidth(w);
		height=h;
		thickness=t;
	}
	Box()
	{
		this(1, 1, 1, 1);
	}

}
