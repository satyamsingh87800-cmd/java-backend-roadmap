//km to miles converter 
import java.util.Scanner;
public class exercise1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Kilo meter value");
        int kilo = sc.nextInt();
double b =  0.621371;
        double total = kilo*b;

        System.out.println("YOUR KILOMETER VALUE IS: " + kilo );
        System.out.println("YOUR MILES VALUE IS: " + total);
sc.close();
    }
    
}
// 0.621371 * km 










