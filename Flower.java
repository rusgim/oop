import java.util.Arrays;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    private Flower[] bouquetOfFlowers;
    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
        if (lifeSpan != 0 && lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost != 0 && cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost( ) {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    Flower[] getBouquetOfFlowers() {
        if (bouquetOfFlowers == null) {
            bouquetOfFlowers = new Flower[0];
        }
        return bouquetOfFlowers;
    }

    public String toString() {
        return "Всего цветов " + this.bouquetOfFlowers;
    }
    public void addBouquetOfFlowers(Flower flower ) {
        Flower[] bouquetOfFlowers = new Flower[getBouquetOfFlowers().length + 1];
        this.bouquetOfFlowers = Arrays.copyOf(this.bouquetOfFlowers, getBouquetOfFlowers().length + 1);
        this.bouquetOfFlowers[this.bouquetOfFlowers.length -1] = flower;
    }

     public void flower () {
        System.out.println(getFlowerColor() + " из " + getCountry() + " . Стоимость " + getCost() + " рублей. Срок стояния " + lifeSpan + " дней.");
  }
}
