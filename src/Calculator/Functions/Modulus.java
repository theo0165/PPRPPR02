package Calculator.Functions;

public class Modulus extends MathFunction{
    @Override
    public String getOperator(){
        return "%";
    }

    @Override
    public float parseEquation(float currentRes, String toMod) {
        return currentRes % Float.parseFloat(toMod);
    }
}
