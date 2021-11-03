import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public static String theOldestDog(List<Dog> dogsList){
        if(dogsList.size() > 0) {
            Dog theOldestDog = dogsList.get(0);
            Iterator<Dog> iterator = dogsList.listIterator();

            while (iterator.hasNext()){
                Dog tempDog = iterator.next();
                if(theOldestDog.getAge() < tempDog.getAge()){
                    theOldestDog = tempDog;
                }
            }

            return theOldestDog.getName() + " is the oldest dog. His breed is " + theOldestDog.getBreed();
        }
        else{
            return "The list is empty!";
        }
    }
}
