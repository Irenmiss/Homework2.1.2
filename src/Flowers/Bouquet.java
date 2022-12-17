package Flowers;

import java.util.Arrays;

public class Bouquet {
    private Flower[] flower;
    private int[] count;
    private double bouquetCost;
    private int dayLife;


    public Bouquet(Flower[] flower, int[] count) {
        this.flower = flower;
        this.count = count;
        bouquetCost = getBouquetCost();
        dayLife = getDayLife();
    }

    private double getBouquetCost() {
        for (int i = 0; i < flower.length; i++) {
            bouquetCost += count[i] * flower[i].getCost();
        }
        return bouquetCost;

    }

    private int getDayLife() {
        int i = 0;
        for (; i < flower.length; i++) {
            if (count[i] > 0) {
                dayLife = flower[i].getLifeSpan();
                break;
            }
        }
        for (; i < flower.length; i++) {
            if (dayLife > flower[i].getLifeSpan()) {
                dayLife = flower[i].getLifeSpan();
            }
        }
        return dayLife;
    }

    public void bouquetInformation() {
        System.out.println("Букет состоит из цветов со следующими параметрами: " + Arrays.toString(flower));
        System.out.println("Количество каждого типа цветов соответственно: " + Arrays.toString(count));
        System.out.println("Стоимость букета: " + String.format("%.2f", bouquetCost) + " рублей");
        System.out.println("Срок стояния: " + dayLife + " дней");
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flower=" + Arrays.toString(flower) +
                ", count=" + Arrays.toString(count) +
                ", bouquetCost=" + bouquetCost +
                ", dayLife=" + dayLife +
                '}';
    }
}


