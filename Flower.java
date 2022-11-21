import java.util.Arrays;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;

    private int quantity;
    int lifeSpan;

    private Flower[] bouquetOfFlowers;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this(flowerColor, country, cost, lifeSpan, 1);
    }
    Flower(String flowerColor, String country, double cost, int lifeSpan, int quantity) {
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
        if (quantity != 0 && quantity>0) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    Flower[] getBouquetOfFlowers() {
        if (bouquetOfFlowers == null) {
            bouquetOfFlowers = new Flower[0];
        }
        return bouquetOfFlowers;
    }

    public String toString() {
        return "Букет, в котором есть " + this.flowerColor + " в количестве - " + this.quantity + ", будет стоить - " + this.cost + " рублей " + " и простоить " + this.lifeSpan ;
    }
    public void addBouquetOfFlowers(Flower flowers ) {
        Flower[] bouquetOfFlowers = new Flower[getBouquetOfFlowers().length + 1];
        this.bouquetOfFlowers = Arrays.copyOf(this.bouquetOfFlowers, getBouquetOfFlowers().length + 1);
        this.bouquetOfFlowers[this.bouquetOfFlowers.length -1] = flowers;
    }
     public void flower () {
        System.out.println(getFlowerColor() + " из " + getCountry() + " . Стоимость " + getCost() + " рублей. Срок стояния " + lifeSpan + " дней.");
  }
}
