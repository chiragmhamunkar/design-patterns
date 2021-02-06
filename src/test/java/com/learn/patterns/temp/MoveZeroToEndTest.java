package com.learn.patterns.temp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;

public class MoveZeroToEndTest {

    @Test
    public void solveTest(){
        int[] a = {1, 2, 0, 3};
        MoveZeroToEnd.solve2(a);
        Assertions.assertEquals(true, Arrays.equals(new int[]{1, 2, 3, 0}, a));

    }
}
