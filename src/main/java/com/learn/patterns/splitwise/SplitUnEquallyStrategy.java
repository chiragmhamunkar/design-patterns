package com.learn.patterns.splitwise;

import java.util.List;
import java.util.stream.Collectors;

public class SplitUnEquallyStrategy implements SplitStrategy{

    @Override
    public List<Split> split(Double amount, List<Double> splits) {
        //throw exception if sum not equals to number
        return splits.stream().map(Split::new).collect(Collectors.toList());
    }
}
