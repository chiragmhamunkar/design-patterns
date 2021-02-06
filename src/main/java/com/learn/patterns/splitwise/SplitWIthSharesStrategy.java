package com.learn.patterns.splitwise;

import java.util.List;
import java.util.stream.Collectors;

public class SplitWIthSharesStrategy implements SplitStrategy{

    @Override
    public List<Split> split(Double amount, List<Double> splits) {
        Double totalShares = splits.stream().reduce((x, y) -> x+y).get();
        return splits.stream().map(x -> amount * x/totalShares).map(Split::new).collect(Collectors.toList());
    }
}
