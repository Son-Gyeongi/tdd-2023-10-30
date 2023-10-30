package com.ll;

public class Calc {

    public static int run(String exp) { // exp, expression 표현식
        // 값이 없는 경우, 비어있는지 체크
        if (exp.isBlank()) return 0;

        if (exp.contains("-")) {
            String[] expBits = exp.split(" \\- ");

            int num1 = Integer.parseInt(expBits[0]);
            int num2 = Integer.parseInt(expBits[1]);

            return num1 - num2;
        }

        String[] expBits = exp.split(" \\+ ");

        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);
        return num1 + num2;
    }
}
