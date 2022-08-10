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
                
        --------------------------------------------------------------------------------------------------
        --------------------------------------------------------------------------------------------------
        // Widening Casting / Automatic Casting : byte -> short -> char -> int -> long -> float -> double
        // Narrowing Casting : double -> float -> long -> int -> char -> short -> byte
        
        byte b = 12;

        short s = b;

        int i = s;

        float f = i;

        double d = f;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);

        int i = 'U';
        System.out.println(i); // prints 85
        // In automatic conversion, smaller data types can fit in larger datatypes and conversion is taken care by java

        double d = 12.43;

        float f = (float)d;

        long l = (long)f;

        int i = (int)l;

        short s = (short)i;

        byte b = (byte)s;
        
        int x = 98;
        char c = (char)x;
        System.out.println(c); // prints b as o/p
  
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
                
        --------------------------------------------------------------------------------------------------------------------
        --------------------------------------------------------------------------------------------------------------------
        // Type Conversion cannot perform on boolean, char and String 
        // We cannot cast above 6 datatypes into boolean
        byte b = 88;

        char c = (char)b;

        System.out.println(c); // prints X

        ---------------------------------------------------------------------------------------------------------------------
         // As boolean takes just 1 bit, There  is no widening / automatic casting for boolean's
         // Narrowing casting is not possible into booleans
         // boolean b1 = (boolean)21; gives error as : Inconvertible types; cannot cast 'int' into 'boolean'
         // Similarly for float, double, long , char, byte, short we gets the same error with respective names
                
        ----------------------------------------------------------------------------------------------------------------------
        **********************************************************************************************************************
         // Arithmetic Operators : +, -, *, /, % , ++, --
         
         byte b = 21;

         short s = 231;

         int i = 4321;

         long l = 47236482394L;

         float f = 432.3221f;

         double d = 762.67823;

         char c = 'G';

         boolean bool = true;
         
         //<---------------- BIG NOTE : Acc to Oracle, Binary arithmetic operations on char and byte (and short) promote to int ----------------------->
         // ASCII Table : <----------------https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html---------------------------->
          
         // Addition :

         System.out.println(((Object)(b+b)).getClass());
         System.out.println(((Object)(b+s)).getClass());
         System.out.println(((Object)(b+i)).getClass());
         System.out.println(((Object)(s+s)).getClass());
         System.out.println(((Object)(s+i)).getClass());
         System.out.println(((Object)(b+c)).getClass());
         System.out.println(((Object)(s+c)).getClass());
         System.out.println(((Object)(c+c)).getClass());    

         // The above all lines gives o/p as  "class java.lang.Integer" as i said in line 168

         System.out.println(21+'F'); // prints 91 as by default arithmetic operations on char results in integer
         System.out.println(((Object)(21+'F')).getClass()); // prints class java.lang.Integer
         System.out.println('A'+'B'); // prints 131 as arithmetic operations on char results in integer
         char c1 = 'A';
         char c2 = 'B';
         System.out.println(c1); // prints A
         System.out.println(c2); // prints B
         // char c3 = c1 + c2;  This raises error as c1+c2 gives integer , that integer we are trying to keep in char, we need to typecast it inorder to store
         char c3 = (char)(c1+c2); // Now this works 
         System.out.println(c3); 
 
         char c = 48;
         char d = 54;
         System.out.println(c); // prints 0 as 48 in decimal matches to 0 in characters in ascii table
         System.out.println(d); // prints 6 as 54 in decimal matches to 6 in characters in ascii table
         char e = (char)(c+d); // c+d = 102 in decimal that matches to character 'f' in ascii table
         System.out.println(e); // prints 102

         // Generally char+int = int acc to line 168, but we are storing in char, so type casting implicitly occurs 

         // int + byte = int, if we want int + byte as byte , we need to cast into byte
         // short + int = int, if we want int + short as short , we need to cast into short
         // byte + short = short, if we want byte + short as byte, we need to cast into byte
         // int + long = long, if we want int + long as int , we need to cast into int
         // float + double = double, if we want float + double as float, we need to cast into float
         // int + float = float
         // int + double = double
         // short + float = float
         // byte + float = float
         // short + double = double
         // byte + double = double
         

         // Big datatype + small datatype = big datatype
         // If we want to store big dt + small dt in big dt , then no error
         // but, if we want to store big dt + small dt in small dt, we need to type cast
         // Look at examples below for more:

         // How int, float, byte, short, long, double works on char
         byte b0 = (byte)(b + c);
         // we need to narrow cast as byte memory is lower than that of char memory, byte-1 byte < char-2 bytes , b0 prints 92
         int b1 = i + c;
         // ascii value of G is 71 , so i+c = 4321+71 = 4392 stores in b1
         short b3 = (short)(s+c); // prints 302 , in type casting order short comes before char, so we need to typecast it

         long b4 = l + c;

         float b5 = f + c;

         double b6 = d + c;

         // why only short and byte needs to be cast in above 6 lines
         // Type Casting Order : byte > short > char > int > long > float > double
         // AS byte, short are < char, we need to cast them but rest of them are not < char , so no cast required
         // NOTE : While adding character to any other datatype, it is converted to it's ascii value before addition
         ---------------------------------------------------------------------------------------------------------------------------
         ---------------------------------------------------------------------------------------------------------------------------
         // https://stackoverflow.com/questions/14342988/why-are-we-allowed-to-assign-char-to-a-int-in-java
         // A char is simply an unsigned 16-bit number, so since it's basically a subset of the int type, the JVM can cast it without any ambiguity.
         // char has a dual personality.
         // It is a 16 bit unsigned integer numeric type, which makes assignment to int a very natural operation, involving widening primitive conversion, one of the conversions that the compiler will insert if needed without requiring an explicit cast.
         // It is also the way characters are represented for I/O and String operations.
                 
         // char: The char data type is a single 16-bit Unicode character.
         // It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

         // We can assign an integer to char data type
         int a = 'g';
         System.out.println(a); // prints 103

         // We can assign an integer
         char c = 65535;
         System.out.println(c); // prints Upper Case '?'

         // Any integer above 65535 gives error in line 14

         --------------------------------------------------------------------------------------------------------------------------
         --------------------------------------------------------------------------------------------------------------------------
         // Now Multiplication :
                 
         // Any arithmetic operations on byte,short and char results in int only acc to Oracle Corp..
         System.out.println(((Object)(b-b)).getClass());
         System.out.println(((Object)(b-s)).getClass());
         System.out.println(((Object)(b-i)).getClass());
         System.out.println(((Object)(s-s)).getClass());
         System.out.println(((Object)(s-i)).getClass());
         System.out.println(((Object)(b-c)).getClass());
         System.out.println(((Object)(s-c)).getClass());
         System.out.println(((Object)(c-c)).getClass());

         // The above all gives output as : class java.lang.Integer


         System.out.println(((Object)(l-i)).getClass());
         System.out.println(((Object)(l-s)).getClass());
         System.out.println(((Object)(l-b)).getClass());
         // The above 3 lines gives class java.lang.Long
         System.out.println(((Object)(f-l)).getClass());
         System.out.println(((Object)(f-i)).getClass());
         System.out.println(((Object)(f-s)).getClass());
         System.out.println(((Object)(f-b)).getClass());
         // The above 4 lines gives class java.lang.Float
         System.out.println(((Object)(d-f)).getClass());
         System.out.println(((Object)(d-l)).getClass());
         System.out.println(((Object)(d-i)).getClass());
         System.out.println(((Object)(d-s)).getClass());
         System.out.println(((Object)(d-b)).getClass());
         // The above 5 lines gives class java.lang.Double

         -----------------------------------------------------------------------------------------------------------------------------
         -----------------------------------------------------------------------------------------------------------------------------
         // Now Multiplication : 
                 
         // Any arithmetic operations on byte,short and char results in int only acc to Oracle Corp..
                 
         System.out.println(((Object)(b*b)).getClass());
         System.out.println(((Object)(b*s)).getClass());
         System.out.println(((Object)(b*i)).getClass());
         System.out.println(((Object)(s*s)).getClass());
         System.out.println(((Object)(s*i)).getClass());
         System.out.println(((Object)(b*c)).getClass());
         System.out.println(((Object)(s*c)).getClass());
         System.out.println(((Object)(c*c)).getClass());

         // The above all lines prints class java.lang.Integer
 
        System.out.println(((Object)(l*i)).getClass());
        System.out.println(((Object)(l*s)).getClass());
        System.out.println(((Object)(l*b)).getClass());
        // The above 3 lines gives class java.lang.Long
        System.out.println(((Object)(f*l)).getClass());
        System.out.println(((Object)(f*i)).getClass());
        System.out.println(((Object)(f*s)).getClass());
        System.out.println(((Object)(f*b)).getClass());
        // The above 4 lines gives class java.lang.Float
        System.out.println(((Object)(d*f)).getClass());
        System.out.println(((Object)(d*l)).getClass());
        System.out.println(((Object)(d*i)).getClass());
        System.out.println(((Object)(d*s)).getClass());
        System.out.println(((Object)(d*b)).getClass());
        // The above 5 lines gives class java.lang.Double

        -----------------------------------------------------------------------------------------------------------------------------
        -----------------------------------------------------------------------------------------------------------------------------
        // Now Divsion and Remainder Operators : 
        // NOTE : There is no modulo operator in java by default, We can use Math.floorDiv(a,b) for modulo operations.
                
        System.out.println(21/11); // 1
        System.out.println(-21/11); // -1
        System.out.println(21/-11); // -1
        System.out.println(0/11); // 0
        System.out.println(21/0); // ArithmeticException
        System.out.println(11/21); // 0
        System.out.println(-11/21); // 0
        System.out.println(11/-21); // 0

        System.out.println(21%11); // 10
        System.out.println(-21%11); // -10
        System.out.println(21%-11); // 10
        System.out.println(0%11); // 0
        System.out.println(11%21); // 11
        System.out.println(-11%21); // -11
        System.out.println(11%-21); // 11
        
        // small num / big num = 0
        // -num1 / num2 = -result
        // num1 / -num2 = -result
        // -num1 / -num2 = result

        // small num % big num = small num
        // -num1 % num2 = -result
        // num1 % -num2 = result
        // -num1 % -num2 = -result

        float a = 2.32f;

        float b = 54.32f;

        float c = a/b;

        float d = a%b;

        System.out.println(c); // prints 0.042709865
        System.out.println(d); // 2.32
        
        // The above mentioned formulas are all applicable to float and double values also...
                
        ******************************************************************************************************************************
        
        

         


               
          
                 
         
                 
         
                 
         

         
         
         


        
        
          
               
        
        
        
