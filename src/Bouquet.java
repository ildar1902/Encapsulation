import java.text.DecimalFormat;
import java.util.Arrays;

public class Bouquet {
    public static Flower[] flowers;

    public Bouquet() {
        flowers = new Flower[0];
    }

    void addFlowers(Flower flower) {
        flowers = Arrays.copyOf(flowers, flowers.length + 1);
        flowers[flowers.length - 1] = flower;
    }

    private double calculateCost() {
        double costBouquet = 0;
        for (Flower flower : flowers) {
            costBouquet += flower.getCost();
        }
        return costBouquet * 1.1;
    }

    private int findMinLifeSpan() {
        int minSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minSpan) {
                minSpan = flower.getLifeSpan();
            }
        }
        return minSpan;
    }

    @Override
    public String toString() {
        return " Стоимость букета = " + new DecimalFormat("0.00").format(calculateCost())
                + " руб. Срок хранения букета = " + findMinLifeSpan() + " дн.";
    }
}

