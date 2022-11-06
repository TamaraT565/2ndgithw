# Менеджер продаж

## Начало работы
**SalesManager** - [Оф.сайт](https://salesmanager.com)

### Описание работы:

1. Массив примает цифры продаж(sales)
2. Затем метод max() просто пробегается по всему массиву этих цифр и возвращает самую большую цифру.

### Использование

```java
public class SalesManager {
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
}
public class Main {
    public static void main(String[] args) {
        int[] sales = {25, 30, 12};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
```