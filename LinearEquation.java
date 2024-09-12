public class LinearEquation {

    public void compute() {
        System.out.println("(3번문제) ============");

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                if (7 * x + 5 * y == 1000) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }

        System.out.println("(3번종료) ============");
    }
}
