package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vcti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] intArray= {1,2,3,1,4,5,7,4,1,8,8,2,3,4,1,1};
		Arrays.sort(intArray);
		List<Integer> nonRepeated=new ArrayList<>();
		
		for(int i=1;i<intArray.length;i++) {
			//Her I have to identify the non repeated values.
			int count=0;
			if(intArray[i-1]==intArray[i]&&intArray[i]!=intArray[i+1]) {
				nonRepeated.add(intArray[i]);
			}
		}
		int greatestNo=0;
		for(int j=1;j<nonRepeated.size();j++) {
			if(nonRepeated.get(j-1)<nonRepeated.get(j)) {
				greatestNo=nonRepeated.get(j);
			}
		}
		
		System.out.println(greatestNo);
	}

}