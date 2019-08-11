package pl.sda.spring.operation;


public class PercentageOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        double result = (arg2 * 100) / arg1;
        return result;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE;
    }
}
