package Calculation.Arithmetic;

public class Division extends Calculate {
    public Division(int a, int b, String operation) {
        super(a, b, operation);
    }

    @Override
    public int resultOperation(int a, int b, String operation) {
        int resultOperatioin = a / b;
        System.out.println(resultOperatioin);
        return resultOperatioin;
    }

}
