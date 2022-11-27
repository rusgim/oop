package transport;

import java.time.LocalDate;
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
    private boolean summerRubber;
    private Key key;
    private Insurance insurance;

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }
        public Boolean getKeylessAccess() {
            return keylessAccess;
        }

        public Key(Boolean remoteEngineStart, Boolean keylessAccess) {
            if (remoteEngineStart != null && remoteEngineStart) {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess != null && keylessAccess) {
                this.keylessAccess = keylessAccess;
            }
        }

        public String toString() {
            return "Удаленный запуск двигателя - " +  remoteEngineStart + " " + "Бесключевой доступ - " + keylessAccess;
        }
    }

    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public class Insurance {
        private LocalDate duration;
        private double cost;
        private String number;
        public Insurance (LocalDate duration, double cost, String number) {
            this.duration = checkDuration(duration);
            this.cost = cost;
            this.number = serialNumber(number) ? number : "invalid number";
        }
        private boolean serialNumber(String number) {
            if (Pattern.matches("[а-я-0-9]{9}", number)) {
                return true;
            } else {
                System.out.println("Номер некорректен");
                return false;
            }
        }
        public String toString() {
            return "Дата, стоимость, номер страховки  - " + duration + " " + cost + " " +  serialNumber(number);
        }

        public LocalDate checkDuration(LocalDate duration) {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("Страховка просрочена");
                return LocalDate.now();
            } else {
                return duration;
            }
        }
    }

    public Car(double engineVolume) {
        this("default","default", engineVolume, "default", 0, "default",
                "default", "default", "default", 0, false);
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerRubber) {
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
    }
    public void switchRubber() {
        setRubber(!this.summerRubber);
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

    public void setRubber(boolean rubber) {
        rubber = rubber;
    }
    public void car() {
        System.out.println(brand + model + ", " + year + " года выпуска, сборка в " + country +
                ", " + color + " цвета, объем двигателя — " + engineVolume + " л." + " с коробкой передач типа "
                + transmission + ", кузов " + bodyType + ", гос. регистрационный номер - " + registrationNumber +
                ", количество мест в автомобиле с водителем - " + numberOfSeats + ", резина установлена " + summerRubber);
    }
}
