package Lesson6;

public class Animal {

    protected String name;
    protected int run;

    public Animal(String name, int run) {
        this.name = name;
        this.run = run;
    }

    public void running() {
        System.out.println(name + " runned " + run + " meters");
    }

}
