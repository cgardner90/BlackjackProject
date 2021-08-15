package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;

public abstract class Hand {

	public ArrayList<Card> cards;
	protected int value;

	public Hand() {
		this.cards = new ArrayList<Card>();
	}

	public void clear() {

	}

		public int handValue() {
			return value;
			
	}

	public abstract void addCard(Card card);

	@Override
	public String toString() {
		return "Hand [cards=" + cards + ", value=" + value + "]";
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public ArrayList<Card> getHand() {
		return cards;

	}


	public void setValue(int value) {
		this.value = value;
	}

}