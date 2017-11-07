public class Box extends Rectangle
{
	private double height;
	private double thickness;
	//##
	// Getters and setters
	//##
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getThickness() 
	{
		return thickness;
	}
	public void setThickness(double thickness) 
	{
		this.thickness = thickness;
	}
	
	//###
	// Constructors
	//###
	Box(double l, double w, double h, double t)
	{
		super(l,w);
		height=h;
		thickness=t;
	}
	Box()
	{
		this(1, 1, 1, 1);
	}

	//##
	// Methods
	//##
	double findSurfaceArea() 
	{
		return 2*findArea() + 2*height*(getWidth() + getLength());
	}

	double findVolume() 
	{
		return getLength()*Math.pow(height,2);
	}
	double findInnerVolume()
	{
		return ( getLength() - thickness )*Math.pow((height - thickness),2);
	}
	double findWeight() 
	{
		return (findVolume() - findInnerVolume())*getMaterialDencity();
	}
	@Override
	public String toString() {
		String enStreng = "# Box #"  + "\n" +
							super.toString() + "\n" +
							"Høyde:" + height  + "\n" + 
							"Tykkelse" + thickness + "\n" +
							"Volum:" + findVolume() + "\n" +
							"Hulerom:" + findInnerVolume() + "\n" +
							"Overflate:" + findSurfaceArea() + "\n" +
							"Vekt:" + findWeight();
		return enStreng;
	}
}
