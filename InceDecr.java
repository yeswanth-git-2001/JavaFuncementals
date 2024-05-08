public class InceDecr {
    public int a = 10;
    public int b = a++; //Post increment

    public int c = 10;
    public int d = ++c; //Pre increment

    public int e = 10;
    public int f = e--; //Post decrement

    public int g = 10;
    public int h = --g; //Pre decrement
    
    public void disdplay(){
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b); 
        //Here still the value of b is 10 why?
        //after assigining the value of a++ to b, then first assignment will happen in case of post increment and then incrementation will happen.

        System.out.println("The value of c is : " + c);
        System.out.println("The value of d is : " + d);
        //Here the value of d is 11 why?
        //after assigining the value of ++c to d, then first incrementation will happen in case of pre increment and then assignment will happen.

        System.out.println("The value of e is : " + e);
        System.out.println("The value of f is : " + f);
         //Here still the value of f is 10 why?
        //after assigining the value of e-- to f, then first assignment will happen in case of post decrement and then decrementation will happen.

        System.out.println("The value of g is : " + g);
        System.out.println("The value of h is : " + h);
         //Here the value of h is 9 why?
        //after assigining the value of --g to f, then first decrement will happen in case of pre decrement and then assignment will happen.
    }

}
