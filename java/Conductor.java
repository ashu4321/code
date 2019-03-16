class Conductor
{

	Ticket giveticket(int money,String desti)
	{

		Ticket t=new Ticket();
		t.price=money;
		t.dest=desti;
		return t;
	}
}