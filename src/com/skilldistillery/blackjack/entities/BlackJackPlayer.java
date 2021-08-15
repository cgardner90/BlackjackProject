package com.skilldistillery.blackjack.entities;

public class BlackJackPlayer extends Player {
	BlackJackHand cards = new BlackJackHand();

	public BlackJackPlayer(String name) {
		super(name);

	}

	@Override
	public void addCard(Card card) {

		cards.addCard(card);

	}
	@Override
	public BlackJackHand getHand() {
		return cards;
	}
	@Override
	public String toString() {
		return "BlackJackPlayer [Name : " + name + " cards : " + cards + "]";
	}
	
	public void setHand(BlackJackHand hand) {
		this.cards = hand;
	}
}
