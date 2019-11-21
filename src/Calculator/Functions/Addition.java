package Calculator.Functions;

import Calculator.IOField;

public class Addition extends MathFunction{
    @Override
    public String getOperator(){
        return "+";
    }

    @Override
    public float parseEquation(float right, float left) {
        return right + left;
    }
}
