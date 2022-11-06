# Менеджер продаж

## Начало работы
**SalesManager** - [Оф.сайт](https://salesmanager.com)

### Описание работы:

1. Массив примает цифры продаж(sales)
2. Затем метод max() просто пробегается по всему массиву этих цифр и возвращает самую большую цифру.
3. Добавлен расчёт обрезанного среднего(ObrezAverage) - это среднее количество продаж среди всех продаж, за исключением самой максимальной и самой минимальной.

### Использование

```java
public class SalesManager {
    protected long[] sales;
    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long ObrezAverage() {
        long ObrezAverage = 0;
        long result = 0;
        for (long d : sales) {
            result += d;
            ObrezAverage = (result - max() - min()) / (sales.length - 2);
        }
        return ObrezAverage;
    }
}
public class Main {
    public static void main(String[] args) {
        long[] sales =new long[] {25, 30, 12, 5, 18, 34, 87};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println("Среднее обрезанное арифметическое " + salesManager.ObrezAverage());
    }
}

```