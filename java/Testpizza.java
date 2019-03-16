class Testpizza
{

	public static void main(String args[])
	{

           
      Dominos d= new Dominos();
      Pizza pz =d.servepizza(390,"farmhouse");

     System.out.println(pz.Pizza_name);
         System.out.println(pz.price);
	}
}