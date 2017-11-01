class Oblig4
{
	public static void main(String[] args)
	{
	    //her vil jeg lage noen objekter med classene jeg har definert i andre filer.
		// Cylinder roer = new Cylinder(); // litt sånn, med default konstruktor.
		Cylinder roer1= new Cylinder(1,3);
	    System.out.println("lengde:" + roer1.getHeight() + " radius:" + roer1.getRadius() );
	    
	    //her vil jeg hente data om disse objektene og gjøre noen beregninger.
	}
}