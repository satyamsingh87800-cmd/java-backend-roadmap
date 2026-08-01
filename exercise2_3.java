import java.util.Scanner;
//taking input from user to check the number is greater then the system number or not
public class exercise2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println(a < 10);

        sc.close();
    }

}
