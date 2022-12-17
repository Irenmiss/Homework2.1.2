package Flowers;

import java.util.Objects;

public class Flower {
    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;

    Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName.isEmpty() || flowerName.isBlank() || flowerName == null) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country.isEmpty() || country.isBlank() || country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public void flowerInformation() {
        System.out.println("Название: " + getFlowerName() + "; страна происхождения: " + getCountry() + "; цена за 1 штуку: " + String.format("%.2f", getCost()) + " рублей; срок стояния: " + getLifeSpan() + " дней.");
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
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Название: " + flowerName + "; страна происхождения: " + country + "; цена за 1 штуку: " + String.format("%.2f", cost) + "; срок стояния: " + lifeSpan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && Objects.equals(flowerName, flower.flowerName) && Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerName, country, cost, lifeSpan);
    }
}
