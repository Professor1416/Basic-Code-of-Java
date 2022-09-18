//Switch String:- In Switch String we use words and numbers in "duble quotes".

class switch_string //class Declaration; class name same as file name.
{
	public static void main(String args[]) //Main Method
	{
		String ch = "three"; //which case you want to execute 'Enter' case value.
		int a = 30; //initializing variables
		int b = 20;
		int c;

		switch(ch)
		{
			case "one": //the case label must end with colon(:)
			{
				//Addition
				c = a + b ;
				System.out.println("the add of a + b is:"+c); //"System.out.println" use for print line.
				break; //It's necessary to use break after each block.
			}

			case "two": //case label must be unique.
        	{
        		//Subtract
        		c = a - b;
        		System.out.println("the subtraction of a - b is:"+c); //'+c' is used to indicate which value should be print.
				break; //if you don't use it, then all cases executed.
			}

			case "three": //String value write in 'double quotes'.
        	{
         		//Division
         		c = a / b;
         		System.out.println("the division of a / b is:"+c);
				break;
        	}

			case "four":
        	{
        		//Multiply
        		c = a * b;
        		System.out.println("the multiplication of a * b is:"+c);
        		break;
			}

			case "five":
        	{
        		//Modulus
        		c = a % b;
        		System.out.println("the modulos of a % b is:"+c);
       		 	break;
			}

			default: //If none of the case label values matches to the value of the expression, then default part statement will be executed.
			{
        		System.out.println("<<Enter The Valid Value>>");
			}
		}
	}
}



//Output
/*
a = 30; b = 20;

case one: c = a + b;
the value of a+b is:50

case two: c = a - b;
the value of a-b is:10

case three: c = a / b;
the value of a/b is:1

case four: c = a * b;
the value of a*b is:600

case five: c = a % b;
the value of a%b is:10
*/


                                                   //Prashant Dasnur