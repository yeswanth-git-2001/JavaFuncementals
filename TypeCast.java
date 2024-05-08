public class TypeCast {
    byte b1 = 10;
    byte b2 = 20;
    
    //byte b3 = b1 + b2; 
    //It will result in compile time error, Because by default value for the whole numbers are considered as an Integer type in java, we are storing that data into the byte variable
    byte b3 = (byte) (b1 + b2); 
    //This was explicit typecasting
    
    // We have this order : byte -> short -> int -> long -> float -> double
    //From right to left compiler will easily understand that I can store the data form smaller dataType into bigger dataType, But we can't go from left to right, If you are going do typecasting explicitly
    double d1 = 10.9;
    //byte b4 = d1 -> compile time error i.e double can't be stored in byte datatype, tha's why if you explicit type casting there will be no compile time error
    //But in explicit type casting, most probably the loss of information will happen in many cases
    byte b4 = (byte) d1;

    byte b5 = 10;
    double d6 = b5;
    
    public void display(){
        System.out.println(b3);
        System.out.println("Explicit typeCasting : " + b4);//Loss of data might happen
        System.out.println("Implicit typeCasting : " + d6);//Mostly not happen
    }
}
