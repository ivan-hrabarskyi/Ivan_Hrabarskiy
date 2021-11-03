import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {

    public static float inputFloat(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float number;

        try {
            return number = Float.parseFloat(reader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static int inputInt(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;

        try {
            return number = Integer.parseInt(reader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        //1
        System.out.println("1)");
        System.out.print("Enter first float number: ");
        float firstFloat = inputFloat();
        System.out.print("Enter second float number: ");
        float secondFloat = inputFloat();
        System.out.print("Enter third float number: ");
        float thirdFloat = inputFloat();

        if(firstFloat >= -5 && firstFloat <= 5 &&
        secondFloat >= -5 && secondFloat <= 5 &&
        thirdFloat >= -5 && thirdFloat <= 5){
            System.out.println("All float numbers belong to the range [-5;5]");
        }
        else{
            System.out.println("Not all float numbers belong to the range [-5;5]");
        }

        int[] integerNumbers = new int[3];

        for(int i = 0; i < integerNumbers.length; i++){
            System.out.print("Enter " + (i + 1) + " integer number: ");
            integerNumbers[i] = inputInt();
        }

        int integerMax = integerNumbers[0];
        int integerMin = integerNumbers[0];
        for (int i = 1; i < integerNumbers.length; i++) {
            if(integerNumbers[i] < integerMin){
                integerMin = integerNumbers[i];
            }
            else if(integerNumbers[i] > integerMax){
                integerMax = integerNumbers[i];
            }
        }
        System.out.println("Min number of integers is " + integerMin + " and Max number is " + integerMax);

        HTTPError httpError = HTTPError.ERROR405;
        System.out.println(httpError.errorName());

        //2
        System.out.println("2)");
        List<Dog> dogsList  = new ArrayList<>();

        dogsList.add(new Dog("Bailey", DogBreeds.BEAGLE, 7));
        dogsList.add(new Dog("Ellie", DogBreeds.SHEPHERD, 4));
        dogsList.add(new Dog("Buddy", DogBreeds.AKITA, 3));
        dogsList.add(new Dog("Buddy", DogBreeds.SHEPHERD, 8));

        out:
        for (int i = 0; i < dogsList.size() - 1; i++){
            for (int j = i + 1; j < dogsList.size(); j++){
                if(dogsList.listIterator(i).next().getName().equals(dogsList.listIterator(j).next().getName())){
                    System.out.println("There are dogs with the same name");
                    break out;
                }
                if(i == dogsList.size() - 2 && j == dogsList.size() - 1){
                    System.out.println("There aren't dogs with the same name");
                }
            }
        }

        System.out.println(Dog.theOldestDog(dogsList));
    }
}
