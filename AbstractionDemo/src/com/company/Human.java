package com.company;

public abstract class Human {
    public static int LIFESPAN = 100;

    private String name;
    private int age;
    private float height;
    private Gender gender;

    public Human(String name, int age,Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name,int age,Gender gender,float height){
        this(name,age,gender);
        this.height = height;
    }

    public int getTimeToLive(){
     return (LIFESPAN - getAge())/2;
    }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public float getHeight () {
            return height;
        }

        public void setHeight ( float height){
            this.height = height;
        }

}


