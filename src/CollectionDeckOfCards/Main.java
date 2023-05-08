package CollectionDeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Card> cardList= Card.getStandardCardDeck();
		//Card.printCardDeck(cardList);
		Collections.shuffle(cardList);
		Card.printCardDeck(cardList);

		Collections.reverse(cardList);
		Card.printCardDeck(cardList);





	}
}
