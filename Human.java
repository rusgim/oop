public class Human {
    int yearOfBirth;
    String name;
    String city;

    Human(int yearOfBirth, String name, String city) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
    }
    public void human() {
        System.out.println("Привет! Меня зовут " + name + " Я из город " + city + "Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }
}
