//break and continue statement

class Break //class Declaration; class name same as file name.
{
	public static void main(String args[]) //Main Method
	{
		int a = 10; // initializing variables

		while(a <= 20)
		{
			if(a == 15) //(a==15)when... //block of code to be executed if the condition is True.
			{
				a++;
				System.out.println("in if statement a is:"+a); // '+c' is used to indicate which value should be print.
				continue;                                 //Break :- when the loop iterates for first time, the value of i=10, the if statement result will be false, so the else condition is executed. 
	                                                     //loop iterates again now i=15; if condition result will be 'True' and loop breaks.
	                  //you can also use 'break'        //Continue:-when the loop iterate for the first time the value of i=10, the if statement result will be false, so the else condition 2 is implemented.
	                                                   //loop iterates again now i=15; if condition result will be 'True' and the code stop in between and strat new iterate unitl the end condition met.
			}
			System.out.println("the value of a is:"+a); //"System.out.println" use for print line.
			a++; // a++ for this condition 'a <= 20'. value increase upto 20.
		}
	}

}


//Output
/*
//Output for Break
the value of a is:10
the value of a is:11
the value of a is:12
the value of a is:13
the value of a is:14
in if statement of a is:16

//Output for Continue
the value of a is:10
the value of a is:11
the value of a is:12
the value of a is:13
the value of a is:14
in if statement of a is:16
the value of a is:16
the value of a is:17
the value of a is:18
the value of a is:19
the value of a is:20
*/



                                       //Prashant Dasnur