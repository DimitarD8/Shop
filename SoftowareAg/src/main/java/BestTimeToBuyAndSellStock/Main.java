package BestTimeToBuyAndSellStock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] chars = input.toCharArray();

        int[] days = new int[arraySize(chars)];

        fillingArray(chars,days);

        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell(days);
        System.out.println(bestTimeToBuyAndSell.bestProfit());


    }

    public static int arraySize(char[] chars){
        int daySize = 0;

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                daySize++;
            }
        }
        return daySize;
    }

    public static int[] fillingArray(char[] chars,int[] days){
        int br = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                days[br] = Integer.parseInt(String.valueOf(aChar));
                br++;
            }
        }
        return days;
    }
}
