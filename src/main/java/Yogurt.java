public class Yogurt implements Eatable, Drinkable {

    @Override
    public void onDrink(Person person) {
        person.setThirst(person.getThirst() - 3);
    }

    @Override
    public void onEat(Person person) {
        person.setHunger(person.getHunger() - 3);
        System.out.println("You ate a yogurt!");
    }

    @Override
    public boolean isPoisoned() {
        return false;
    }

}