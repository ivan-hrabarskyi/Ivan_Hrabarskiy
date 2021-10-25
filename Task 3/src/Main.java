import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1
        System.out.print("Enter radius of a flower bed: ");
        double r = Double.parseDouble(reader.readLine());
        double C = 2 * r * 3.14;
        System.out.println("Perimeter of a circle = " + C);
        double A = r * r * 3.14;
        System.out.println("Area of a circle = " + A);
        System.out.println("-----------------------------------------------------");

        //2
        String name;
        String address;
        System.out.println("What is your name?");
        name = reader.readLine();
        System.out.println("Where do you live, " + name + "?");
        address = reader.readLine();
        System.out.println(name + " lives at " + address);
        System.out.println("-----------------------------------------------------");

        //3
        System.out.print("Enter c1: ");
        int c1 = Integer.parseInt(reader.readLine());
        System.out.print("Enter c2: ");
        int c2 = Integer.parseInt(reader.readLine());
        System.out.print("Enter c3: ");
        int c3 = Integer.parseInt(reader.readLine());

        System.out.print("Enter t1: ");
        int t1 = Integer.parseInt(reader.readLine());
        System.out.print("Enter t2: ");
        int t2 = Integer.parseInt(reader.readLine());
        System.out.print("Enter t3: ");
        int t3 = Integer.parseInt(reader.readLine());

        int res1 = c1 * t1;
        int res2 = c2 * t2;
        int res3 = c3 * t3;
        int res = res1 + res2 + res3;
        System.out.println("For first call computer will count " + res1 + " standard units, for second - " + res2 +
                ", for third - " + res3 + " and for all talk together - " + res + " standard units");
    }
}
