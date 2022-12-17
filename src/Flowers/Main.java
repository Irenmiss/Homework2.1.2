package Flowers;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower flower2 = new Flower("Хризантема", "", 15, 5);
        Flower flower3 = new Flower("Пион", "Англия", 69.9, 1);
        Flower flower4 = new Flower("Гипсофила", "Турция", 19.5, 10);
        flower1.flowerInformation();
        flower2.flowerInformation();
        flower3.flowerInformation();
        flower4.flowerInformation();
        Flower[] bouquet = new Flower[]{flower1, flower2, flower3, flower4};
        int[] countFlower = new int[bouquet.length];
        for (int i = 0; i < countFlower.length; i++) {
            countFlower[i] = 2 * i;
        }
        Bouquet bouquet1 = new Bouquet(bouquet, countFlower);
        bouquet1.bouquetInformation();
    }
}