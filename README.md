# BorsaSistemiOrnegi
basit bir borsa sistemi  oyunlariniza ekleyebilirsiniz


### Usage:
```Java
public class BorsaUygulamasi {
    public static void main(String[] args) {
        Stock stock = new Stock("XYZ");

        Trader trader1 = new Trader("Alice", 10000, 10);
        Trader trader2 = new Trader("Bob", 15000, 15);

        for (int i = 0; i < 5; i++) {
            // Borsa fiyatları güncelleniyor
            stock.updatePrice();

            // Trader'lar alım-satım yapabiliyor
            trader1.buyStock(stock, 2);
            trader2.sellStock(stock, 1);
        }
    }
}
```
