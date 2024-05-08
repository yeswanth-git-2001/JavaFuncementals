public class Loops {
    //for
    //while
    //do-while
    //for-each

    void displayForLoopData(){
        //for loops demonstration
        //(initialization, condition, updations)
        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        //while loop demonstartion
        int j=0;
        while(j<10){
            System.out.println(j);
            j++;
        }

        //do-while loops demonstration
        //In do-while if the condition is fals also the statements will execute atleast once
        int k=0;
        do {
            System.out.println(k);
            k++;
        } while (k<10);

        //Netsed loops : writing the loops inside another loops
        for(int i=0; i<5; i++){
            for(int m=0; m<5; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Same thing we can do with while and do-while
        //Termination condition should be there otherwise the loops will leads to infinity loop
    }
}
