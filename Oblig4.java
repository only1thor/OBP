class Oblig4
{
	public static void main(String[] args)
	{
		Cylinder roer1= new Cylinder(6,3,1);
		Cone kjegle1 = new Cone(3,7,1.1); 

		System.out.println("weight:" + roer1.findWeight() + " radius: " +
		roer1.getRadius() );
	}
}