public class Operators {
    //Arthematic operators are binary operators : which means two operands are required to perform the arthematic operation
    // [+, -, *, /, %]
    public int num1 = 10;
    public int num2 = 20;
    public int addition = num1 + num2;
    public int subtraction = num2 -num1;
    public int multiplication = num1 * num2;
    public int division = num1 / num2; // the / will result quotient
    public int modulus = num1 % num2; // the % will result remainder
 
    public void displayArthematicOperations(){
        System.out.println("The addition is : " + addition);
        System.out.println("The subtraction is : " + subtraction);
        System.out.println("The multiplication is :" + multiplication);
        System.out.println("The division is :" + division);
        System.out.println("The modulus is :" + modulus);
    }

    //Unary operators
    //[-, ++, --, ~] //Defined in other file : refer InceDecr.java file

    //Assignment operator
    //[=, +=, -=, *=, /=, %=]

    public int a = 10;
    //The literal 10 is assigned to the variable a and associativity is right to left, literal and dataType should match otherwise compiler will throws an error
    //Incase of compound assignment implicit typecast will happen

    public int b = 20;
    public double c = 20.34;
    public void displayAssignmentOperations(){
        //b = b + c; here possible loss of data will happen
        //b+=c : implicit typecast will happen no error, but possible loss of information will happen in compound assignment
        System.out.println("The value 10 will be assigned to a : " + a);
        System.out.println("Compound assignment : " + (b+=c));//no errors like wise we can use all the compund operators
    }

    //Relational operators or comparision operators
    //This operators will perform comparision between operands and result in boolean literal output
    //[==, <, >, <=, >=, !=]
    public int number1 = 10;
    public int number2 = 20;

    public void displayRelationalOperators(){
        System.out.println(number1 == number2);
        System.out.println(number1 < number2);
        System.out.println(number1 > number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 != number2);
    }
    //All the above print statements will result in boolean literal

    //Logical operators
    //[&&, ||, !] => this operators will perform operations between two operands and results in boolean literal as an output
    //Short circuit case : In && operaton if the first condition is false, It wont't check the other condition => (false) && (true) : short circuit
    //In || operation if first condition is true, It won't check the other conditon (true) || (false) : short circuit
    public boolean b1 = true;
    public boolean b2 = true;
    public boolean b3 = false;
    
    public void displayLogicalOperations(){
        System.out.println("Ouput for AND oepration " + (b1 && b2)); //if both of them are true in this case operands, It will result in true if anyof them is false it will result in false
        System.out.println("Ouput for OR oepration " +  (b1 || b3)); //If any of the conditions is true, then output will result in true
        System.out.println("Ouput for Not oepration " +  (!b1)); //It will give the reverse of the boolean value.
    }

    //Ternary operator
    //[?:] this is like if-else conditionals, which will check the condition and if it is true then, go for [? Statements] or if it was false go for[: statements]
    public int ab = 10;
    public int ac = 20;
    public int output1 = (ab < ac) ? ++ab : ac++; //if (ab<ac) which results in true, the statements after ? will execute
    public int output2 = (ab > ac) ? ab-- : --ac;

    public void disdplayTernaryOperations(){
        System.out.println("Output for ternary operator if the condition is true : " + output1);
        System.out.println("Output for ternary operator if the condition is false : " + output2);
    }

    //Bitwise operators
    //[&, |, ^, ~]
    //All the bitwise operations will be done by compiler internally, the concepts we should learn
    public int x = 9;
    public int y = 3;

    void disdplayBitwiseOperators(){
        System.out.println(x & 3); //use the binary representation of the numbers and do the AND operation and then the resultant will be printed to the console
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x); 
        //For ~ :
        //the result will be in two's compliment
        //First the bitwise compliment will happen, take that number and do 1's compliment and to the resultant add the 1 and you will get the 2's compliment
    }

    //Shift operators
    //[<<, >>,(Signed shift operators) <<<, >>>(unsigned shift operators)]
    public int m = 2;
    
    public void displayShiftOperations(){
        System.out.println(m << 2); //left side two bits will be trunctaed and added to the right side and reultant will get printed
        System.out.println(m >> 2); //right side two bits will be trunctaed and added to the left side and reultant will get printed
    }
}
