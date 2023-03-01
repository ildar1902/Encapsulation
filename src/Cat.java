import java.time.LocalDate;
import java.util.Arrays;
public class Cat {
    private String name;
    private final int birthYear;
    private Cat[] friends;

    public Cat(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
        friends = new Cat[0];
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Кот";
        } else {
            this.name = name;
        }
    }

    void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут " + name);
        if (getAge() > 10) {
            System.out.println("Мне уже " + getAge() + " лет");
        } else
            System.out.println("Мне ещё " + getAge() + " лет");
    }

    Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }

    void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }
}
