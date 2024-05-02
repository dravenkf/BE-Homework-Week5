package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		List<String> names = Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");	
		List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		
		for (String suit : suits) {
			for (int i = 0; i < 13; i++) {
				Card card = new Card(names.get(i), suit, values.get(i));
				cards.add(card);
			}
		}	
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describeSimple();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	public int size() {
		return 52;
	}
	
	public Card draw() {
		Card card = cards.get(0);
		cards.remove(0);
		return card;
	}
	
}

