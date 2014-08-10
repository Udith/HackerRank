package Search.LonelyInteger;

import java.util.*;

public class Solution {
    /* Head ends here */

    static int lonelyinteger(int[] a) {        

        Arrays.sort(a);
        int n = a.length;
        int half = (int)n/2;
                
        for(int i=0;i<=half;i++){
            int index = i*2;
            if((index+1)==n){
                return a[index];
            }
            else{
                if(a[index] != a[index+1]){
                    return a[index];
                }
            }
        }
        
        return 0;
    }
    /* Tail starts here */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}