public class exercise1_3 {
    public static void main(String[] args) {
        // define subject 
        int maths= 98;
        int physics = 66;
        int chemistry = 55;

        float total = (maths+physics+chemistry);
        float cgpa = total/300*100;

        System.out.println("Total marks of all subject out of 300:" + total);
        System.out.println("Total percentage you obtain:" + cgpa);
    }
}
