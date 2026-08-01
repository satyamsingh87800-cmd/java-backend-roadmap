public class exercise2_1 {
    public static void main(String[] args) {
        float a = 7 / 4 * 9 / 2; // ans is 4 because 7/4 is float but 9/2 is int hence 
        // answer in 4 which is wrong.
        System.out.println(a);

        float b = 7 / 4.0f * 9 / 2.0f;
        System.out.println(b); //now it will give me the correct answer which is 7.875
    }
}
//to be honest i made a mistake in this code so i take the help of ai.