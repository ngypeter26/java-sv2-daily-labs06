package day03;

public class SumGenerator {

    public long sumGenerator(int sum){
        return (Math.round((double) sum / 5.0)) * 5;
    }

    public static void main(String[] args) {
        SumGenerator sg = new SumGenerator();
        System.out.println(sg.sumGenerator(10));
        System.out.println(sg.sumGenerator(11));
        System.out.println(sg.sumGenerator(12));
        System.out.println(sg.sumGenerator(13));
        System.out.println(sg.sumGenerator(14));
        System.out.println(sg.sumGenerator(15));
        System.out.println(sg.sumGenerator(16));
        System.out.println(sg.sumGenerator(17));
        System.out.println(sg.sumGenerator(18));
        System.out.println(sg.sumGenerator(19));
        System.out.println(sg.sumGenerator(20));
    }
}
