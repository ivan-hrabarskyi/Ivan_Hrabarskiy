import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //1
        System.out.println("1)");
        System.out.print("Enter first float number: ");
        float firstFloat = Float.parseFloat(reader.readLine());
        System.out.print("Enter second float number: ");
        float secondFloat = Float.parseFloat(reader.readLine());
        System.out.print("Enter third float number: ");
        float thirdFloat = Float.parseFloat(reader.readLine());

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
            integerNumbers[i] = Integer.parseInt(reader.readLine());
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
        Dog firstDog = new Dog("Bailey", DogBreeds.BEAGLE, 7);
        Dog secondDog = new Dog("Ellie", DogBreeds.SHEPHERD, 4);
        Dog thirdDog = new Dog("Buddy", DogBreeds.AKITA, 3);

        if(firstDog.getName().equals(secondDog.getName()) ||
        firstDog.getName().equals(thirdDog.getName()) ||
        secondDog.getName().equals(thirdDog.getName())){
            System.out.println("There is dogs with the same name");
        }
        else{
            System.out.println("There is no dogs with the same name");
        }

        if(firstDog.getAge() > secondDog.getAge() && firstDog.getAge() > thirdDog.getAge()){
            System.out.println(firstDog.getName() + " is the oldest dog. His breed is " + firstDog.getBreed());
        }
        else if(secondDog.getAge() > firstDog.getAge() && secondDog.getAge() > thirdDog.getAge()){
            System.out.println(secondDog.getName() + " is the oldest dog. His breed is " + secondDog.getBreed());
        }
        else if(thirdDog.getAge() > firstDog.getAge() &&thirdDog.getAge() > secondDog.getAge()){
            System.out.println(thirdDog.getName() + " is the oldest dog. His breed is " + thirdDog.getBreed());
        }
    }
}
