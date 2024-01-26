package org.example;

public abstract class CryptoCurrency {
    private String name;
    private double price;
    private static long circulating;
    private static long totalSold = 0;
    public CryptoCurrency(String name,
                          double price,
                          long circ) {
        this.name = name;
        this.price = price;
        circulating = circ;
        totalSold = totalSold + circulating;
    }
    public static double calculatePrice(CryptoCurrency[] currency) {
        double result = 0;
        for (CryptoCurrency cur : currency) {
            result += cur.price * circulating;
        }
        return result;
    }
}
