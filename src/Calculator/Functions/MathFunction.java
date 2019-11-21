package Calculator.Functions;

public abstract class MathFunction {
    public String getOperator(){
        return "";
    }

    public abstract float parseEquation(float right, float left);
}