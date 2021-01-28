package Homework;

class Dog {


    public String name, breeds;
    private int weight, age;


    public Dog() {

    }

    public String getName() {
        return name;
    }

    public String getBreeds() {
        return breeds;
    }

    public int getAge() {

        return age;
    }

    public int getWeight() {

        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public void compareDog(Dog dog, Dog dog2) {
        if (dog.getAge() == dog2.getAge() && dog.getWeight() == dog2.getWeight()) {
            System.out.println(" У этих собак возраст и вес одинаковый ");
        } else {
            System.out.println(" У этих собак возраст и вес разный");
        }
        return;
    }
}





   


