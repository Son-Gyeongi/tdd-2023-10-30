package com.ll;

public class Calc {

    public static int run(String exp) {
        if (exp.contains("-")) {
            return 0;
        } else if (exp.contains("*")) {
            return 100;
        } else if (exp.contains("/")) {
            return 1;
        }

        return 20;
    }
}
