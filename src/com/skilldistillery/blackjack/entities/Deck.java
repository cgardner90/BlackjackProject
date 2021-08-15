package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	
	public Deck() {
		this.cards = buildDeck();
		}
	
	
	public ArrayList<Card> buildDeck(){
		ArrayList<Card> cards = new ArrayList<>();
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for(Suit s : suits) {
			for(Rank rank: ranks) {
			Card card = new Card(s, rank);
			cards.add(card);
			}
			}
		return cards;
			
		}
	
	public int checkDeckSize() {
		return this.cards.size();
	}
	
	public void getCards() {
		for(Card c: cards) {
			System.out.println(c.toString());
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card dealCard() {
		return cards.remove(0);
		}
	
	
		}	
	

