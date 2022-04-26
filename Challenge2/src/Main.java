public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,13);


    }
    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet <= 0) || (inches <= 0 || inches >= 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        } else {
            double centimeters = 12 * 2.54 * feet;
            centimeters += inches *2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
            return (int) centimeters;
        }

    }


}
