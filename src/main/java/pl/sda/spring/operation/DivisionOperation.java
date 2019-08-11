package pl.sda.spring.operation;


public class DivisionOperation implements Operation{
    private String exceptionMessage;

    public DivisionOperation(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 == 0){
            throw new RuntimeException(exceptionMessage);
        }else {
            return arg1 / arg2;
        }
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
