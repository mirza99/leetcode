package com.meligys.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDuplicateTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,2,3,1; true",
            "1,2,3,4; false",
            "1,1,1,3,3,4,3,2,4,2; true"
    }, delimiterString = ";")
    void twoSumApproachOneTest(String input, boolean expectedResult) {
        int[] inputArray = Arrays.stream(input.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();

        boolean result = ContainsDuplicate.containsDuplicate(inputArray);

        assertEquals(expectedResult, result);
    }

}
