package Search.ClosestNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Udith Arosha
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        System.out.println(ClosestNumber(_a, _a_size));
    }
    
    static String ClosestNumber(int[] a, int n){
        Arrays.sort(a);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int minDif = Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++){
            int dif = Math.abs(a[i]-a[i-1]);
            if(dif < minDif){
                nums.clear();
                nums.add(a[i-1]);
                nums.add(a[i]);
                minDif = dif;
            }
            else if(dif == minDif){
                nums.add(a[i-1]);
                nums.add(a[i]);
            }
        }
        
        String ret = "";
        for(int i=0;i<nums.size();i++){
            ret += nums.get(i)+" ";
        }
        
        ret = ret.trim();
        return ret;
    }
}
