import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 1 amigos
        int N = scanner.nextInt(); // 5 fatias
        int totalFatias = T * N; // 1 * 5 = 5
        int step = 1;

        int pizza = totalFatias - SLICE; //   5-4=1

        while (pizza > 0) {
            if (totalFatias % 2 == 1) {
                pizza = pizza - SLICE;
                step++;
            } else {
                pizza = pizza - SLICE;
                step++;
            }
        }
        System.out.println(step);
    }
}