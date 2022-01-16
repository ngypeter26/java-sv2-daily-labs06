package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OddArray {

    public int[] oddArray(){
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i =0;i<5;i++){
            numbers[i] = Math.abs(random.nextInt()*2+1);
        }
        return numbers;
    }

    public static void main(String[] args) {

        OddArray oa = new OddArray();

        System.out.println(Arrays.toString(oa.oddArray()));

    }
}
