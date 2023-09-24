import java.util.Collection;

public class Person {
    private String name;
    private int hunger;
    private int thirst;

    public Person(String name) {
        this.name = name;
        this.hunger = 100;
        this.thirst = 100;
    }

    public void eat(Eatable food) {
        food.onEat(this);
        if (food.isPoisoned()) {
            throw new RuntimeException(food.toString() + "is poisoned");
        }
    }

    public void drink(Drinkable drink) {
        drink.onDrink(this);
    }

    public void haveLaunch(Collection<Eatable> foods, Collection<Drinkable> drinks) {
        foods.forEach(food -> this.eat(food));
        drinks.forEach(drink -> this.drink(drink));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
}
