package Calculation.Arithmetic;

public class Subtraction extends Calculate {
    public Subtraction(int a, int b, String operation) {
        super(a, b, operation);
    }
    @Override
    public int resultOperation(int a, int b, String operation){
        int resultOperatioin = a - b;
        System.out.println(resultOperatioin);
        return resultOperatioin;
    }
}
