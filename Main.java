public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-1988, "Максим", "Минск","Бренд-менеджер");
        Human anya = new Human(1993, "Аня","Москва", "Методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");
        Human sarah = new Human(1999);
        maksim.human();
        anya.human();
        katya.human();
        artem.human();
        sarah.human();
        System.out.println(" ");
        Avto lada = new Avto("Lada", "Granta", 1.7,"желтого", 2015, "Россия");
        Avto audi = new Avto("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
        Avto bmw = new Avto("BMW", "Z8", 3, "черный", 2021, "Германия");
        Avto kia = new Avto("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Avto hyundai = new Avto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        lada.avto();
        audi.avto();
        bmw.avto();
        kia.avto();
        hyundai.avto();


        katya.friends = null;
        sarah.addFriend(anya);
        
        System.out.println("У человека " + katya.name + " " + katya.getFriends().length + " друзей");
        System.out.println("У человека " + sarah.name + " " + sarah.getFriends().length + " друзей");

        sarah.friends[0].human();
    }
}
