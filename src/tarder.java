import java.util.Random;

public class Trader {
    private String name;
    private double balance;
    private int lotLimit;

    public Trader(String name, double balance, int lotLimit) {
        this.name = name;
        this.balance = balance;
        this.lotLimit = lotLimit;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getLotLimit() {
        return lotLimit;
    }

    public boolean buyStock(Stock stock, int lot) {
        double totalPrice = stock.getCurrentPrice() * lot;
        if (totalPrice > balance || lot > lotLimit) {
            System.out.println("Insufficient funds or exceeded lot limit for buying.");
            return false;
        }

        balance -= totalPrice;
        lotLimit -= lot;
        stock.increaseVolume(lot);
        System.out.println(name + " bought " + lot + " lots of " + stock.getName() +
                " at $" + stock.getCurrentPrice() + " per share. Remaining balance: $" + balance);
        return true;
    }

    public boolean sellStock(Stock stock, int lot) {
        if (lot > stock.getVolume()) {
            System.out.println("Not enough lots to sell.");
            return false;
        }

        double totalPrice = stock.getCurrentPrice() * lot;
        balance += totalPrice;
        lotLimit += lot;
        stock.decreaseVolume(lot);
        System.out.println(name + " sold " + lot + " lots of " + stock.getName() +
                " at $" + stock.getCurrentPrice() + " per share. Remaining balance: $" + balance);
        return true;
    }
}
