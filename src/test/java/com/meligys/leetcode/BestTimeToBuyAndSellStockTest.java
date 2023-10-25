package com.meligys.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @CsvSource(value = {
            "3,2,6,5,0,3; 4",
            "2,1,2,0,1; 1",
            "7,6,4,3,1; 0",
            "2,4,1; 2",
            "7,1,5,3,6,4; 5",
            "7,6,4,3,1; 0"
    }, delimiterString = ";")
    void twoSumApproachOneTest(String input, long expectedResult) {
        int[] inputArray = Arrays.stream(input.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();

        long result = BestTimeToBuyAndSellStock.maxProfit(inputArray);

        assertEquals(expectedResult, result);
    }
}
