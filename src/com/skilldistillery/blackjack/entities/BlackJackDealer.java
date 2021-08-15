package com.skilldistillery.blackjack.entities;

public class BlackJackDealer extends Player {

	BlackJackHand cards = new BlackJackHand();

	public BlackJackDealer(String name) {
		super(name);
	}

	public boolean decisionTree() {
		if (this.cards.handValue() <= 16) {
			return true;
		} else
			return false;

	}

	@Override
	public String toString() {
		return "BlackJackDealer [cards=" + cards + "]";
	}

	@Override
	public void addCard(Card card) {

		cards.addCard(card);

	}

	public BlackJackHand getHand() {
		return cards;
	}

	public void setHand(BlackJackHand hand) {
		this.cards = hand;
	}

}
