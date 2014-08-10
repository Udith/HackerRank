/*ACCEPTED SOLUTION*/
package Search.Pairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] subS = line.split(" ");

		int n = Integer.parseInt(subS[0]);
		int k = Integer.parseInt(subS[1]);

		line = br.readLine();
		subS = line.split(" ");

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(subS[i]);
		}

		int count = nPairs(n, k, numbers);
		System.out.println(count);
	}

	private static int nPairs(int n, int k, int[] nums) {

		Arrays.sort(nums);

		int count = 0;
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (index >= n) {
				break;
			}
			int temp = nums[i] + k;

			for (int j = index; j < n; j++) {
				int temp2 = nums[j];

				if (temp2 == temp) {
					count++;
					index = j + 1;
					break;
				} else if (temp2 > temp) {
					index = j;
					break;
				}

				if (j == (n - 1)) {
					index = j + 1;
					break;
				}
			}
		}
		return count;
	}
}
