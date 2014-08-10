/*
 * ACCEPTED
 */
package _101_hack_january;

import java.util.Scanner;

/**
 *
 * @author udith
 */
public class Floating_Rocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T, x1, y1, x2, y2;
        T = in.nextInt();

        for (int i = 0; i < T; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();

            System.out.println(numRocks(x1, y1, x2, y2));
        }
    }

    public static int numRocks(int x1, int y1, int x2, int y2) {

        int xDif = Math.abs(x2 - x1);
        int yDif = Math.abs(y2 - y1);

        if (xDif == 0) {
            return yDif - 1;
        } else if (yDif == 0) {
            return xDif - 1;
        } else{
            return gcd(xDif, yDif) - 1;
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}
