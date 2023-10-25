package com.meligys.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2,7,11,15; 9; 0,1",
            "3,2,4; 6; 1,2",
            "3,3; 6; 0,1",
            "3,2,3; 6; 0,2"
    }, delimiterString = ";")
    void twoSumApproachOneTest(String input, int target, String output) {
        int[] inputArray = Arrays.stream(input.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
        int[] expectedArray = Arrays.stream(output.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();

        int[] result = TwoSum.twoSumApproachOne(inputArray, target);

        assertArrayEquals(expectedArray, result);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "2,7,11,15; 9; 0,1",
            "3,2,4; 6; 1,2",
            "3,3; 6; 0,1",
            "3,2,3; 6; 0,2"
    }, delimiterString = ";")
    void twoSumApproachTwoTest(String input, int target, String output) {
        int[] inputArray = Arrays.stream(input.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
        int[] expectedArray = Arrays.stream(output.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();

        int[] result = TwoSum.twoSumApproachTwo(inputArray, target);

        assertArrayEquals(expectedArray, result);
    }
}
