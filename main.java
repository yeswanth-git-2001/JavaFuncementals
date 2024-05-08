class Main {
    public static void main(String ...args){
        //following print statements are used to print the command line arguments
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        FirstCode firstCode = new FirstCode();
        firstCode.display();

        Identifiers identifiers = new Identifiers();
        identifiers.Id = 10;
        identifiers.name = "Yeswanth chowdary";
        identifiers.Height = 5.9f;
        identifiers.Weight = 60.3;
        System.out.println(identifiers.Id);
        System.out.println(identifiers.name);
        System.out.println(identifiers.Height);
        System.out.println(identifiers.Weight);

        System.out.println(firstCode.hashCode()); //It will give you the reference of the instace or the object

        DataTypes dataTypes = new DataTypes();
        dataTypes.b = 10;
        dataTypes.s = 20;
        dataTypes.i = 30;
        dataTypes.l = 2147483648l; //if the data goes beyond the range of the int dataType, We should suffix the data with [L or l]
        dataTypes.f = 10.2f;
        dataTypes.d = 10.9;
        dataTypes.displayByteData();
        dataTypes.displayShortData();
        dataTypes.displayIntData();
        dataTypes.displayLongData();
        dataTypes.displayFloatData();
        dataTypes.displayDoubleData();
        dataTypes.displayCharData();
        System.out.println(dataTypes.l);
        System.out.println(dataTypes.f);
        System.out.println(dataTypes.d);

        TypeCast typeCast = new TypeCast();
        typeCast.display();

        InceDecr inceDecr = new InceDecr();
        inceDecr.disdplay();

        Operators operators = new Operators();
        operators.displayArthematicOperations();
        operators.displayAssignmentOperations();
        operators.displayRelationalOperators();
        operators.displayLogicalOperations();
        operators.disdplayTernaryOperations();
        operators.disdplayBitwiseOperators();
        operators.displayShiftOperations();

        FlowControl flowControl = new FlowControl();
        flowControl.ifStatements();
        
        JumpStatements jumpStatements = new JumpStatements();
        jumpStatements.switchStatement();
        jumpStatements.continueDemo();
        jumpStatements.breakDemo();

        Loops loops = new Loops();
        loops.displayForLoopData();

        MethodOverLoading methodOverLoading = new MethodOverLoading();
        int a = 10, b = 20, c = 30;
        float m = 10.23f, n = 23.45f, o = 12.90f;
        double x = 12.3, y = 45.67, z = 90.4;
        
        System.out.println(methodOverLoading.add(a, b));
        System.out.println(methodOverLoading.add(a, b));
        System.out.println(methodOverLoading.add(a, b));
        System.out.println(methodOverLoading.add(a, b, c));


    }

    //But at the end the jvm will call such a method which is taking the arguments : {String[] variablename}
    public static void main(int[] args) {
        System.out.println("I'm the main method which is overloaded with int[] args parameters");
    }
}

