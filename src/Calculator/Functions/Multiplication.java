package Calculator.Functions;

public class Multiplication extends MathFunction{
    @Override
    public String getOperator(){
        return "*";
    }

    @Override
    public float parseEquation(float currentRes, String toMultiply) {
        return currentRes * Float.parseFloat(toMultiply);
    }
}
