package Calculation.Arithmetic;

public class Addition extends Calculate {
    public Addition(double a, double b, String operation) {
        super(a, b, operation);
    }

    public double resultOperation(double a, double b, String operation){
        double resultOperatioin = a + b;
        System.out.println(resultOperatioin);
        return resultOperatioin;
    }
}
