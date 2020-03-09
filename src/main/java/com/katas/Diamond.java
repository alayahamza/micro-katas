package com.katas;

public class Diamond {

    public static String print(int n) {
        if (n < 0 || n % 2 == 0) return null;
        StringBuilder shape = new StringBuilder();
        int midRow = n / 2 + 1;
        for (int i = midRow; i <= n * 2 - midRow; i++) {
            for (int j = 1; j <= n - Math.abs(n - i); j++) {
                if (j <= Math.abs(n - i))
                    shape.append(" ");
                else
                    shape.append("*");
            }
            shape.append("\n");
        }
        return shape.toString();
    }
}
