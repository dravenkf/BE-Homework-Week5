package week05;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***" + "\n");
	}

	@Override
	public void error(String error) {
		String decAsterisks = "*************";
		for (int i = 0; i < error.length(); i++) {
			decAsterisks += "*";
		}
		System.out.println(decAsterisks);
		System.out.println("***Error: " + error + "***");
		System.out.println(decAsterisks + "\n");
		
	}
	
}
