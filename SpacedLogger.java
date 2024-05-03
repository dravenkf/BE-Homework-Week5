package week05;

public class SpacedLogger implements Logger{
	
	public SpacedLogger () {
	}
	
	@Override
	public void log(String log) {
		System.out.println(spacer(log) + "\n");
	}

	@Override
	public void error(String error) {
		System.out.println("ERROR: " + spacer(error) + "\n");
	}
	
	private String spacer(String string) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			str.append(string.charAt(i) + " ");
		}
		
		return str.toString();
		
	}
}
