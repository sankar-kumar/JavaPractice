package interviewPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinimumChange {

    public static int minChanges(int[] a,int k){
        Arrays.sort(a);
        
        int count=1;
        for(int y=1;y<a.length;y++) {
        	if(a[y-1]<a[y]) {
        		count++;
        	}
        }
        int result;
        result=k-count;
		return result;
		/*
		 * 
		 * // Store the frequency of each element Integer [] freq = new Integer[MAX];
		 * Arrays.fill(freq, 0); int p = 0; freq[p] = 1;
		 * 
		 * // Store the frequency of elements for (int i = 1; i < a.length; i++) { if
		 * (a[i] == a[i - 1]) ++freq[p]; else ++freq[++p]; }
		 * 
		 * // Sort frequencies in descending order Arrays.sort(freq,
		 * Collections.reverseOrder());
		 * 
		 * // To store the required answer int ans = 0; for (int i = k; i <= p; i++) ans
		 * += freq[i];
		 * 
		 * // Return the required answer return ans;
		 */    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int k;
        k=scan.nextInt();
        int[] a = new int[n];
        for(int j=0;j<n;j++){
            a[j]=scan.nextInt();
        }
        int result;
        result = minChanges(a,k);
        System.out.print(result);
        return ;
    }

	
}
