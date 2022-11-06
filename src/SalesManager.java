package PACKAGE_NAME;public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int ObrezAverage() {
        int ObrezAverage = 0;
        int result = 0;
        for (int d : sales) {
            result += d;
            ObrezAverage = (result - max() - min()) / (sales.length - 2);
        }
        return ObrezAverage;
    }
}
