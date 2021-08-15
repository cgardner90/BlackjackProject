package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {
	
	public BlackJackHand() {
	}
	


	public boolean isBlackJack() {
		if (this.handValue() == 21 ) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (this.handValue() > 21) {
			return true;
		}

		return false;

	}


	@Override
	public void addCard(Card card) {
		cards.add(card);
		value += card.getValue();
	}


	
	

}
