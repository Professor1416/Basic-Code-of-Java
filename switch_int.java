//Switch Integers:- In Switch Integer we use Numbers(integers)

class switch_int //class Declaration; class name same as file name.
{
	public static void main(String args[]) //Main Method
	{
		int _int = '5'; //which case you want to execute 'Enter' case value.
		int a = 30; //initializing variables
		int b = 20;
		int c;

		switch (_int)
		{
			case '1': //the case label must end with colon(:)
			{
				//Addition
				c = a + b ;
				System.out.println("the add of a + b is:"+c); //"System.out.println" use for print line.
				break; //It's necessary to use break after each block.
			}

			case '2': //case label must be unique.
        	{
        		//Subtract
        		c = a - b;
        		System.out.println("the subtraction of a - b is:"+c); //'+c' is used to indicate which value should be print.
				break; //if you don't use it, then all cases executed.
			}

			case '3': //integer value write in 'single quotes'.
        	{
        		//Division
         		c = a / b;
         		System.out.println("the division of a / b is:"+c);
				break;
        	}

			case '4':
        	{
        		//Multiply
        		c = a * b;
        		System.out.println("the multiplication of a * b is:"+c);
        		break;
			}

			case '5':
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

case 1: c = a + b;
the value of a+b is:50

case 2: c = a - b;
the value of a-b is:10

case 3: c = a / b;
the value of a/b is:1

case 4: c = a * b;
the value of a*b is:600

case 5: c = a % b;
the value of a%b is:10
*/





                              //Prashant Dasnur