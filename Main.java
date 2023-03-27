public class Main {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();

            for (int n = 0; n <= 30; n++) {
                int r = 0;
                while (r == 0) {
                    r = (int) (Math.random() * 100 + 1);
                }
                System.out.println(r);
            }
        }
    }
}