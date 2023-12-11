import java.util.Random;

public class Stock {
    private String name;
    private double currentPrice;
    private int volume;

    public Stock(String name) {
        this.name = name;
        this.currentPrice = generateRandomPrice();
        this.volume = 0;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume(int lot) {
        volume += lot;
    }

    public void decreaseVolume(int lot) {
        volume -= lot;
    }

    public void updatePrice() {
        // Simülasyon: Rastgele fiyat değişimi
        double percentageChange = (new Random().nextDouble() - 0.5) * 0.1; // -5% ile +5% arasında değişim
        currentPrice += currentPrice * percentageChange;
    }

    private double generateRandomPrice() {
        // Simülasyon: Başlangıçta rastgele bir fiyat
        return (new Random().nextDouble() * 100) + 50; // 50 ile 150 arasında başlangıç fiyatı
    }
}
