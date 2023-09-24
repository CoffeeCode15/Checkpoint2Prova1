public class Cola implements Drinkable {

    @Override
    public void onDrink(Person person) {
        person.setThirst(person.getThirst() - 5);
        System.out.println("You drunk a cola!");
    }

}