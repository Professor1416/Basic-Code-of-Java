//Switch Char:- In switch char we use character for ex. + ,-, *, /, %, @

class switch_char //class Declaration; class name same as file name.
{
	public static void main(String args[]) //Main Method
	{
		char ch = '+'; //which case you want to execute 'Enter' case value.
		int a = 30; //initializing variables
		int b = 20;
		int c;

		switch (ch)
		{
			case '+': //the case label must end with colon(:)
			{
				//Addition
				c = a + b ;
				System.out.println("the add of a + b is:"+c); //"System.out.println" use for print line.
				break; //It's necessary to use break after each block.
			}

			case '-': //case label must be unique
        	{
        		//Subtract
        		c = a - b;
        		System.out.println("the subtraction of a - b is:"+c); // '+c' is used to indicate which value should be print.
				break; //if you don't use it, then all cases executed.
			}

			case '/':
        	{
         		//Divition
         		c = a / b;
         		System.out.println("the division of a / b is:"+c);
				break;
        	}

			case '*':
        	{
        		//Multiply
        		c = a * b;
        		System.out.println("the multiplication of a * b is:"+c);
        		break;
			}

			case '%':
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

case '+': c = a + b;
the value of a+b is:50

case '-': c = a - b;
the value of a-b is:10

case '/': c = a / b;
the value of a/b is:1

case '*': c = a * b;
the value of a*b is:600

case '%': c = a % b;
the value of a%b is:10
*/


                                                //Prashant Dasnur