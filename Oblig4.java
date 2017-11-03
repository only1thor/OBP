class Oblig4
{
	public static void main(String[] args)
	{
		Cylinder roer1= new Cylinder(6,3,1);
		Cone kjegle1 = new Cone(3,7,1.1); 
		Sphere kule1 = new Sphere(3,1.2);
		Box eske1= new Box(3,5,4,1);


		System.out.println(roer1.toString());
		System.out.println("");
		System.out.println(kjegle1.toString());
		System.out.println("");
		System.out.println(kule1.toString());
		System.out.println("");
		System.out.println(eske1.toString());


		//System.out.println("weight:" + roer1.findWeight() + " radius: " + roer1.getRadius() );
	}
}