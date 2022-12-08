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
        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(rose);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(gypsophila);
        bouquet.addFlowers(gypsophila);
        bouquet.addFlowers(gypsophila);
        bouquet.printBouquet();
//        дз2
        System.out.println();
        System.out.println("DZ 2");
        Car ladaGranta = new Car(
                "Лада",
                "Гранта",
                1.7,
                "жёлтый",
                2015,
                "Россия",
                "МКПП",
                "седан",
                "а001аа102",
                5);
        System.out.println(ladaGranta);
        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                "Германия",
                "АКПП",
                "седан",
                "а002аа102",
                4);
        System.out.println(audiA8);
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                "МКПП",
                "хэтчбек",
                "а003аа102",
                4);
        System.out.println(bmw);
        Car kiaSportage = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "АКПП",
                "кроссовер",
                "а004аа102",
                6);
        System.out.println(kiaSportage);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "МКПП",
                "седан",
                "а005аа102",
                5);
        System.out.println(hyundai);
        Car.Key bmwKey = new Car.Key(true, false);
        System.out.println(bmwKey);
        Car.Insurance grantaInsurance = ladaGranta.new Insurance(
                2023,
                9890,
                "ААА000001");
        System.out.println("Лада Гранта: " + grantaInsurance);
        Car.Insurance audiInsurance = audiA8.new Insurance(
                2022,
                12890,
                "ААА000002");
        System.out.println("Ауди: " + audiInsurance);
        Car.Insurance bmwInsurance = bmw.new Insurance(
                2021,
                11990,
                "ААА000003");
        System.out.println("БМВ: " + bmwInsurance);
        Car.Insurance kiaInsurance = kiaSportage.new Insurance(
                2024,
                9000,
                "ААА000004");
        System.out.println("Киа: " + kiaInsurance);
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(
                2022,
                10890,
                "ААА000005");
        System.out.println("Хёндай: " + hyundaiInsurance);

    }
}