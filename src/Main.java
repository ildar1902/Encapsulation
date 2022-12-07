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
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(chrysanthemum);
        bouquet.addFlowers(pion);
        bouquet.addFlowers(pion);
        bouquet.addFlowers(pion);
        bouquet.addFlowers(gypsophila);
        bouquet.addFlowers(gypsophila);
        bouquet.addFlowers(gypsophila);
        System.out.println(bouquet);
    }
}