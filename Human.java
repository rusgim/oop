import java.util.Arrays;

public class Human {
    int yearOfBirth;
    String name;
    String city;
    String jobTitle;
    Human[] friends;

    Human(int yearOfBirth) {
        this(yearOfBirth, "Информация не указана", "Информация не указана", "Информация не указана");
    }

    Human(int yearOfBirth, String name, String city, String jobTitle) {
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
    public void human() {
        System.out.println("Привет! Меня зовут " + name + "!" + " Я из города " + city + "." + " Я родился в " + yearOfBirth + " году." + " Я работаю на должности " + jobTitle + "." + " Будем знакомы!");
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
}
