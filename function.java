//Function Arthmatic Operation

class funtion //class Declaration; class name same as file name.
{


	public static void main(String args[]) 
	{
		int rs1,rs2,rs3,rs4,rs5;

		rs1 = add(30,20); //Calling the Function and Storing.
		System.out.println("the addition is:"+rs1);

 		rs2 = sub(30,20);
        	System.out.println("the subtraction is:"+rs2); // '+rs2' is used to indicate which value should be print.

 		rs3 = divi(30,20);
        	System.out.println("the division is:"+rs3); //"System.out.println" use for print line.

 		rs4 = multi(30,20);
       		System.out.println("the multiplication is:"+rs4); 

		rs5 = mod(30,20);
       		System.out.println("the modulos is:"+rs5); 

	}

	//Function Definition
	static int add(int a, int b)
	{
		int  c; //take new variable for store a result value.
		c = a + b;
		return c; // return c is returns the sum of the two parameters.
	}

	static int sub(int a, int b)
	{
        	int  c;
        	c = a - b;
		return c;
	}

	static int divi(int a, int b)
	{
        	int  c;
        	c = a / b;
		return c;
	}

	static int multi(int a, int b)
	{
       		int  c;
        	c = a * b;
		return c;
	}	

	static int mod(int a, int b)
	{
       		int  c;
        	c = a % b;
		return c;
	}
}

//Output
/*
the addition is:50
the subtraction is:10
the division is:1
the multiplication is:600
the modulos is:10
*/


                                                     //Prashant Dasnur