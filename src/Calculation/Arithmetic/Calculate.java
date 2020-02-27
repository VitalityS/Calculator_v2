package Calculation.Arithmetic;

public class Calculate implements Arithmetic {
    private int a;
    private int b;
    private String operation;



    public Calculate(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    /*protected int resultOperation(int a, int b, String operation){
        return 0;
    }*/


    public int resultOperation(int a, int b, String operation) {
        return 0;
    }

    @Override
    public int resultOperation() {
        return 0;
    }

}
