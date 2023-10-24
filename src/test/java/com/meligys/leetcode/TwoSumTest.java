package com.meligys.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2,7,11,15; 9; 0,1"
    }, delimiterString = ";")
    void twoSumTes(String input, int target, String output) {
        int[] inputArray = Arrays.stream(input.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
        int[] expectedArray = Arrays.stream(output.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();

        int[] result = TwoSum.twoSum(inputArray, target);

        assertArrayEquals(expectedArray, result);
    }
}
