public class FlowControl {
    
    public int x = 10;
    public int y = 20;

    public void ifStatements(){
        //if the condition is true in the if-block then only the statements in the if-block will execute
        if(x == 10){
            System.out.println("The x is equal to 10 ");
        }

        //if we do not provide any brackets after the if block, then only first staement will be considered as the if-block, other statements will execute normally
        if(x == 10)
            System.out.println("The x is equal to 10 "); 
            System.out.println("The statements outside the if block");

        if(x != 10)
            System.out.println("The condition is false and I won't execute");

        //if-else : if the condition is true, then if statements will be executed, if the condition is false, then else block statements will be executed
        if(x < 10){
            System.out.println("x is less than 10");
        }
        else{
            System.out.println("x is equal to 10");
        }

        //nested-if : writing if inside another if or else is called nested-if
        if(x == 10){
            if(y == 20){
                System.out.println("x and y are equal to 10 and 20");
            }
        }
        else{
            //statements
        }

        //if-else-if ladder : In many scenario's there should be multiple conditions are required to work with, in that case we use if-else-if ladder
        if(x != 10){
            System.out.println("The x is not equal to 10");
        }
        else if(y == 20){
            System.out.println("The y is equal to 20");
        }
        else{
            System.out.println("No conditions will true means, I will execute");
        }
    }

}
