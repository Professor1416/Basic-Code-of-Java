// Birwise Operator

class bit //class Declaration; class name same as file name.
{
	public static void main(String args[])
	{
	int a = 50;   //00110010 in binary.
	int b = 30;  //00011110 in binary.
	int c = 0;  // initializing variables
	int d = 0;
	int e = 0;
	int f = 0;
	int g = 0;
	int h = 0;
	int i = 0;

	//Bitwise AND 
	c = a & b; // 00110010 & 00011110 = 00010010 i.e means is '18'.
	System.out.println("the value of (a & b):"+c);

	//Bitwise OR
	d = a | b; // 00110010 | 00011110 = 00111110 i.e means is '62'.
	System.out.println("the value of (a | b):"+d);

	//Bitwise Exclusive XOR
	e = a ^ b; // 00110010 ^ 00011110 = 00101100 i.e means is '44'.
	System.out.println("the value of (a ^ b):"+e);

	//Bitwise Complement of a
	f = ~a; // -(50+1) i.e means is '-51'.
	System.out.println("the value of (~a):"+f);

	//Bitwise Complement of b
	i = ~b; //
	System.out.println("the value of (~b):"+i);

	//Bitwise Shift Left
	g = a << 2; //50=110010 << 2 :- 11001000 i.e means is '200'. //Shift with 2 zero to left side.
	System.out.println("the value of (a << b ):"+g);

	//Bitwise Shift Right
	h = a >>> 2; // 50=110010 >>> 2 :-  001100 i.e means os '12'. //Shift with 2 zero to right side.
	System.out.println("the value of (a >>> b):"+h);

	}
}


//Outpit
/*
the value of (a & b):18
the value of (a | b):62
the value of (a ^ b):44
the value of (~a):-51
the value of (~b):-31
the value of (a << b ):200
the value of (a >> b):12
*/

                                                 //Prashant Dasnur