package BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSell {
    private int[] days;
    private int cheapestDay;
    private int sellDay;
    private int profit;

    public BestTimeToBuyAndSell(int[] days) {
        this.days = days;
    }

    /*
    Find which is the cheapest day and then gets it's index
    * */
    public int cheapestDayToBuy() {
        int dayIndex = 0;
        this.cheapestDay = Integer.MAX_VALUE;
        for (int day : this.days) {
            if (cheapestDay > day) {
                this.cheapestDay = day;
                dayIndex++;
            }
        }

        return dayIndex;
    }

    /*
     Find which is the most expensive day and then gets it's index
    * */
    public int bestDayToSell() {

        sellDay = Integer.MIN_VALUE;
        int startCount = cheapestDayToBuy();
        if (startCount >= days.length - 1) {
            return 0;
        }
        int indexOfSell = startCount;

        for (int i = startCount - 1; i < this.days.length; i++) {
            if (sellDay < days[i]) {
                this.sellDay = days[i];
                indexOfSell++;
            }
        }

        return indexOfSell;

    }

    /*
    Calculate the profit
    * */
    public int bestProfit() {
        if (bestDayToSell() == 0) {
            return 0;
        }
        int cheapest = this.days[cheapestDayToBuy() - 1];
        int mostExpensive = this.days[bestDayToSell() - 1];
        this.profit = mostExpensive - cheapest;
        return profit;
    }


}
