package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
	
	public static void main(String[]args) {
		createDesc("01|sankar$02|siva$03|deva$04|haree");
	}
	
	public static List<Description> createDesc(String input){
		List<Description> finalList=new ArrayList<>();
//		String input = "01|sankar$02|siva$03|deva$04|haree";
		String[] first=  input.split("\\$");
		for(int i=0;i<first.length;i++) {
			String[] second=first[i].split("\\|");
			for(int j=0;j<second.length;j++) {
				Description desc= new Description();
				desc.setCd(second[j]);
				j++;
				desc.setDesc(second[j]);
				j++;
				desc.setValue(second[j]);
				finalList.add(desc);
			}
		}
		return finalList;
	}

}
