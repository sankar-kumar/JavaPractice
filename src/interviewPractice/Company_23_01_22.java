package interviewPractice;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class Company_23_01_22 {
        public static int elementFrequency(int N, int M, int A[]) {
            
                //this is default OUTPUT. You can change it.
                int result=0;
                
                //write your Logic here:
                List<Integer> b=new ArrayList<>();
                
                for(int i=1;i<A.length;i++){
                        int count=0;

                        if(A[i-1]==A[i]){
                                count++;
                        }else{
                                count=1;
                        }

                        b.add(count);
                }

                for(int j=0;j<b.size();j++){
                        if(b.get(j)!=M){
                                result=result+b.get(j);
                        }
                       
                }
                
                
                
                return result;
        }
        public static void main(String[] args) {
                // INPUT [uncomment & modify if required]
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int M = sc.nextInt();
                int A [] = new int[N];
                for(int i=0; i<N; i++) {
                                A[i] = sc.nextInt();
                }
                
                // OUTPUT [uncomment & modify if required]
                System.out.print(elementFrequency(N, M, A));
                sc.close();
        }
}
