/**
 * MethodOverLoading
 */

 //CompileTime Polymorphism or false Polymorphism or early binding => [one in many forms : every one think one method is performing different tasks, reality different with the same name and with different parameters will be performed]
 //Why method overloading is used : In C programming you can't write the function name twice, if the requirement is addition for two numbers and addition for three numbers
 //You can't write the same name for the addition, you should write the different methods for addition of two numbers, and addition for three numbers : this is in case of C.
 //In java this problem was resolved using the method overloading : you can write same method with different parameters.
 //Writing the same method with different parameters is known as method overloading.
 //Whenever you are invoking the method, based upon the [number of parameters, order of the parameters, datatype of the parameters] : the method will be invoked. This will be resolved by the compiler i.e is known as compiletime polymorphism

public class MethodOverLoading {
    //same addition function with two parameters : addition for two numbers
    int add(int a, int b){
        return a+b;
    }

    //Here in this case same name with same parameters with the above method : but return type is changed [in method overloading the return is nothing to do]
    // void add(int a, int b){
    //     System.out.println(a+b);
    // }

    // float add(float a, int b, float c){
    //     return a+b+c;
    // }
    //Here if you do like this : MethodOverLoading methodoverloading = new MethodOverLoading();
    //methodoverloading.add(10.2f, 9, 8);
    //The above method will have capability to take [float, int, int] inplace of float, it is using the integer => implicit typecasting will happen
    //This concept we called it as methodoverloading with numeric type promotion.

    //same addition function with three parameters : addition for three numbers
    int add(int a, int b, int c){
        return a+b+c;
    }

    float add(int a, float b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }
    //If you provide two integers, compiler will get confusion to invoke which method.
    //methodoverloading.add(10,20); => those will result in ambigious error for the aove two functions.

    double add(int a, float b, double c){
        return a+b+c;

    }
    //All the above issues will be resoled at compile time only i.e referred as compile time polymorphism.

    //Can we overload main method : answer is yes.
    //refer main.java file
}