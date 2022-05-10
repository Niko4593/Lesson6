package Lesson6;

public class HomeWork6 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 180);
        Cat cat2 = new Cat("Pushok", 150);
        Dog dog1 = new Dog("Bobik", 460, 9);
        Dog dog2 = new Dog("Sharik", 400, 7);

        Animal[] animals = { cat1, cat2, dog1, dog2 };

        for (int i = 0; i < animals.length; i++) {
            animals[i].running();

            if (animals[i] instanceof Dog) {
                Dog dogs = (Dog) animals[i];
                dogs.swimming();
            }
        }
        System.out.println("########################");
        System.out.println("Animals number: " + animals.length);
    }
}
