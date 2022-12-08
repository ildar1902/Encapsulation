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

    public void printBouquet() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        double sum = calculateCost();
        int lifeSpan = findMinLifeSpan();
        int j = 1;
        StringBuilder composition = new StringBuilder("Состав букета: ").append("\n");
        for (Flower flower : flowers) {
            composition.append(j++).append(". ").append(flower.getFlowerName()).append("\n");
        }
        composition.append("Срок хранения букета: ").append(lifeSpan).append(" д.").append("\n");
        composition.append("Стоимость букета: ").append(String.format("%.2f", sum)).append(" руб");
        return composition.toString();
    }
}

