package CollectionDeckOfCards;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Card {
	public enum Suit{
		CLUB,DIAMOND,HEART,SPADE;
	}
	private Suit suit;
	private String face;
	private  int rank;



	public Card(Suit suit, String face, int rank) {
		this.suit = suit;
		this.face = face;
		this.rank = rank;
	}

	public static List<Card> getStandardCardDeck() {
		//create list of 52 cards
		//create empty list of 52 cards
		List<Card> cardList = new ArrayList<>(52);
		//first for loop to iterate suit
		for(Suit s: Suit.values()){
			for(int i=2;i<=10;i++){
				//logic to create 9 cards
				Card c = new Card(s,Integer.toString(i),i-2);
				cardList.add(c);

			}
			//plus logic to create remaining 4 cards of J K Q A
			char[] chars = new char[] {'J','K','Q','A'};
			for(int i=0;i<chars.length;i++){
				//logic to create 4 cards
				Card c = new Card(s,""+chars[i],i+9);
				cardList.add(c);
			}
		}


		//return list of 52 cards
		return cardList;
	}


	public static void printCardDeck(List<Card> cardList) {
		for(Card card : cardList){
			System.out.println(card);
		}

	}

	@Override
	public String toString(){
		return " " + this.suit.name() + " " + this.face + " "+ this.rank;
	}




}
