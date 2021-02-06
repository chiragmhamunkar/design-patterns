package com.learn.patterns.splitwise;

import java.util.List;
import java.util.stream.Collectors;

public class SplitWIthPercentagesStrategy implements SplitStrategy{
    @Override
    public List<Split> split(Double amount, List<Double> splits) {
        //throw exception if %es sum not equal to 100

        return splits.stream().map(percent -> amount*percent/100).map(Split::new).collect(Collectors.toList());
    }
}
