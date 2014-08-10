/*
ACCEPTED SOLUTION
*/

package Search.Flowers;

/**
 *
 * @author udithg
 */
import java.util.*;

class Solution {

    public static void main(String args[]) {

// helpers for input/output      
        Scanner in = new Scanner(System.in);

        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        int C[] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }

        int result = minMoney(N, K, C);
        System.out.println(result);

    }

    public static int minMoney(int N, int K, int[] C) {

        int amount = 0;

        if (N <= K) {
            for (int i = 0; i < C.length; i++) {
                amount += C[i];
            }
        } else {
            Arrays.sort(C);
            int factor = 1;
            int k = K;

            for (int i = C.length - 1; i >= 0; i--) {
                amount += C[i] * factor;
                k--;
                if(k == 0){
                    k = K;
                    factor++;
                }
            }
        }
        return amount;
    }
}
