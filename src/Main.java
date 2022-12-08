import Transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("    Урок Инкапсуляция");
        Cat barsik = new Cat("Барсик", 18);
        barsik.meow();
        System.out.println();
        Cat murzik = new Cat("Мурзик", 8);
        murzik.meow();
        Cat pushok = new Cat("Пушок", 7);
        pushok.meow();
        barsik.addFriend(murzik);
        pushok.setName("Пушочек");
        System.out.println("pushok.getName() = " + pushok.getName());
        System.out.println();
//        ДЗ
//        Задание 1
        System.out.println("    Задание 1");
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        maksim.sayHello();
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        anna.sayHello();
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        katya.sayHello();
        Human artyom = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        artyom.sayHello();
        Human vladimir = new Human(2001, "Владимир", "Казань", "");
        vladimir.sayHello();
        System.out.println();

//         ДЗ
//        Задание 2
        System.out.println("    Задание 2");
        System.out.println();
        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.39);
        System.out.println("rose = " + rose);
        Flower chrysanthemum = new Flower("Хризантема", "", 15.00, 5);
        System.out.println("chrysanthemum = " + chrysanthemum);
        Flower pion = new Flower("Пион", "Англия", 69.90, 1);
        System.out.println("pion = " + pion);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.50, 10);
        System.out.println("gypsophila = " + gypsophila);
        System.out.println();
//        Доп задание
        System.out.println("    Доп задание");
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowers(rose);        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(chrysanthemum);        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(gypsophila);        bouquet.addFlowers(gypsophila);
        bouquet.addFlowers(gypsophila);
        bouquet.printBouquet();
//        дз2
        System.out.println();
        System.out.println("DZ 2");
        Car ladaGranta = new Car(
                "Lada",
                "Granta",
                1.7,
                "yellow",
                2015,
                "Russia",
                "механика",
                "седан",
                "а001аа102",
                5,
                true);
        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "black",
                2020,
                "Germany",
                "автомат",
                "седан",
                "а002аа102",
                4,
                true);
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "black",
                2021,
                "Germany",
                "механика",
                "хэтчбек",
                "а003аа102",
                4,
                true);
        Car kiaSportage = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "red",
                2018,
                "south Korea",
                "автомат",
                "кроссовер",
                "а004аа102",
                6,
                true);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "orange",
                2016,
                "south Korea",
                "механика",
                "седан",
                "а005аа102",
                5,
                true);
        System.out.println();
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmw);
        System.out.println(kiaSportage);
        System.out.println(hyundai);
        System.out.println();
    }
}