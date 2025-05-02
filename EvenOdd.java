public class EvenOddChecker {
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println("Even or Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (isEven(i)) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
