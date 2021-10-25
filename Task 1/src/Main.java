import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Enter c: ");
        int c = Integer.parseInt(reader.readLine());

        System.out.println("Enter x: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Enter y: ");
        int y = Integer.parseInt(reader.readLine());

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
