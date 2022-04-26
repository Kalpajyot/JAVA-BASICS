package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 2, "White");

        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Cheese", 0.15);
        hamburger.addHamburgerAddition3("Lettuce", 1.17);
        System.out.println("Totol Burger price is : " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHamburgerAddition1("Lentills",3.41);
        System.out.println("Total healthy burger price is : " + healthyBurger.itemizeHamburger());

        DeluxBurger db = new DeluxBurger();
        db.addHamburgerAddition3("This could not be added ", 11.10);

        System.out.println("Total Deluxe Burger Price is : " + db.itemizeHamburger());


    }
}
