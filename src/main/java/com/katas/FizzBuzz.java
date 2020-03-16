package com.katas;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(printFor(i));
        }
    }

    public static String printFor(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (String.valueOf(number).contains("3")) {
            stringBuilder.append("Fizz");
        }

        if (number % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (String.valueOf(number).contains("5")) {
            stringBuilder.append("Buzz");
        }

        return !stringBuilder.toString().equals("") ? stringBuilder.toString() : String.valueOf(number);
    }
}
