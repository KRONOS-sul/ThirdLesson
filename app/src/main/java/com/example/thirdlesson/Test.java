package com.example.thirdlesson;

import android.util.Log;

public class Test {
    private static final String TAG = "SHAMAL";

    public static double calculate(double firstNum, double secondNum, char operator) {
        double result = 0;

        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            result = firstNum / secondNum;
        } else {
            Log.d(TAG, "Не допустимое значение оператора");
        }

        Log.d(TAG, "--" + result);
        return result;
    }

    public static void main(String[] arguments) {
        Log.d(TAG, "Результат вычислений" + calculate(334, 5432, '+'));
        Log.d(TAG, "Результат вычислений" + calculate(742, 80, '-'));
        Log.d(TAG, "Результат вычислений" + calculate(21, 987, '*'));
        Log.d(TAG, "Результат вычислений" + calculate(102, 10, '/'));
        Log.d(TAG, "Результат вычислений" + calculate(102, 10, 'S'));
    }
}
