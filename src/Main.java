public class Main {
    public static void main(String[] args) {
        long[] sales = {25, 30, 12, 5, 18, 34, 87};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
