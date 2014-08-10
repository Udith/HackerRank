/*
 * WRONG ANSWER
 */
package _101_hack_january;

import java.util.Scanner;

/**
 *
 * @author udith
 */
public class Filling_Jars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N, M;
        N = in.nextInt();
        M = in.nextInt();

        int sum = 0;

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();

            sum += (b - a + 1) * k;
        }

        System.out.println(Math.round(sum / N));
    }
}
