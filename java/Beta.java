class Beta {
String y="jspider";
	void print()
{
	String y="qspider";
	System.out.println(y);
	System.out.println(this.y);

}
void disp(String y)
{
	System.out.println(y);
	System.out.println(this.y);
}


public static void main(String ars[])
{ Beta b=new Beta();
	b.print();
	
   Beta b1=new Beta();
	b1.y="Ashu";
	System.out.println(b1.y);
	b1.print();
	b1.disp("manas");

	new Beta().disp("gunjan");  //Anonymos object which do not have a reference.
}}