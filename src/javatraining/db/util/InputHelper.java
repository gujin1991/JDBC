package javatraining.db.util;
import java.io.*; 

public class InputHelper {
	public static String getInput(String prompt) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		
		try {
			return bf.readLine();
		} catch (IOException e) {
			return ("Error: " + e.getMessage());
		}
	}
	
	public static double getDoubleInput(String prompt) throws NumberFormatException {
		String input = getInput(prompt);
		return Double.parseDouble(input);

	}

	public static int getIntegerInput(String prompt) throws NumberFormatException {
		String input = getInput(prompt);
		return Integer.parseInt(input);	
	}

}
