package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class Dealing {
	
	private Deck deck = new Deck();

		

	public static void main(String[] args) {
		Dealing d = new Dealing();
//		d.deck.getCards();
		System.out.println(d.deck.checkDeckSize());
		d.deck.dealCard();
		System.out.println(d.deck.checkDeckSize());
	}
		
	public static void numberOfCards() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of cards you would like : ");
		int amount = input.nextInt();
//		dealCards(amount);
	}
	public void dealCards(int amount) {
		ArrayList<Card> hands = new ArrayList<>();
//		Card[] hand = new Card[amount];
		
		for(int i = 0; i< amount; i++) {
		}
		}
	}



