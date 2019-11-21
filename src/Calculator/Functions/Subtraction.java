package Calculator.Functions;

public class Subtraction extends MathFunction{
    @Override
    public String getOperator(){
        return "/";
    }

    @Override
    public float parseEquation(float currentRes, String toSubtract) {
        return currentRes - Float.parseFloat(toSubtract);
    }
}
