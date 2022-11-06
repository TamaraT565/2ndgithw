package PACKAGE_NAME;public class Main {
    public static void main(String[] args) {
        int[] sales =new int[] {25, 30, 12, 5, 18, 34, 87};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println("Среднее обрезанное арифметическое " + salesManager.ObrezAverage());
    }
}