//Relational(Comparison) Operator

class reop //class Declaration; class name same as file name.
{
	public static  void  main(String args[]) //Main Method
	{
		int  a = 21; //initializing variables
		int b = 10;
	    
	    //equal to
		System.out.println("a is equal to b: "+(a == b)); // (a=21 == b=10) is False; Therefore a is not equal to b.
                                                        //the two given values are equal to each other then result will be True, Otherwise it returns False.
		
		//not equal to
		System.out.println("a is not equal to b: "+(a != b)); // (a=21 != b=10) is True; Therefore a is not equal to b.
                                                            // '!'not is True statement consider False and False statement consider to True.

		//grater than	
		System.out.println("a is grater than b: "+(a > b)); //(a=21 > b=10) is True; Therefore a is grater than b.
                                                          //the first value is grater than the second value then result will be True, Otherwise it returns False.
        
    	//less than    
        System.out.println("a is less  than b: "+(a < b)); //(a=21 < b=10) is False; Therefore a is not less than b.
                                                               //the first value is less than the second value then result will be True, Otherwise it returns False.
    	//grater than or equal to
		System.out.println("a is grater than or equal to b: "+(a >= b)); //(a=21 >= b=10) is True; Therefore a is grater than or equal to b.
                                                                  //the first value is grater than or equal to the second value then result will be True, Otherwise it returns False.
		//less than or equal to
        System.out.println("a is less  than or equal to b: "+(a <= b)); //(a=21 <= b=10) is False; Therefore a is not less than or equal to  b.
                                                                       //the first value is less than or equal to  the second value then result will be True, Otherwise it returns False.
	}

}



//Output
/*
a is equal to b: false
a is not equal to b: true
a is grater than b: true
a is less  than b: false
a is grater than or equal to b: true
a is less  than or equal to b: false
*/




                                               //Prashant Dasnur