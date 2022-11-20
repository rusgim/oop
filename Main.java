public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-34, "Максим", "Минск","Бренд-менеджер");
        Human anya = new Human(29, "Аня","Москва", "менеджер по рекламе");
        Human katya = new Human(30, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "Директор по развитию бизнеса");
        Human sarah = new Human("Sarah");
        Human vlad = new Human(21, "Владимир", "Казань", "безработный");

        maksim.human();
        katya.human();
        anya.human();
        artem.human();
        sarah.human();
        vlad.human();
        maksim.setCity(null);
        anya.setJobTitle(null);
        artem.setName(null);

        katya.getFriends();
        sarah.addFriend(anya);

        System.out.println("У " + katya.getName() + " " + katya.getFriends().length + " друзей");
        System.out.println("У " + sarah.getName() + " " + sarah.getFriends().length + " друг");

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
        System.out.println(" ");

        Flower roza = new Flower("Роза обыкновенная","Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9,1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        roza.flower();
        chrysanthemum.flower();
        pion.flower();
        gypsophila.flower();

        roza.addBouquetOfFlowers(chrysanthemum);
        roza.addBouquetOfFlowers(pion);
        System.out.println("всего цветов " + roza.getBouquetOfFlowers().toString());
    }
}
