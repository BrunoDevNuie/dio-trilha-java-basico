public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int x = 0; x <= 5; x++) {
            if (x == 3)
                // break;
                continue;
            System.out.println(x);
        }
    }
}
