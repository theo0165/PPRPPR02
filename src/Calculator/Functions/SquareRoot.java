package Calculator.Functions;

public class SquareRoot extends MathFunction{
    @Override
    public String getOperator(){
        return "sqrt";
    }

    @Override
    public float parseEquation(float first, float second) {
        return 0;
    }
}
