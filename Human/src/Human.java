public class Human {
    static final int LifeSpan = 100;

    // you can make it private but then it is can't be accessed to other class
    private String Name;
    private int age;
    private float height;

    public Human(String name, int age) {
        Name = name;
        this.age = age;
    }

    public Human(String name, int age, float height) {
       this(name,age);
        this.height = height;
    }


    //
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }
//
////    public void computeAndPrint() {
////        int ttl = LifeSpan - this.age;
////        System.out.println("Time to live: " + ttl);
////    }
//
//    public int getTimeToLive(){
//        int ttl = LifeSpan - this.age;
//        return ttl;
//    }

}
