package Calculation.Arithmetic;

public class Multiplication extends Calculate {
    public Multiplication(double a, double b, String operation) {
        super(a, b, operation);
    }

    @Override
    public double resultOperation(double a, double b, String operation) {
        double resultOperatioin = a * b;
        System.out.println(resultOperatioin);
        return resultOperatioin;
    }
}
