public class Main {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = 0;
        int full = numBottles;
        int empty = 0;

        while (full > 0 || empty >= numExchange) {
            drunk += full;
            empty += full;
            full = 0;

            if (empty >= numExchange) {
                full = empty / numExchange;
                empty %= numExchange;
            }
        }

        return drunk;
    }
}