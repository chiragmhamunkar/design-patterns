package com.learn.patterns.splitwise;

public class Split {

    Double number;

    public Split(Double number){
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%.2f", number);
    }
}
