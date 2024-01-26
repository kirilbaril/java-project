public class Main {
    public static void main(String[] args) {
        CryptoCurrency[] currencies = new CryptoCurrency[]{new BitCoin("BTC", 45_000, 20), new Riddle("Riddle", 20_000, 10)};
        System.out.println(CryptoCurrency.calculatePrice(currencies));
    }
}
