public class DataTypes {
    //What is typeChecking : the data which is stored in the variable which can be handled by the compiler or not.
    // To store numeric data, we have four data types : byte, short, int, long
    //By default the compiler will consier the numeric data as Integer type

    //Whole numbers
    public byte b;
    public short s;
    public int i;
    public long l;

    //Real Numbers
    public float f;
    public double d; 
    //Incase of Double, If you exceed the range of the float data then the suffix @end d or D not required
    //DataTypes are actuall reserved words which was define in compiler and JVM, to map the primitive data as object, java was introduced with the concept called wrapper classes.
    //By default the realnumbers are considered as double in java
    //If you want to define the float data, Suffit it with [F or f]
    //For double data, suffix is not required eithe [d or D]

    //In java character are represented using the UNICODE format
    //Character internally compiler will treat it as number
    //Characters should be placed inside the single quote
    public char c;

    public void displayByteData(){
        System.out.println("The size of Byte is : " + Byte.SIZE);
        System.out.println("The maxValue of Byte is : " + Byte.MAX_VALUE);
        System.out.println("The minValue of Byte is : " + Byte.MIN_VALUE);
    }

    public void displayShortData(){
        System.out.println("The size of Short is : " + Short.SIZE);
        System.out.println("The maxValue of Short is : " + Short.MAX_VALUE);
        System.out.println("The minValue of Short is : " + Short.MIN_VALUE);
    }

    public void displayIntData(){
        System.out.println("The size of Integer is : " + Integer.SIZE);
        System.out.println("The maxValue of Integer is : " + Integer.MAX_VALUE);
        System.out.println("The minValue of Integer is : " + Integer.MIN_VALUE);
    }

    public void displayLongData(){
        System.out.println("The size of Long is : " + Long.SIZE);
        System.out.println("The maxValue of Long is : " + Long.MAX_VALUE);
        System.out.println("The minValue of Long is : " + Long.MIN_VALUE);
    }

    public void displayFloatData(){
        System.out.println("The size of Float is : " + Float.SIZE);
        System.out.println("The maxValue of Float is : " + Float.MAX_VALUE);
        System.out.println("The minValue of Float is : " + Float.MIN_VALUE);
    }

    public void displayDoubleData(){
        System.out.println("The size of Double is : " + Double.SIZE);
        System.out.println("The maxValue of Double is : " + Double.MAX_VALUE);
        System.out.println("The minValue of Double is : " + Double.MIN_VALUE);
    }

    public void displayCharData(){
        System.out.println("The size of Char is : " + Character.SIZE);
        System.out.println("The maxValue of Char is : " + Character.MAX_VALUE);
        System.out.println("The minValue of Char is : " + Character.MIN_VALUE);
    }
}
