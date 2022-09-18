//Assignment Operators

class assop //class Declaration; class name same as file name.

{
	public static void main(String args[])
	{
	int a = 21; // initializing variables
	int c = 10;
	
	//Add AND
	c += a; //c = c + a; 10 + 21 = 31;
	System.out.println("the addition is:"+c); // '+c' is used to indicate which value should be print.

	//Multiply AND
	c *= a; //c = c * a; 10 * 21 = 210;
        System.out.println("the multiplication is:"+c); //"System.out.println" use for print line.

    //Subtract AND
	c -= a; //c = c - a; 31 - 21 = 10;
        System.out.println("the substraction is:"+c);

	//Divison AND
	c /= a; // c = c /a; 210/10 = 10;
        System.out.println("the division is:"+c);

    //Mod AND
	c %= a; // c = c % a; 10 % 10 =10;
        System.out.println("the modulos is:"+c);


	}
}


//Output:-
/* the value of c is :31
   the value of c is :10
   the value of c is :210
   the value of c is :10
   the value of c is :10 
 */


											//Prashant Dasnur