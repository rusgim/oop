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

        Flower roza = new Flower("Роза обыкновенная","Голландия", 35.59, 0,1);
        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9,1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        roza.flower();
        chrysanthemum.flower();
        pion.flower();
        gypsophila.flower();

        System.out.println(" ");
        Flower[] bouquetOfFlowers = new Flower[4];
        bouquetOfFlowers[0] = new Flower("Астрамелия", "Россия", 109.9, 2,3);
        bouquetOfFlowers[1] = new Flower("Ромашка", "Россия", 17.9, 10,50);
        bouquetOfFlowers[2] = new Flower("Георгины", "Белорусия", 44.35, 4, 3);
        bouquetOfFlowers[3] = new Flower("Хризантемы","Россия",178.6,3);
        int totalBouquet = bouquetOfFlowers[0].getQuantity();
        for (int i = 1; i < bouquetOfFlowers.length ; i++) {
            totalBouquet = totalBouquet + bouquetOfFlowers[i].getQuantity();
        }
        System.out.println("Количество цветов в букете составляет - " + totalBouquet);
        double costBouquet = bouquetOfFlowers[0].getCost() * bouquetOfFlowers[0].getQuantity() + (bouquetOfFlowers[0].getCost()*bouquetOfFlowers[0].getQuantity()/10);
        for (int i = 1; i < bouquetOfFlowers.length; i++) {
            costBouquet = costBouquet + (bouquetOfFlowers[i].getCost() * bouquetOfFlowers[i].getQuantity() + (bouquetOfFlowers[0].getCost()*bouquetOfFlowers[0].getQuantity()/10));
        }
        System.out.println("Стоимость букета составляет - " + costBouquet);
        int minLifespan = bouquetOfFlowers[0].lifeSpan;
        for (int i = 0; i < bouquetOfFlowers.length; i++) {
            if (bouquetOfFlowers[i].lifeSpan < minLifespan) {
                minLifespan = bouquetOfFlowers[i].lifeSpan;
            }
        }
        System.out.println("Минимальный срок стояния букета составляет - " + minLifespan);
        System.out.println(bouquetOfFlowers[3]);
    }
}
