package Calculation.Arithmetic;

public class Calculate implements Arithmetic {
    private double a;
    private double b;
    private String operation;



    public Calculate(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    /*protected int resultOperation(int a, int b, String operation){
        return 0;
    }*/


    public double resultOperation(double a, double b, String operation) {
        return 0;
    }

    @Override
    public double resultOperation() {
        return 0;
    }

}
