package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Bob";
        player.health = 20;
        player.weapon = "Gun";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " +player.healthRemaining());

        damage = 20;
        player.health= 200;

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // Different class example....from Printer  class....
        //  This example is a demo for the concept of encapsulation....

        Printer printer = new Printer(50,true);

        System.out.println("initial page count = " +printer.getPrintedPageNumber());
        int pagesPrinted = printer.printPages(4);

        System.out.println("Pages printed wads " +pagesPrinted + " new total print count for printer : " + printer.getPrintedPageNumber());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed wads " +pagesPrinted + " new total print count for printer : " + printer.getPrintedPageNumber());




    }


}
