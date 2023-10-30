package com.ll;

public class Calc {

    public static int run(String exp) { // exp, expression 표현식
        // 값이 없는 경우, 비어있는지 체크
        if (exp.isBlank()) return 0;

        // 값이 안 바뀔것은 final로 해도 된다.
        final boolean isPlus = exp.contains("+");

        final String divideSign = isPlus ? "\\+" : "-";

        String[] expBits = exp.split(" " + divideSign + " ");

        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);

        if (isPlus) return num1 + num2;
        else return num1 - num2;
    }
}
