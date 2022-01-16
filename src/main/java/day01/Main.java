package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer pnc = new PositiveNumberContainer();

        double number;

        System.out.println();
        do {
            System.out.println("Adj meg egy számot ");
            number = scanner.nextDouble();
            if (number > 0) {
                pnc.addNumber(number);
            }

        } while(number > 0);

        System.out.println(pnc.getNumbers());

    }
}
