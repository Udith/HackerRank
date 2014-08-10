package Strings.StringSimilarity;

import java.util.Scanner;

/**
 *
 * @author Udith Arosha
 */
public class Solution {
    /* Head ends here */
    static int stringSimilarity(String a) {
        char[] st = (a.trim()).toCharArray();
        int n = st.length;
        int count = n;        
        int next = 0;
        char first = st[0];
        
        for(int i=1;i<n;i++){
            if(next > i){
                i = next;
            }
            
            if(st[i] == first){
                for(int j=i;j<n;j++){
                    if(st[j-i]==st[j]){
                        count++;
                        if((st[j]==first)&&(first <= i)){
                            next = st[j];
                        }
                    }
                    else{
                        if(first <= i){
                            next = st[j];
                        }
                        break;
                    }
                }
            }
        }

        return count;
    }
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            res = stringSimilarity(_a);
            System.out.println(res);
        }
    }
}
