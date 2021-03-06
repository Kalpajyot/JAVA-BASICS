package academy.learnprogramming;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

        public void addHealthAddition1(String name , double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

    }
    public void addHealthAddition2String (String name , double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

    }

    @Override
    public double itemizeHamburger() {
        double healthyHamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Price + "for an extra " + this.healthyExtra1Name );
        }
        if(this.healthyExtra2Name != null){
            healthyHamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Price + "for an extra " + this.healthyExtra2Name );
        }
        return healthyHamburgerPrice;
    }
}
