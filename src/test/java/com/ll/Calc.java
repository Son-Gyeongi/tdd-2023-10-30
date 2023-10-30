package com.ll;

public class Calc {

    public static int run(String exp) {
        // 값이 없는 경우, 비어있는 지 체크
        if (exp.isBlank()) return 0;

        if (exp.contains("-")) {
            return 0;
        }

        String[] exps = exp.split(" \\+ ");

        int num1 = Integer.parseInt(exps[0]);
        int num2 = Integer.parseInt(exps[1]);
        return num1 + num2;
    }
}
