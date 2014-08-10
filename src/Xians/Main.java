/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Xians;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author udith
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int caseN = 1;
        while ((a >= 0) && (b >= 0)) {



            ArrayList<Integer> nums = new ArrayList<Integer>();
            int max = 0;
            nums.add(a);
            nums.add(b);
            if (a > max) {
                max = a;
            }
            if (b > max) {
                max = b;
            }

            int n = sc.nextInt();
            while (n != 0) {
                if (n > max) {
                    max = n;
                }
                nums.add(n);
                n = sc.nextInt();
            }
            n = sc.nextInt();

            boolean r = processTree(nums, max);
            String rSt = "Case "+caseN;
            if(r){
                rSt += " is a tree.";
            }
            else{
                rSt+= " is a not tree.";
            }
            System.out.println(rSt);
            System.out.println("-------------");
            
                    a = sc.nextInt();
            b = sc.nextInt();
            caseN++;
        }
    }

    static boolean processTree(ArrayList<Integer> ar, int max) {
        
        System.out.println(":::<<"+max);
        
        Node[] nodes = new Node[max];
        for (int i = 0; i < ar.size();) {
            int child = ar.get(i) - 1;
            int parent = ar.get(i + 1) - 1;
            if(nodes[child]==null)
                nodes[child] = new Node();
            if(nodes[parent]==null)
                nodes[parent] = new Node();
            nodes[child].parents.add(parent);
            i += 2;
        }
        
        System.out.println(">><<"+nodes.length);
        int roots = 0;
        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i] == null)
                continue;
            int par = nodes[i].parents.size();
            System.out.println("::::"+par);
            if (par == 0) {
                if (roots == 0) {
                    roots = 1;
                } else {
                    return false;
                }
            } else if (par > 1) {
                return false;
            }
        }

        return true;
    }
}

class Node {

    public ArrayList<Integer> parents;

    public Node() {
        parents = new ArrayList<Integer>();
    }
}
