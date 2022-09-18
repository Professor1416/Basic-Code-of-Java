//Logical Operator

class logi //class Declaration; class name same as file name.
{
	public static void main(String args[]) //Main Method
	{
		int a = 10; //initializing variables
		int b = 7;

		//Logical AND
		//we use also  Logical NOT
		if(!((a > b) && (a != b))) // !(a=50 > b=30) is False && (a=50 != b=30) is True; Therefore this statement is False.
                   		          // when both statement are True then result will be True.
		{
			System.out.println("First statement is true"); //"System.out.println" use for print line.
		}
		else //when if condition false then else condition executed
		{
			System.out.println("First statement is false");
		}

		//Logical OR
		if((a > b) || (a != b)) // (a=50 < b=30) is False || (a=50 != b=30) is True; therefore this statement is True.
                   		       //if one(or both) statement is True then result will be True, Otherwise it returns False.
                       		  // '!'not is True statement consider False and False statement consider to True.
		{
			System.out.println("Second statement is true");
		}
		else
		{
			System.out.println("Second statement is false");
		}

	}
}



//Output
/*
//Logical AND
First statement is false

//Logical OR
Second statement is true

*/


                                    //Prashant Dasnur