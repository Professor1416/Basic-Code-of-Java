class Emp  
{
	public String n;
	public double s;

	public Emp(String en)
	{
	n = en;
	}

	 public void setsal(double es)
	{
	s = es;
	}

	public void printemp()
	{
	System.out.println("the value of n is :"+n);
	System.out.println("the value of s is :"+s);
	}

	public static void main(String args[])
	{
	Emp e1=new Emp("Mangesh");
	e1.setsal(300000);
	e1.printemp();

	Emp e2=new Emp("Sachin");
	e2.setsal(400000);
	e2.printemp();
	}
}
