package com.katas;

import java.math.BigInteger;

public class Prime {
    public static boolean isPrime(int num) {
        return BigInteger.valueOf(num).isProbablePrime(20) && num > 1;
    }
}
