import java.util.Scanner;
//normal if else else if 
public class exercise4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you maths subject marks");
        int maths = sc.nextInt();

        System.out.println("enter you physics subject marks");
        int physics = sc.nextInt();

        System.out.println("enter you chemistry subject marks");
        int chemistry = sc.nextInt();

        float total = (maths + physics + chemistry);
        float cgpa = total / 300 * 100;
        System.out.println(cgpa);
         /* if (cgpa == 33.0) {
            System.out.println("you passed the exam. \n you can do better then that. ");

        } else if (cgpa >= 70.0) {
            System.out.println("qualify for the  award");
        } else {
            System.out.println("try again later ");
        }
             String name = sc.next();
        */
/*with th switch statement where u cannot do range thing in this . you have to make variable
as mention below to make the number in whole number.   
btw dont panic it is a enhance switch*/
       int grade = (int) cgpa / 10;   // <-- new variable, cgpa divided by 10

switch (grade) {
    case 10, 9, 8, 7 -> System.out.println("qualify for the award");
    case 6, 5, 4, 3 -> System.out.println("you passed the exam. you can do better than that.");
    default -> System.out.println("you failed. try again next time.");
}
        sc.close();

    }
}
