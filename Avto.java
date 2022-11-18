public class Avto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Avto(double engineVolume) {
        this("default","default", engineVolume, "default", 0, "default");
    }

    Avto(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.color = color;
        this.country = country;
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = Math.abs(engineVolume);
        }
        if (year > 0) {
            this.year = year;
        } else {
            this.year = Math.abs(year);
        }
    }

    public void avto() {
        System.out.println(brand + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.");
    }
}
