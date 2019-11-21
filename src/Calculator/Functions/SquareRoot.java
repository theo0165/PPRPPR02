package Calculator.Functions;

public class SquareRoot extends MathFunction{
    @Override
    public String getOperator(){
        return "sqrt";
    }

    @Override
    public float parseEquation(float currentRes, String toRoot) {
        return Float.parseFloat(String.valueOf(currentRes + Math.sqrt(Float.parseFloat(toRoot))));
    }
}