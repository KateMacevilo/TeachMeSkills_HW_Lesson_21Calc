package by.tms.servlet;

public class Calculate {

    public static float getCalculate (float first, float second, String operand){

        float result = 0.0f;
        switch (operand){
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first % second;
                break;
        }

        return result;
    }
}
