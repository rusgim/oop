package transport;

import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String rubber;


    public Car(double engineVolume) {
        this("default","default", engineVolume, "default", 0, "default",
                "default", "default", "default", 0, "default");
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, String rubber) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = Math.abs(engineVolume);
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "default";
        }
        if (year > 0) {
            this.year = year;
        } else {
            this.year = Math.abs(year);
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }
        if (transmission == "manual" || transmission == "automatic" || transmission == "robotic") {
            this.transmission = transmission;
        } else {
            this.transmission = "default";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "default";
        }
        if (Pattern.matches("[а-я]{1}[0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "некорректный номер";
        }
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
        if (rubber == "winterRubber" || rubber == "summerRubber") {
            this.rubber = rubber;
        } else {
            this.rubber = "default";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }
    public void car() {
        System.out.println(brand + model + ", " + year + " года выпуска, сборка в " + country +
                ", " + color + " цвета, объем двигателя — " + engineVolume + " л." + " с коробкой передач типа "
                + transmission + ", кузов " + bodyType + ", гос. регистрационный номер - " + registrationNumber +
                ", количество мест в автомобиле с водителем - " + numberOfSeats + ", резина установлена " + rubber);
    }
}
