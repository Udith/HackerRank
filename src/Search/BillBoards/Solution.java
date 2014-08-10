/*Time exceeded*/
package Search.BillBoards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
        String[] subS = line.split(" ");

        int n = Integer.parseInt(subS[0]);
        int k = Integer.parseInt(subS[1]);

        
        subS = line.split(" ");

        int[] boards = new int[n];

        for (int i = 0; i < n; i++) {
            line = br.readLine();
            boards[i] = Integer.parseInt(line);
        }
        
        System.out.println(maxProfit(n, k, boards));        
    }

    private static int maxProfit(int n, int k, int[] b){
        
        Integer[] a1 = new Integer[k+1];
        Integer[] a2 = new Integer[k+1];
                
        int maxIndex1 = 0;
        int maxIndex2 = 0;        
        
        int num = 1;
        
        a2[0] = 0;        
        
        for (int i = 0; i < n; i++) {
            if(num == 1){
                int limit;
                if(maxIndex2 == k){
                    limit = k-1;
                }
                else{
                    limit = maxIndex2;
                }
                a1[0] = a2[maxIndex2];
                for (int j = 0; j <= limit; j++) {
                    if(a2[j] == null){
                        break;
                    }
                    
                    a1[j+1] = a2[j]+b[i];
                    if(a1[j+1] > a1[maxIndex1]){
                        maxIndex1 = j+1;
                    }
                }
                a2 = new Integer[k+1];
                maxIndex2 = 0;
                num = 2;
            }
            else{
                int limit;
                if(maxIndex1 == k){
                    limit = k-1;
                }
                else{
                    limit = maxIndex1;
                }
                a2[0] = a1[maxIndex1];
                for (int j = 0; j <= limit; j++) {
                    if(a1[j] == null){
                        break;
                    }
                    
                    a2[j+1] = a1[j]+b[i];
                    if(a2[j+1] > a2[maxIndex2]){
                        maxIndex2 = j+1;
                    }
                }

                a1 = new Integer[k+1];
                maxIndex1 = 0;
                num = 1;
            }
        }

        int maxProf = 0;
        
        if(num == 1){
            maxProf = a2[maxIndex2];
        }
        else{
            maxProf = a1[maxIndex1];
        }
        return maxProf;        
    }
}



