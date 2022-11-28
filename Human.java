import java.time.LocalDate;
import java.util.Arrays;

public class Human {
    private int yearOfBirth;
    private String name;
    private String city;
    private String jobTitle;
    private Human[] friends;

    Human(String name) {
        this(0, name, "Информация не указана", "Информация не указана");
    }
    Human(int age, String name, String city, String jobTitle) {
        if (age >= 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }

        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
        friends = new Human[0];
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }
    Human[] getFriends() {
        if (friends == null) {
            friends = new Human[0];
        }
        return friends;
    }
    public void addFriend(Human friend) {
        Human[] friends = new Human[getFriends().length + 1];
        this.friends = Arrays.copyOf(this.friends, getFriends().length + 1);
        this.friends[this.friends.length -1] = friend;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
    }
    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty() && !city.isBlank()) {
            this.city = city;
        } else {
            this.city = "Информация не указана";
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }

    public void human() {
        System.out.println("Привет! Меня зовут " + getName() + "!" + " Я из города " + getCity() + "." + " Мне  " + getAge() + " лет." + " Я работаю на должности " + getJobTitle() + "." + " Будем знакомы!");
    }
}
