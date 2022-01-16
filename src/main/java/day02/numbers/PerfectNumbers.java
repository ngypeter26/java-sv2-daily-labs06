package day02.numbers;

public class PerfectNumbers {
    boolean isPerfectNumber(int number) {
        int numberOfDividers = 0;

        for (int i = 1; i < number; i++) {
            numberOfDividers += number % i == 0 ? i : 0;
        }
        return numberOfDividers == number;
    }
}
