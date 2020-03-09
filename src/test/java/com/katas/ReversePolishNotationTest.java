package com.katas;

import org.junit.Test;

import java.util.Stack;
import java.util.stream.IntStream;

import static com.katas.ReversePolish.calc;
import static com.katas.ReversePolish.calcSign;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReversePolishNotationTest {

    @Test
    public void calcSignShouldReturnStackWithTwoElementsPoppedAndOneElementPushed() {
        Stack<Double> numbers = new Stack<>();
        IntStream.rangeClosed(1, 5).forEach(number -> numbers.add((double) number));
        Stack<Double> actual = calcSign(numbers, (num1, num2) -> num2 / num1);
        assertThat(actual.size(), is(equalTo(4)));
    }

    @Test
    public void calcSignShouldUseOperationParameterToCalculatePushedValue() {
        Stack<Double> numbers = new Stack<>();
        numbers.push((double) 15);
        numbers.push((double) 3);
        Stack<Double> actual = calcSign(numbers, (num1, num2) -> num2 / num1);
        assertThat(actual.pop(), is(5.0));
    }

    @Test
    public void calcShouldBeAbleToCalculateSingleDigitNumbers() {
        assertThat(calc("1 2 +"), is(equalTo(3.0)));
    }

    @Test
    public void calcShouldBeAbleToCalculateMultiDigitNumbers() {
        assertThat(calc("12 3 /"), is(equalTo(4.0)));
    }

    @Test
    public void calcShouldBeAbleToHandleNegativeNumbers() {
        assertThat(calc("-12 3 /"), is(equalTo(-4.0)));
    }

    @Test
    public void calShouldBeAbleToHandleDecimalNumbers() {
        assertThat(calc("-12.9 3 /"), is(equalTo(-4.3)));
    }

    @Test
    public void calShouldBeAbleToHandleMoreComplexNotations() {
        assertThat(calc("1 2 + 4 * 5 + 3 -"), is(equalTo(14.0)));
    }

}