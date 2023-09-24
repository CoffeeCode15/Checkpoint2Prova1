import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Emanuele");
        HashSet<Eatable> eatables = new HashSet<Eatable>(3);

        eatables.add(new Apple());
        eatables.add(new Yogurt());
        eatables.add(new Yogurt());

        HashSet<Drinkable> drinkables = new HashSet<Drinkable>(2);

        drinkables.add(new Cola());
        drinkables.add(new Yogurt());

        person.haveLaunch(eatables, drinkables);
    }
}