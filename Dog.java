package Lesson6;

public class Dog extends Animal{
    private int swim;
    public Dog(String name, int run, int swim){
        super(name, run);
        this.swim = swim;
    }
    public void swimming(){
        System.out.println(name + " swimmed " + swim + " meters");
    }
}
