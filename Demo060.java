public class Demo060 {
    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to print
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series of " + n + " numbers:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}