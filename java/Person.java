class Person
{

	void buyticket()
	{
Conductor c= new Conductor();
Ticket tz=c.giveticket(80,"Agra");
System.out.println(tz.price);
System.out.println(tz.dest);
	}


public static void main(String ars[])
{

	Person p=new Person();
	p.buyticket();
}}