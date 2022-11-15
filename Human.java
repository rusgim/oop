public class Human {
    int yearOfBirth;
    String name;
    String city;
    String jobTitle;

    Human(int yearOfBirth, String name, String city, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
    }
    public void human() {
        System.out.println("Привет! Меня зовут " + name + "!" + " Я из города " + city + "." + " Я родился в " + yearOfBirth + " году." + " Я работаю на должности " + jobTitle + "." + " Будем знакомы!");
    }
}
