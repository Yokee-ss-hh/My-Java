// https://www.geeksforgeeks.org/data-types-in-java/


        // range from -2**7 to 2**7-1 (-128 to 127)
        // 8-bit signed two’s complement integer.
        // default = 0
        byte b = 12;

        // range from -2**15 to 2**15-1
        // 16-bit signed two’s complement integer.
        // default = 0
        short s = 200;


        // 32-bit signed two’s complement integer.
        // range from 2**31 to 2**31-1
        // default = 0
        // UnSigned int range from 0 to 2**32-1 , Use Integer Wrapper class to use int data type as an unsigned integer
        int i = 14412;


        // 64-bit signed two’s complement integer.
        // range from 2**63 to 2**63-1
        // default = 0L
        // UnSigned long range from 0 to 2**64-1,Use Long Wrapper class to use long data type as an unsigned long integer
        long l = 3717361654646454652L; // removing L gives error as "integer number too large"


        // single-precision 32-bit IEEE 754 floating-point
        // range is 2**31 to 2**31-1
        // can use 'f' or 'F'
        // default = 0.0f
        float f = 23.0234245756765576567576575675675555555555555555577777777777777775555555f;

        System.out.println(f); // prints 23.023424 means 6 digits of precision as max

        // if 'f' is remove din line 33, we get error

        // By default, decimal points numbers are double type only that's why 'f' is needed while denoting float value
        // we can use 'd' or 'D' but not mandatory
        // default = 0.0d
        double d = 23.0234245756765576567576575675675555555555555555577777777777777775555555;

        System.out.println(d); // prints 23.023424575676557 means 15 digits of precision as max



        // Finally,

        // For normal numbers without decimal, No need to explicitly denote the type at the last of the literal
        // by default it takes as an integer, For long data types we need to denote that long variable as L/l because
        // java by default takes numbers as int


        // For decimal numbers, java treats them as double datatype value, so while declaring floating value we need
        // to explicitly give f/F at the last of the literal


        // default = false
        boolean boo = true;

        // default = '\u0000'
        // 16 bit / 2 bytes as java supports 16 languages
        char c1 = 'f';
        System.out.println(c1); // java prints the character itself unless we typecast it to integer
        System.out.println((int)c1);

        char c2 = 102;  // java consider this as ascii value
        System.out.println(c2); // java internally converts ascii value to respective character


        // String is not a primitive type , default = null
        
        
        ---------------------------------------------------------------------------------------------------
        ---------------------------------------------------------------------------------------------------
                
         // https://www.geeksforgeeks.org/rounding-off-errors-java/

        // float and double data types implement IEEE floating point 754 specification.

        // https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html
                
        // Read why IEEE 754 is very important in floating point arithmetic operations (very important)
               
        
        
        
