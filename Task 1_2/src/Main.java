import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int inputNumbers(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        try {
            return number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = inputNumbers();
        System.out.println("Enter b: ");
        int b = inputNumbers();
        System.out.println("Enter c: ");
        int c = inputNumbers();

        System.out.println("Enter x: ");
        int x = inputNumbers();
        System.out.println("Enter y: ");
        int y = inputNumbers();

        if(a < x && b < y ||
        a < x && c < y ||
        b < x && c < y ||
        a < y && b < x ||
        a < y && c < x ||
        b < y && c < x){
            System.out.println("A brick can go into a rectangular hole :)");
        }
        else{
            System.out.println("A brick can't go into a rectangular hole!");
        }
    }
}
