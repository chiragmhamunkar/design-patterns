package com.learn.patterns.splitwise;

import java.util.Arrays;
import java.util.List;

public class SplitStrategyTest {
    public static void main(String[] args) {
        SplitStrategy splitWIthPercentagesStrategy = new SplitWIthPercentagesStrategy();
        List<Double> percentages = Arrays.asList(10d, 10d, 30d, 50d);
        System.out.println(splitWIthPercentagesStrategy.split(50d, percentages));

        SplitStrategy splitUnEquallyStrategy = new SplitUnEquallyStrategy();
        System.out.println(splitUnEquallyStrategy.split(100d, Arrays.asList(10d, 10d, 30d, 50d)));

        SplitStrategy splitWIthSharesStrategy = new SplitWIthSharesStrategy();
        System.out.println(splitWIthSharesStrategy.split(10d, Arrays.asList(3d, 6d, 9d)));
    }
}
