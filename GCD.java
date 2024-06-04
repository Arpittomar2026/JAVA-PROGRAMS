public class GCD {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Function to find the GCD using the Euclidean algorithm
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}