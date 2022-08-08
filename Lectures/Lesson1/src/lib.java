public class lib {
    public static void sayHi() {
        System.out.printf("Hi!");
    }

    public static double factor(int n) {
        if (n == 1) return 1;
        return n * factor(n - 1);

    }
}


