public class helloworld {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
