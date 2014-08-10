/*
ACCEPTED SOLUTION
 */

package hour_of_code_2013;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author udithg
 */
public class ShoppingSpree {
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);

        int N, M;
        N = in.nextInt();

        int C[] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
                
        M = in.nextInt();
        
        int result = findCheapest(M, C);
        System.out.println(result);

    }
    
    public static int findCheapest(int M, int[] C){
        int sum = 0;
        Arrays.sort(C);
        
        for (int i = 0; i < M; i++) {
            sum += C[i];            
        }
        
        return sum;
    }
}
