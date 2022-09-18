//if-else-if Example:- Grade

class grade //class Declaration; class name same as file name.
{
public static void main(String args[]) //Main Method
{
	int sub1 = 81;
	int sub2 = 79;// initializing variables
	int sub3 = 87;
	int sub4 = 83;
	int sub5 = 85;
	int per;
	int per2;

	per =  sub1 + sub2 + sub3 + sub4 + sub5;
	per2 = per / 5;
	System.out.println("Persentage:"+per2);

	if(per2 >= 90)
	{
	System.out.println("Grade A"); //These statements would execute if the condition is true
	}

	else if(per2 >= 80)
	{
	System.out.println("Grade B"); //"System.out.println" use for print line.
	}

	else if(per2 >= 70)
        {
        System.out.println("Grade C");
        }

	else if (per2 >= 60)
        {
        System.out.println("Grade D");
        }

	else if (per2 >= 40)
	{
	System.out.println("Grade E");
	}

	else
	{
	System.out.println("Grade F"); //These statements would execute if all the conditions return false.
	}
}
}



//Output
/*
Persentage:83
Grade B
*/




                                            //Prashant Dasnur