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
         // Java Operators Guide By Oracle : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
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
         //<---- Arithmetic operators on any 2 datatypes will give o/p in terms of larger datatype in b/w 2 of them -------->
         // <-- Let's say : byte b = 21; int i = 4321; Adding both give o/p as 4342 that is 'int' as 'int' is greater in b/w 'byte' and 'int'.--->
         // <--The above line is the same reason why i = i+1 needs narrowing casting but i++ do not -->
         // <-- Read this blog to understand more about the above line (https://www.geeksforgeeks.org/difference-x-xx1-java/)-->
         // <--- x++ casting is done by java internally, For, x=x+1 we need to do manual casting ---->
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
         // Arithmetic operator on byte and char will result in int . So b+c result in an integer 92. But we gave byte b0 and we are trying to store in int
         // That's why we are doing casting
         int b1 = i + c;
         // int + char will result in int (Read Line 169,170) 
         short b3 = (short)(s+c); // prints 302, (Acc to line 169,170 : short + char -> int, but we cannot store that integer in short, so narrowing casting is done)

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
        
        // Relational Operators :  > , < , >= , <= , == and != [greater than, less than, greater than equals to,less than equals to, double equals to, not equals to ]
        // <--- == operator, equals() method works differently on primitive data types and reference data types --->
        // https://stackoverflow.com/questions/1586223/how-does-the-tostring-equals-object-methods-work-differently-or-similar
        // To Compare Strings In Java : https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
        // == vs equals() on strings (got to end of this page for best example) : https://stackoverflow.com/questions/7520432/what-is-the-difference-between-and-equals-in-java
        // For the primitive types, == compares the 2 datatypes stores same values or not, We cannot use equals() method on primitive types, that means we cannot
        // call equals() and toString() methods on primitive types.
        // For Regular reference types(like Strings and user-defined classes/objects), == checks whether 2 objects are pointing to same memory address or not
        // and equals() method checks whether these 2 objects have same values or not.
        // == some times wont work on Wrapper class objects also...
        // == Works on Wrapper class objects if we compare 1 wrapper object with 1 primitive datatype 
        
        byte b1 = 21;

        int i1 = 21;

        Byte b2 = b1; // or directly assign 21 without reference from b1, results will be same 

        Integer i2 = i1; // or directly assign 21 without reference from i1, results will be same

        System.out.println(b1 == i1); // true
        System.out.println(b1 == b2); // true
        System.out.println(i1 == i2); // true
        // System.out.println(b2 == i2); // Error : Operator cannot be applied to Byte and Integer
        System.out.println(b1 == i2); // true
        System.out.println(b2 == i1); // true

        // From above results, primitive types won't care about their types and only care about their stored values
        // Object types do care about their types when comparing over ==
        // And, 2 wrapper objects cannot be compared on == . i.e, b2 and i2 cannot be compared on == as they both have diff types

        // Object and primitive variables of same datatype can be compared on == , i.e(b1 and b2 , i1 and i2)
        // Object and primitive variables of diff datatype also be compared on ==, i.e,(b1 and i2, i1 and b2)

        // Let's move to equals()
        // System.out.println(b1.equals(b2)); raises error as b1 is not an object
        //System.out.println(i1.equals(b1); raises error as i1 is not an object

        System.out.println(b2.equals(b1)); // returns true as b2 is an object to use equals() method
        System.out.println(i2.equals(i1)); // returns true
        System.out.println(b2.equals(i2)); // returns false because both are not same data types to compare
        System.out.println(i2.equals(b2)); // returns false because both are not same data types to compare
        System.out.println(b2.equals(i1)); // returns false because both are not same data types to compare
        System.out.println(i2.equals(b1)); // returns false because both are not same data types to compare

        // NOTE : equals() method works only if 2 variables are of same data type and left operand should be an object.

        
        Byte b = 21;

        Byte i = 21;

        Byte b1 = 31;

        Byte b2 = 41;

        System.out.println(b == i); // true

        System.out.println(b1 == b2); // false

        // In case of wrapper objects == returns true only if both values and datatypes of 2 operands is same. If any of these 2 rules violate it returns false
        // Look from line 427 to 437 to understand the above line.
 
        // For the other Relational Operators other than '==', i.e, >, <, >=, <=, !=  
        // We can compare 2 variables even they are Objects of 2 different types(see in line 441), but in line 402 we can't use '==' on Byte and Integer Objects.
       
        byte b1 = 21;

        int i1 = 21;

        int i3 = 55;

        Byte b2 = b1;

        Integer i2 = i1;

        System.out.println(b1 < i3);
        System.out.println(b2 <= i1);
        System.out.println(b2 <= i2);
        System.out.println(i3 > b1);
        System.out.println(i2 < i3);
        ******************************************************************************************************************************
        // Logical Operators : &&, || and ! (Logical and, Logical or and Logical not), Acc to oracle there is no '!' under logical operators
        // '!' comes under unary operators.
        // Ternary Operator comes under Logical Operators.
        
        byte b = 23;

        int i = 4573;

        if (!(b % 2 == 0)) {
            System.out.println("b is odd number");
        }
        if(b % 2 != 0 && i % 2 != 0) {
            System.out.println("b and i are odd numbers");
        }
        if (20 % 2 != 0 || i % 2 != 0) {
            System.out.println("Either of 2 conditions says one is odd");
        }
      
        ******************************************************************************************************************************
        // Ternary / Conditional Operator
        
        // Syntax : variable = Expression1 ? Expression2: Expression3
                
        int a = 20;

        int b = 30;

        int max = (a > b) ? a : b;

        System.out.println("maximum in between a and b is :" + max); // o/p : maximum in between a and b is : 30
       
        // Ternary operator is basically an if-else loop 
        // if (a > b){
        //    max = a;
        // } 
        // else {
        //   max = b;
        // }
        // Instead of writing the whole if-else we can simply use ternary/ conditional operator

        ******************************************************************************************************************************
        // Assignment Operator : '='
        // Compound assignment operators : +=, -=, *=, /=, %= , <<=, >>=, &=, |=, ^=, ~= 
        // x+=3 and x=x+3 gives same result but for x+=3 java does type casting but for x = x+3, we need to do casting
        
        byte b = 21;

        //b = b + 3;
        System.out.println(((Object)(3)).getClass()); // proof for 3 is an integer even though 3 comes in range of byte  : o/p is class java.lang.Integer
        // Here, on the right side we have b + 3, b is of type 'byte' and 3 is of type 'int'
        // So, b+3 is 'int' finally . b = b+3 => we are assigning b+3 which is an integer to 'b'
        // which is of type 'byte'.This is not possible, so we need to typecast it to byte using
        // narrow casting as,
        b = (byte)(b+3);
        System.out.println(b);

        b +=3;
        // In this compound assignment, there is no need to do type casting as java internally
        // perform casting to the type of 'b'.That is java internally performs b = b+3 for b+=3 , as soon as it knows that b+3 gives integer
        // It checks for the type of 'b' and converts the b+3 type into type of b.
        // So, Using compound assignments is much beneficiary than using manual process.

        ******************************************************************************************************************************
        // Unary Operators :
        // +       Unary plus operator; indicates positive value (numbers are positive without this, however)
        // -       Unary minus operator; negates an expression
        // ++      Increment operator; increments a value by 1
        // --      Decrement operator; decrements a value by 1
        // !       Logical complement operator inverts the value of a boolean
        
        
        int a = 10;

        int b = +a;

        System.out.println(b); // 10

        int c = -a;

        System.out.println(c); // -10

        int a = 10;

        int b = ++a; // pre increment

        System.out.println(a); // 10
        System.out.println(b); // 11

        int c = 20;

        int d = c++;  // post increment

        System.out.println(d); // 20
        System.out.println(c); // 21

        // Similarly java has post-decrement and pre-decrement
        int a = 10;

        int b = --a;

        System.out.println(a); // 9
        System.out.println(b); // 9

        int c = 20;

        int d = c--;

        System.out.println(d); // 20
        System.out.println(c); // 19

        boolean b = false;

        if (!b)
        {
            System.out.println("HELLO");
        }
        
        ******************************************************************************************************************************
        // Bitwise Operators : &(AND), |(OR) , ^(XOR), ~(COMPLIMENT) 
        
        int a = 5; // 0101

        int b = 2; // 0010

        var c = a & b; // 0000 = 0

        var d = a | b; // 0111 = 7

        var e = a ^ b; // 0111 = 7

        var f = ~a; // ~a = 1010 = 10, But java returns 2's complement of 10 i.e, -6
        // Formula would be ~num = -(num+1)

        System.out.println(c); // 0
        System.out.println(d); // 7
        System.out.println(e); // 7
        System.out.println(f); // -6
 
        ******************************************************************************************************************************
        // Look at this best video first : https://www.youtube.com/watch?v=4qH4unVtJkE
        // The above video explains how computers uses 2's complement of integers while calculating internally.....
        // Bitwise Shift Operators <<(signed left shift), >>(signed right shift) and >>>(right side shift filled with zeroes)

        int a = 32;
        int b = 3;

        System.out.println(a << b); // 256
        System.out.println(Integer.toBinaryString(a << b)); // 100000000
        // a << b = a * (2 power b)

        System.out.println(a >> b); // 4
        System.out.println(Integer.toBinaryString(a >> b)); // 100
        // a >> b = a / (2 power b)

        System.out.println(a >>> b); // 4
        System.out.println(Integer.toBinaryString(a >>> b)); // 100

        ****************************************************************************************************************
        // instance of operator :
        // The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
        
        Integer a = 23;
        System.out.println(a instanceof Integer); // true

        String b = "hello";
        System.out.println(b instanceof String); // true

        *****************************************************************************************************************
        // Wrapper Classes
        
        byte a = 21;

        short b = 355;

        int c = 4321;

        long d = 821317236L;

        float e = 32.211f;

        double f = 122.31312;

        char g = 'H';
  
        boolean h= false;

        // AutoBoxing : primitive data types -> Objects
        // The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing
        // From java5, no need to use valueOf() in autoboxing.

        Byte a1 = a;
        Short b1 = b;
        Integer c1 = c;
        Long d1 = d;
        Float e1 = e;
        Double f1 = f;
        Character g1 = g;
        Boolean h1 = h;
        
        System.out.println(a1); // 21
        System.out.println(b1); // 355
        System.out.println(c1); // 4321
        System.out.println(d1); // 821317236
        System.out.println(e1); // 32.211
        System.out.println(f1); // 122.31312
        System.out.println(g1); // H

        // Using above method,we can only assign similar type of data types to the same type of wrapper class object
        // That means, I can assign variable 'a' to 'a1', 'b' to 'b1' only..
        // If i assign 'a' to 'c1' , i gets error because in the above-mentioned process of autoboxing,
        // implicit type-casting is not done by the java
        // If we want we can explicitly type cast and assign as,
        Integer c11 = (int)a;

        // I type cast byte variable 'a' into 'int' to store that in Integer wrapper object.

        // If we want java to automatically typecast so that we can provide any type of value to wrapper class
        // objects, then we need to use valueOf() method.
        
        Byte a2 = Byte.valueOf(a);
        System.out.println(a2); // 21

        Short b2 = Short.valueOf(a);
        System.out.println(b2); //21

        Integer c2 = Integer.valueOf(a);
        System.out.println(c2); // 21

        // In the above 3 examples, we passed variable 'a' into Byte,Short and Integer Objects
        // Let's try to store large variables into small variables
        // i.e, Let's try to pass int,short into Byte wrapper object

        // Byte a4 = Byte.valueOf(b);

        // Byte a5 = Byte.valueOf(c);

        // The above 2 lines if un-commented gives error as we are trying to store
        // large variables in the small variables, if we want to do, we need to narrow cast them before storing

        Byte a4 = Byte.valueOf((byte)b);
        Byte a5 = Byte.valueOf((byte)c);

        System.out.println(a4); // 99
        System.out.println(a5); // -31
 
        // Unboxing : Converting objects into primitive data types

        byte x1 = a1;
        short x2 = b1;
        int x3 = c1;
        long x4 = d1;
        float x5 = e1;
        double x6 = f1;
        char x7 = g1;

        System.out.println(x1); // 21
        System.out.println(x2); // 355
        System.out.println(x3); // 4321
        System.out.println(x4); // 821317236
        System.out.println(x5); // 32.211
        System.out.println(x6); // 122.31312
        System.out.println(x7); // H

        // ---------------Some important methods of wrapper objects------------------------
        
        System.out.println(a1.byteValue()); // 21
        System.out.println(a1.shortValue()); // 21
        System.out.println(a1.intValue()); // 21
        System.out.println(a1.floatValue()); // 21.0
        System.out.println(a1.doubleValue()); // 21.0
        System.out.println((a1.toString()).length()); // a1.toString() returns "21" with length as 2
        System.out.println(a1.getClass()); // class java.lang.Integer
        System.out.println(a1.hashCode()); // 21
        Byte kk = 12;
        System.out.println(a1.equals(a)); // compares whether the values are same or not , returns boolean
        System.out.println(a1.compareTo(kk)); // if a1<kk it returns a1-kk which is -ve, if a1==kk, it returns 0 else a1-kk which is +ve
        // Even a1 is Byte object we can derive every data type as o/p as written code above....
        
        System.out.println(b1.byteValue()); // 99 
        System.out.println(b1.shortValue()); // 355
        System.out.println(b1.intValue()); // 355
        System.out.println(b1.floatValue()); // 355.0
        System.out.println(b1.doubleValue()); // 355.0
        System.out.println((b1.toString()).length()); // a1.toString() returns "355" with length as 3
        System.out.println(b1.getClass()); // class java.lang.Short
        System.out.println(b1.hashCode()); // 355
        // equals() and compareTo() is also supported
        
        System.out.println(c1.byteValue()); // -31
        System.out.println(c1.shortValue()); // 4321
        System.out.println(c1.intValue()); // 4321
        System.out.println(c1.floatValue()); // 4321.0
        System.out.println(c1.doubleValue()); // 4321.0
        System.out.println((c1.toString()).length()); // a1.toString() returns "4321" with length as 4
        System.out.println(c1.getClass()); // class java.lang.Integer
        System.out.println(c1.hashCode()); // 4321
        // equals() and compareTo() is also supported

        System.out.println(d1.byteValue()); // 116
        System.out.println(d1.shortValue()); // 20084
        System.out.println(d1.intValue()); // 821317236
        System.out.println(d1.floatValue()); // 8.2131715E8
        System.out.println(d1.doubleValue()); // 8.21317236E8
        System.out.println((d1.toString()).length()); // a1.toString() returns "821317236" with length as 9
        System.out.println(d1.getClass()); // class java.lang.Long
        System.out.println(d1.hashCode()); // 821317236
        // equals() and compareTo() is also supported

        // NOTE : Same like above wrapper class objects, Every object in java has 2 methods, hashCode() and equals().
        // NOTE : Wrapper class object has "public int hashCode()" method and Wrapper class has static method as "public int hashCode(int value)" which takes an integer as parameter.

        // -----------Some important methods of wrapper classes ---------------
        // All methods are static as we are accessing using class
        
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.max(10,20)); // 20
        System.out.println(Integer.min(10,20)); // 10
        System.out.println(Integer.sum(1313131,2312313)); // 3625444
        System.out.println(Integer.hashCode(12)); // 12

        System.out.println(Integer.toBinaryString(12)); // 1100
        System.out.println(Integer.bitCount(12)); // 2 , counts number of 1's in binary string.
        System.out.println(Integer.lowestOneBit(20)); // 4
        // 20 in binary : 10100, from LSB we need to consider first occurring '1' and need to make every other bit to '0'.
        // So, 10100 becomes 00100 -> 100 -> 4. So, output is 4.
        System.out.println(Integer.highestOneBit(20)); // 16
        // 20 in binary : 10100, from MSB we need to consider first occurring '1' and need to make every other bit to '0'.
        // So, 10100 becomes 10000 -> 16. So, output is 16.
        System.out.println(Integer.numberOfLeadingZeros(20)); // 27
        // 20 in 32 bit binary is 0000 0000 0000 0000 0000 0000 0001 0100
        // For Leading zeroes, take the first occurring '1' from MSB and count number of
        // zeroes to the left of it. o/p = 27
        System.out.println(Integer.numberOfTrailingZeros(20)); // 2
        // 20 in 32 bit binary is 0000 0000 0000 0000 0000 0000 0001 0100
        // For trailing zeroes, take the first occurring '1' from LSB and count number of
        // zeroes to the right of it. o/p = 2
        System.out.println(Integer.reverse(10)); // 1342177280
        // 10 = 0000 0000 0000 0000 0000 0000 0000 1010
        // After Reversing each bit = 0101 0000 0000 0000 0000 0000 0000 0000
        // Decimal obtained = 1342177280
        System.out.println(Integer.reverseBytes(10)); // 1677721160
        // 10 = 0000 0000 0000 0000 0000 0000 0000 1010
        // After swapping bytes : 0000 1010 0000 0000 0000 0000 0000 0000
        // Decimal obtained = 167772160

        // NOTE :In reverse we need to swap all bits, In reverseBytes() we are swapping each byte

        System.out.println(Integer.signum(10)); // 1

        System.out.println(Integer.toHexString(10)); // a
        System.out.println(Integer.toOctalString(10)); // 12

        System.out.println(Integer.TYPE); // int

        System.out.println(Integer.SIZE); // 32
        System.out.println(Integer.BYTES); // Integer.SIZE / 8 = 4

        System.out.println(Integer.rotateLeft(10,2)); // 40
        // 10 : 1010 -> 2 bits to left -> .... 1010 00 -> 40
        System.out.println(Integer.rotateRight(20,2)); // 5
        // 20 : 0001 0100 -> 2 bits to right -> 0000 0101 -> 5

        System.out.println(Integer.compare(-30,20)); // -1
        // as 10 < 20 so o/p is -1

        System.out.println(Integer.compareUnsigned(-30,20)); // 1
        // as 30 > 20 so o/p is 1 , Here we used unsigned so negative signs are ignored

        System.out.println(Integer.divideUnsigned(20,3)); // 6 , Here we should not pass -ve values
        System.out.println(Integer.remainderUnsigned(20,3)); // 2, No -ve values are allowed

        System.out.println(Integer.valueOf(20)); // 20
        System.out.println(Integer.valueOf("20")); // 20
        System.out.println(Integer.valueOf("1010",2)); // 1010 is 10 in decimal
        System.out.println(Integer.valueOf("16",8)); // 16 is in octal, in integer it is 14, so o/p is 14
        System.out.println(Integer.valueOf("16",16)); // 16 is hexadecimal number, in integer it is 22, so o/p = 22

        System.out.println(Integer.toString(21)); // returns "21" which is a string
        // Let's verify using getName() method
        System.out.println((Integer.toString(21)).getClass()); // class java.lang.String
        System.out.println(Integer.toString(10,2)); // 1010 , means it takes 10 which is a decimal
        // and converts it into base-2 which is binary and returns it
        System.out.println(Integer.toString(10,8)); // 12
        // Converts 10 into octal and returns it
        System.out.println(Integer.toString(16,16)); // 10
        // Converts 16 into hexadecimal number and returns it
        // NOTE : toString() takes UnSigned numbers also...Both -ve and +ve

        System.out.println(Integer.toUnsignedString(24)); // 24
        System.out.println(Integer.toUnsignedString(24,2)); // 11000
        System.out.println(Integer.toUnsignedString(24,8)); // 30
        System.out.println(Integer.toUnsignedString(24,16)); // 18

        System.out.println(Integer.toUnsignedLong(4121425));
        Long zuza = Integer.toUnsignedLong(4121425);
        System.out.println(zuza.getClass()); // class java.lang.Long

        // NOTE : Actually, valueOf uses parseInt internally.
        // The difference is parseInt returns an int primitive, while valueOf returns an Integer object.

        int a = Integer.parseInt("21");
        System.out.println(a); // 21

        // valueOf() uses parseInt() internally as:
        // public static Integer valueOf(String s, int radix) throws NumberFormatException {
        //    return Integer.valueOf(parseInt(s, radix));
        //}
        // Look this link for more : https://www.google.com/search?q=parseInt()+vs+valueOf()+stackverlfow

        System.out.println(Integer.parseInt("1010",2)); // 10
        System.out.println(Integer.parseInt("16",8)); // octal number 16 into integer gives 14
        System.out.println(Integer.parseInt("16",16)); // hexadecimal number 16 into integer gives 22

        String characterSequence = "123456";
        System.out.println(Integer.parseInt(characterSequence,0,characterSequence.length()-4,10));
        // 12

        // Line 95 is one overload parseInt()
        // Lines 104,105 and 106 is second overload for parseInt()
        // Line 109 is the final overload for parseInt()

        // parseInt() takes -ve values also as it is by default in signed
        System.out.println(Integer.parseInt("-12")); // -12
        System.out.println(Integer.parseInt("-4321",0,4,10)); // -432
        // For, +ve values use parseUnsignedInt() which have 3 overloads

        System.out.println(Integer.parseUnsignedInt("33")); // 33
        // passing negative integer strings to parseUnsignedInt() raises errors
        // Similarly we can use all 3 overloads for +ve integer strings using parseUnsignedInt() method

         
        

        

        
                
