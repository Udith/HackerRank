/*
ACCEPTED SOLUTION
 */

package Search.FindTheMedian;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author udithg
 */
public class Solution {
    public static void main(String args[]) {

// helpers for input/output      
        Scanner in = new Scanner(System.in);

        int N;
        N = in.nextInt();

        int C[] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }

        int result = findMedian(N, C);
        System.out.println(result);

    }
    
    public static int findMedian(int N, int[] C){
        
        Arrays.sort(C);
        int middle = (N-1)/2;   //indexing starts at 0
        
        return C[middle];
    }
}
