package Calculator.Functions;

public class Division extends MathFunction{
    @Override
    public String getOperator(){
        return "-";
    }

    @Override
    public float parseEquation(float currentRes, String toDivide) {
        return currentRes / Float.parseFloat(toDivide);
    }
}
