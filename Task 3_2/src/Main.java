import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int inputNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;

        try {
            return number = Integer.parseInt(reader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }


    public static double inputDouble(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number;

        try {
            return number = Double.parseDouble(reader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static String inputString(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            return str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        //1
        System.out.print("Enter radius of a flower bed: ");
        double r = inputDouble();
        double C = 2 * r * 3.14;
        System.out.println("Perimeter of a circle = " + C);
        double A = r * r * 3.14;
        System.out.println("Area of a circle = " + A);
        System.out.println("-----------------------------------------------------");

        //2
        String name;
        String address;
        System.out.println("What is your name?");
        name = inputString();
        System.out.println("Where do you live, " + name + "?");
        address = inputString();
        System.out.println(name + " lives at " + address);
        System.out.println("-----------------------------------------------------");

        //3
        System.out.print("Enter c1: ");
        int c1 = inputNumber();
        System.out.print("Enter c2: ");
        int c2 = inputNumber();
        System.out.print("Enter c3: ");
        int c3 = inputNumber();

        System.out.print("Enter t1: ");
        int t1 = inputNumber();
        System.out.print("Enter t2: ");
        int t2 = inputNumber();
        System.out.print("Enter t3: ");
        int t3 = inputNumber();

        int res1 = c1 * t1;
        int res2 = c2 * t2;
        int res3 = c3 * t3;
        int res = res1 + res2 + res3;
        System.out.println("For first call computer will count " + res1 + " standard units, for second - " + res2 +
                ", for third - " + res3 + " and for all talk together - " + res + " standard units");
    }
}
