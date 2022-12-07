import java.util.Arrays;

public class Flower {

    private  final String flowerName;
    private  final String country;
    private final double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        this.lifeSpan = lifeSpan;
    }

    public Flower(String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }
    public String getFlowerName() {
        return flowerName;
    }
    public String getCountry() {
        return country;
    }
    public double getCost() {
        return cost;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;}
            else{
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Название цветка: " + flowerName + ", страна происхождения: " + country +
                ", стоимость = " + cost +
                " рублей, срок стояния цветка: " + lifeSpan;
    }
}
