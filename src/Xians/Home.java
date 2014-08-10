/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xians;

import java.util.Scanner;

/**
 *
 * @author udith
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while ((n != 0) && (m != 0)) {
            String[] map = new String[n];
            for (int i = 0; i < n; i++) {
                map[i] = sc.next();                
            }
            
            minCost(map, n, m);
            
            n = sc.nextInt();
            m = sc.nextInt();
        }
    }
    
    public static void minCost(String[] map, int n, int m){
        
    }
}
