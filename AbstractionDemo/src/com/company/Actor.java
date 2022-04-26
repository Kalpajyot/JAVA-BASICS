package com.company;
import java.util.List;

public class Actor extends Human{
    private String actingSchool;
    private String films;
    private List<String> Dramma;


    public Actor(String name, int age, Gender gender, float height, String actingSchool, String films) {
        super(name, age, gender, height);
        this.actingSchool = actingSchool;
        this.films = films;
    }

    public int getTimeToLive(){
        return (LIFESPAN-getAge())/2;
    }

    public String getActingSchool() {
        return actingSchool;
    }

    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    public List<String> getDramma() {
        return Dramma;
    }

    public void setDramma(List<String> dramma) {
        Dramma = dramma;
    }
}
