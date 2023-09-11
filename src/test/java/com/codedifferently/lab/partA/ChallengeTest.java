package com.codedifferently.lab.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void testOne(){
        Challenge algoProblem11 = new Challenge();

        int expected = 7;
        int[] input = {10, 3, 5, 6};
        int actual = algoProblem11.nearAndFar(input);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        Challenge algoProblem11 = new Challenge();

        int expected = 8;
        int[] input = {7, 2, 10, 9};
        int actual = algoProblem11.nearAndFar(input);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        Challenge algoProblem11 = new Challenge();

        int expected = 0;
        int[] input = {2};
        int actual = algoProblem11.nearAndFar(input);

        Assertions.assertEquals(expected,actual);
    }
}
