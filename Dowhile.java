//Do While

class Dowhile //class Declaration; class name same as file name.
{
	public static void main(String args[]) //Main Method
	{
		int a = 10; // initializing variables
		do
		{
			System.out.println("the value of a is:"+a); // '+c' is used to indicate which value should be print.
			a++;                                       // a++ for this condition 'a <= 20'. value increase upto 20.
		}while(a <= 20);                              //(a=10 <= 20) the condition is True; therefore execute conditional code.
                                                     //the condition is true; then control jumps to back 'do', and the loop again ececutes unitl then condition is false.
	}
}



//Output
/*
the value of a is:10
the value of a is:11
the value of a is:12
the value of a is:13
the value of a is:14
the value of a is:15
the value of a is:16
the value of a is:17
the value of a is:18
the value of a is:19
the value of a is:20
*/


                                     //Prashant Dasnur