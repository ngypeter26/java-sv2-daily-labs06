package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNumbers {
    @Test
    void testPrefectNumbers(){
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        assertTrue(perfectNumbers.isPerfectNumber(6)); //true
        assertTrue(perfectNumbers.isPerfectNumber(8128)); //true
        assertFalse(perfectNumbers.isPerfectNumber(7246)); //false
        assertFalse(perfectNumbers.isPerfectNumber(9)); //false
    }
}
