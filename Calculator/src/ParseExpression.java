public class ParseExpression {

    public static void InputExpression(String expression) {
        String a = "";
        String b = "";
        String math = "";
        int variableA;
        int variableB;
        boolean romanA = false;
        boolean romanB = false;

        expression = expression.replace(" ", "");

        for (int i = 0; i < expression.length(); i++) {
            if (math.length() > 1) {
                ExceptionClass.exitProgram4();
            }
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                math += expression.charAt(i);
            } else if (math.equals("")) {
                a += expression.charAt(i);
            } else {
                b += expression.charAt(i);
            }
        }

        if (a.equals("") || b.equals("") || math.equals("")) {
            ExceptionClass.exitProgram3();
        }

        try {
            variableA = Integer.parseInt(a);
            if (variableA < 1 || variableA > 10) {
                ExceptionClass.exitProgram5();
            }
        } catch (NumberFormatException e) {
            romanA = true;
            variableA = NumberConverter.returnArabic(a);
            if (variableA < 1 || variableA > 10) {
                ExceptionClass.exitProgram5();
            }
        }

        try {
            variableB = Integer.parseInt(b);
            if (variableB < 1 || variableB > 10) {
                ExceptionClass.exitProgram5();
            }
        } catch (NumberFormatException e) {
            romanB = true;
            variableB = NumberConverter.returnArabic(b);
            if (variableB < 1 || variableB > 10) {
                ExceptionClass.exitProgram5();
            }
        }

        if (romanA != romanB) {
            ExceptionClass.exitProgram2();
        }
        MathCustom.result(variableA, variableB, math, romanA);

    }

}
