package org.example;

public class BitCoin extends CryptoCurrency {
    public BitCoin(String name, double price, long circ) {
        super(name, price, circ);
    }
    @Override
    public String toString() {
        return "BTC";
    }
}
