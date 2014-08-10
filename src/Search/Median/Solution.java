package Search.Median;

import java.util.*;

class Solution {
    /* Head ends here*/

    static void median(String a[], int x[]) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            String cmd = a[i];
            int num = x[i];

            if (cmd.equals("a")) {
                int pos = getPosition(num, result);
                if (pos >= result.size()) {
                    result.add(num);
                } else {
                    result.add(pos, num);
                }
                System.out.println(getMedian(result));
            } else {
                int pos = result.indexOf(x[i]);
                if (pos == -1) {
                    System.out.println("Wrong!");
                    continue;
                }
                result.remove(pos);

                if (result.isEmpty()) {
                    System.out.println("Wrong!");
                    continue;
                }
                System.out.println(getMedian(result));
            }
        }

    }

    static String getMedian(ArrayList<Integer> arr) {
        int n = arr.size();
        String ret = "";

        if (n % 2 == 0) {
            float sum = arr.get(n / 2) + arr.get(n / 2 - 1);
            if (sum % 2 == 0) {
                int r = (int) sum / 2;
                ret = "" + r;
            } else {
                ret = "" + sum / 2;
            }
        } else {
            ret = arr.get(n / 2).toString();
        }
        return ret;
    }

    static int getPosition(int x, ArrayList<Integer> arr) {
        int pos = Collections.binarySearch(arr, x, null);
        return Math.abs(pos);
    }

    /* Tail starts here*/
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int N;
        N = in.nextInt();

        String s[] = new String[N];
        int x[] = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = in.next();
            x[i] = in.nextInt();
        }

        median(s, x);
    }
}
