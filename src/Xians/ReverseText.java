/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xians;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author udith
 */
public class ReverseText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            System.out.println(new StringBuffer(string).reverse().toString());            
        }
    }
}
