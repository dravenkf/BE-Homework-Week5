package week05;

public class App {

	public static void main(String[] args) {

		AsteriskLogger asteriskWord = new AsteriskLogger();
		asteriskWord.log("Floccinaucinihilipilification");
		
		asteriskWord.error("Floccinaucinihilipilification");
		
		SpacedLogger spacedWord = new SpacedLogger();
		spacedWord.log("Supercalifragilisticexpialidocious");
		
		spacedWord.error("Supercalifragilisticexpialidocious");
		
	}

}
