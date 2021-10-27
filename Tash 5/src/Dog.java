public class Dog {
    private String name;
    private DogBreeds breed;
    private int age;

    Dog(){}

    Dog(String name, DogBreeds breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public DogBreeds getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
