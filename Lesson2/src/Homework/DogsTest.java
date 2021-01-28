package Homework;

public class DogsTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Рекс");

        dog.setAge(5);

        dog.setWeight(13);

        dog.setBreeds("Дворняга");


        System.out.println(" Первая собака  ");
        DogPrint(dog);

        Dog dog2 = dog;


        changedog(dog2);
        System.out.println(" Другая собака ");
        DogPrint(dog2);
        System.out.println();



    }

    public static void DogPrint(Dog dog) {
        System.out.println(dog.getName());
        System.out.println(dog.getAge() + " лет");
        System.out.println(dog.getWeight() + " килограм");
        System.out.println(dog.getBreeds());


    }

    private static void changedog(Dog dog) {
        dog.setName( "Кайфик");
        dog.setAge(6 );
        dog.setBreeds("Бульдог");
        dog.setWeight(13 );

    }

}
