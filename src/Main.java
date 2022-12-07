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
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artyom = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        maksim.sayHello();
        anna.sayHello();
        katya.sayHello();
        artyom.sayHello();
    }
}