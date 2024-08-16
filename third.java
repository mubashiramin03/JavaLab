public class third {
    public static void main(String args[]) {
        int a = 5, b = 10;

        System.out.println("Before swapping, a = " + a + " and b = " + b);

        // Swap two variables without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}
