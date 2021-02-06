package com.learn.patterns.splitwise;

import java.util.List;

public interface SplitStrategy {

    List<Split> split(Double amount, List<Double> splits);
}
