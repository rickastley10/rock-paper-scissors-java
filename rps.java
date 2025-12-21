import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissors");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int ch = 0;
        int ai = 0;
        while (true) {
            System.out.print("rock - 1 \n paper - 2 \n scissors - 3 \n ");
            ch = scanner.nextInt();
            ai = random.nextInt(3) + 1;
            if (ch == 1 && ai == 2) {
                System.out.println("ai wins");
            } else if (ch == 2 && ai == 3) {
                System.out.println("ai wins");
            } else if (ch == 3 && ai == 1) {
                System.out.println("ai wins");
            } else {
                System.out.println("player wins");
                System.out.println(ch + " " + ai);
            }
        }
    }
}
