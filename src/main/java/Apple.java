public class Apple implements Eatable {
    @Override
    public void onEat(Person person) {
        person.setHunger(person.getHunger() - 5);
        System.out.println("You ate an apple.");
    }

    @Override
    public boolean isPoisoned() {
        return true;
    }

}