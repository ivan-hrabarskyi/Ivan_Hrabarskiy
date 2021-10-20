import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n: ");
        long n = Integer.parseInt(reader.readLine());
        long tempN = n * n;
        long temp = 0;
        System.out.print("а) ");
        while (tempN > 2){
            temp = tempN % 10;
            tempN /= 10;
            if(temp != 3 && tempN < 2){
                System.out.println("Number n^2 doesn't contain digit 3");
            }
            if(temp != 3) {
                continue;
            }
            else{
                System.out.println("Number n^2 contains digit 3");
                break;
            }
        }

        tempN = n;
        temp = 0;
        while (tempN > 0){
            temp = (temp * 10) + (tempN % 10);
            tempN /= 10;
        }
        System.out.println("б) " + temp);

        tempN = n;
        String nString = Integer.toString((int) tempN);
        tempN = Integer.parseInt(String.valueOf(nString.charAt(nString.length() - 1)));
        for (int i = 1; i < nString.length() - 1; i++){
            tempN = (tempN * 10) + Integer.parseInt(String.valueOf(nString.charAt(i)));
        }
        tempN = (tempN * 10) + Integer.parseInt(String.valueOf(nString.charAt(0)));
        System.out.println("в) " + tempN);


        tempN = n;
        nString = "1" + Integer.toString((int) tempN) + "1";
        tempN = Integer.parseInt(nString);
        System.out.println("г) " + tempN);
    }
}