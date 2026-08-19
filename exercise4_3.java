/*import java.util.Scanner;
//Children under 5 years old get in for free ($0).
// Seniors 65 years and older pay a discounted price of $8.
// Students (with a valid ID) pay a discounted price of $10, 
// unless they qualify for the child or senior discounts.
// Everyone else pays the regular price of $14.
public class exercise4_3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("enter your age");
int age = sc.nextInt();
System.out.println("if your are student enter a valid id ");
int id = sc.nextInt();
int price = 14;
if (age<=5){
    System.out.println("Your entry is free");
} 
else if (age >= 65 )
{
    System.out.println("You have discount of $8. \n Your full payment is $6");
}
else if (id > 0)
{
    System.out.println("You have a discount of $10. \n Due payment is $4");

}
else{
    System.out.println("Please pay.\n" + price);
}
















    sc.close();
    }
}
    /* */


    import java.util.Scanner;

public class exercise4_3 {
    // 1. Named constants instead of hardcoded numbers
    private static final int CHILD_PRICE = 0;
    private static final int SENIOR_PRICE = 8;
    private static final int STUDENT_PRICE = 10;
    private static final int REGULAR_PRICE = 14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // 2. Input validation for invalid age entries
        if (age < 0) {
            System.out.println("Error: Age cannot be negative.");
            sc.close();
            return;
        }

        System.out.print("Enter student ID (or 0 if not a student): ");
        int id = sc.nextInt();

        int price;
        String discountCategory;

        // 3. Logic block assigns data instead of printing directly
        if (age < 5) {
            price = CHILD_PRICE;
            discountCategory = "Child Entry";
        } else if (age >= 65) {
            price = SENIOR_PRICE;
            discountCategory = "Senior Discount";
        } else if (id > 0) {
            price = STUDENT_PRICE;
            discountCategory = "Student Discount";
        } else {
            price = REGULAR_PRICE;
            discountCategory = "Regular Ticket";
        }

        // 4. Single print statement handles output (DRY Principle)
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Category: " + discountCategory);
        System.out.println("Total Due: $" + price);

        sc.close();
    }
}