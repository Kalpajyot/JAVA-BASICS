package academy.learnprogramming;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Deluxe", "Sausage & Bacon", 9.08, "White");
        super.addHamburgerAddition1("Chips",1.5);
        super.addHamburgerAddition2("Drink",2.5);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("This could not be added to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("This could not be added to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("This could not be added to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("This could not be added to the Deluxe Burger");
    }


}
