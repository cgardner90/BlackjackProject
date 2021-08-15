package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackDealer;
import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.BlackJackPlayer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class Dealing {
	Scanner input = new Scanner(System.in);
	private ArrayList<Player> players;
	private Deck deck;

	public static void main(String[] args) {
		Dealing d = new Dealing();
		d.run();

	}

	public void run() {
		createGame();
		deal();
		checkForBlackJack();
//		System.out.println(players);
		}
	

	public void createGame() {
		deck = new Deck();
		deck.shuffle();
		players = new ArrayList<Player>();
		BlackJackPlayer player1 = new BlackJackPlayer("BOB");

		BlackJackDealer dealer = new BlackJackDealer("Dealin' Dave");
		players.add(player1);
		players.add(dealer);
	}

	public void deal() {
		for (Player p : players) {
			for (int i = 0; i < 2; i++) {
				p.addCard(deck.dealCard());
			}
		}
			
	}

	public void checkForBlackJack() {
	for (Player p : players) {
		BlackJackHand check = (BlackJackHand) p.getHand();
		
		if(check.isBlackJack()){
			System.out.println(p.getHand());
			System.out.println(p.getName() + " has Blackjack!");
		}
	}
	}
	public void 
	
	
	public static void numberOfCards() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of cards you would like : ");
		int amount = input.nextInt();
//		dealCards(amount);
	}

}
