package week05;

public class Card {
	private String name;
	private String suit;
	private int value;
	
	public Card (String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe() {
		System.out.println("The card is the " + name + " of " + suit + ". It has a value of " + value + ".");
	}
	
	public void describeSimple() {
		System.out.println( name + " of " + suit);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
