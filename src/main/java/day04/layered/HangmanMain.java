package day04.layered;

import java.util.Scanner;

public class HangmanMain {


    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        BusinessModel bm = new BusinessModel("szarvasmarha",8);
        String guess;
        boolean succes;

        do {
            printStatus( bm);
            guess  = inputGuess(scanner);

            succes = bm.takeGuess(guess);

            if (succes){
                System.out.println("Jó");
            }else{
                System.out.println("Rossz");
            }
        } while( !bm.won() && bm.hasMoreChance());

        printresult(bm);
    }

    private void printresult(BusinessModel bm) {
        if (bm.won()){
            System.out.println("Ügyes");
        }else{
            System.out.println("vesztettél");
        }
    }

    private void printStatus(BusinessModel bm){
        System.out.println("Itt tartasz: " + bm.getWordFound());
        System.out.println("Ennyi tipp: " + bm.getChances());

    }
    private String inputGuess(Scanner scanner){
        System.out.println("Mi a következő tipped?");
        return scanner.nextLine();
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}
