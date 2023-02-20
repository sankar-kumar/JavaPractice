package interviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class NokiaQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> input = new HashMap<String, String>();
		input.put("SSID.1.1.1", "2.4G Main");
		input.put("SSID.1.2.1", "5G Main");
		input.put("SSID.5.1.1", "2.4G Main");
		input.put("SSID.5.2.1", "5G Main");
		input.put("BSSID.1.1.1", "b0,00,00,00,00,02");
		input.put("BSSID.1.2.1", "b0,00,00,00,00,03");
		input.put("BSSID.5.1.1", "b5,00,00,00,00,01");
		input.put("BSSID.5.2.1", "b5,00,00,00,00,02");
		input.put("OperatingChannel.1.1.1", "6");
		input.put("OperatingChannel.1.2.1", "52");
		input.put("OperatingChannel.5.1.1", "6");
		input.put("OperatingChannel.5.2.1", "52");
		
		List<String> inpStr=Arrays.asList("SSID","BSSID","Operation","Operation","BSSID","");

		System.out.println(input.keySet().stream()
				.filter(key -> key.startsWith("SSID") || key.startsWith("BSSID") || key.startsWith("OperatingChannel"))
				.distinct().toList());
		
	}

}
