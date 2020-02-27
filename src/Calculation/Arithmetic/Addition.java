package Calculation.Arithmetic;

public class Addition extends Calculate {
    public Addition(int a, int b, String operation) {
        super(a, b, operation);
    }

    public int resultOperation(int a, int b, String operation){
        int resultOperatioin = a + b;
        System.out.println(resultOperatioin);
        return resultOperatioin;
    }
}
