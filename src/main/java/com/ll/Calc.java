package com.ll;

public class Calc {

    public static int run(String exp) { // exp, expression 표현식
        // 값이 없는 경우, 비어있는지 체크
        if (exp.isBlank()) return 0;

        // 괄호를 벗는다.
        exp = stripOuterParentheses(exp);

        final String[] expBits = exp.split(" ");
        String sign = expBits[1]; // 연산자

        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[2]);

        final int rs = switch (sign) {
            case "+":
                yield num1 + num2;
            case "-":
                yield num1 - num2;
            case "*":
                yield num1 * num2;
            default: // "/"
                yield num1 / num2;
        };

        return rs;
    }

    private static String stripOuterParentheses(String exp) {
        if (exp.startsWith("(") && exp.endsWith(")")) {
            return exp.substring(1, exp.length() - 1);
        }

        return exp;
    }
}
