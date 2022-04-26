public class car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public car(int cylinders,
               String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car-> StartEngine()";
    }
    public String accelerate(){
        return "Car-> Accelerate()";
    }
    public String brake(){
        return "Car-> Brake()";
    }
}

class Mitsubishi extends car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}



class Ford extends car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Holden extends car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        // getClass().getSimpleName() is used to get the class name and add this name to next Strings.
        return getClass().getSimpleName()+ " -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " -> StartEngine()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " -> StartEngine()";
    }
}

class Main{
    public static void main(String[] args){
        car car1 = new car(8,"Base Car");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());


        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRW 4RD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(7,"Ford falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(7,"Holden commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }


}