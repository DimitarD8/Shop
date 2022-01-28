package BestTimeToBuyAndSellStock;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellTest {


    int[] arr = new int[]{7, 1, 5, 3, 6, 4};
    BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell(arr);


    @Test
    public void cheapestDayTest() {

        int bestDay = bestTimeToBuyAndSell.cheapestDayToBuy();

        Assert.assertEquals(2, bestDay);
    }


    @Test
    public void mostExpensiveDayToSellTest() {

        int bestDayToSell = bestTimeToBuyAndSell.bestDayToSell();
        Assert.assertEquals(5, bestDayToSell);
    }

    @Test
    public void bestProfitTest(){
        int profit = bestTimeToBuyAndSell.bestProfit();
        Assert.assertEquals(5,profit);
    }
}