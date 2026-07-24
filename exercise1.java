import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name;");
        String name = sc.next();

        System.out.println("Enter Your marks of maths ");
        int maths = sc.nextInt();

        System.out.println("Enter Your marks of physics ");
        int physics = sc.nextInt();

        System.out.println("Enter Your marks of chemistry ");
        int chemistry = sc.nextInt();

        System.out.println("Enter Your marks of computer");
        int computer = sc.nextInt();

        System.out.println("Enter Your marks of sanskrit ");
        int sanskrit = sc.nextInt();

        int total = maths + physics + chemistry + computer + sanskrit;
        double percentage = (total / 500.0) * 100;

        System.out.println("name:" + name);

        // System.out.println("THE MARKS ARE of" + maths + physics + chemistry +
        // computer + sanskrit); its become sticky

        System.out.println(
                "THE MARKS ARE of " + maths + " " + physics + " " + chemistry + " " + computer + " " + sanskrit);
        System.out.println("THESE MARKS ARE CALLULATED ON A BASE OF 100");
        System.out.println("YOUR PERCENTAGE IS: " + percentage + "%");
sc.close();
    }
}
