public class JumpStatements {

    public int x = 10;

    //Duplicate cases are not allowed
    //Default case is optional
    //After a case, if you are not using the break, all the statements will execute without checking the conditions till it see the break
    public void switchStatement() {
        switch (x) {
            case 10:
                System.out.println("The case 10 was hitted");
                break;
            case 20:
                System.out.println("The case 20 was hitted");
                break;
            case 30:
                System.out.println("The case 30 was hitted");
                break;
            default:
                System.out.println("I will execute if no case got hit");
        }

    }       

    public void continueDemo(){
        for(int i=0; i<10; i++){
            if(i%2==0) 
                continue; //Here it will skip the true condition iterations
            System.out.println(i);
        }
    }

    public void breakDemo(){
        for(int i=0; i<10; i++){
            if(i == 5){
                System.out.println("The break statement was hittem @ : " + i);
                break;  //Here the control will go out of the loop
            }
            System.out.println(i);
        }
    }
}
