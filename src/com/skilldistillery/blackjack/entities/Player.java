package com.skilldistillery.blackjack.entities;

public abstract class Player {

	private Hand hand;
	protected String name;

	public Player(String name) {
		this.name = name;
	}
	public abstract void addCard(Card card);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [hand=" + getHand() + ", name=" + name + "]";
	}

	public Hand getHand() {
		return hand;
	}



}
