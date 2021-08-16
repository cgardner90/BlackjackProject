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
		if (!checkForBlackJack()) {
			displayHand();
		}
		if (checkForBlackJack()) {
			playAgain();
		}
	}

	public boolean checkForBlackJack() {
		boolean blackjack = false;
		for (Player p : players) {
			if (p.getHand().handValue() == 21) {

				System.out.println("Well that was fast!");
				blackjack = true;
				break;

			}
		else if (p.getHand().handValue() != 21) {
		}	
		}
		return blackjack;
	}

	public void displayHand() {
		System.out.println("   *** The cards have been dealt, your hand is:  \n");
		System.out.println(players.get(0).getHand());
		System.out.print("\n\tThe dealer is showing the : ");
		System.out.println(players.get(1).getHand().getCards().get(0));
		int value = players.get(0).getHand().handValue();
		if (value <= 16) {
			System.out.println("\nYou go first, would you like to hit or stay\n***NOTE: Typically, with your score of "
					+ value + " it is\nrecommended that you hit\n");
		}
		if (value >= 17) {
			System.out.println("\nYou go first, would you like to hit or stay\n***NOTE: Typically with your score of "
					+ value + " it is\nrecommended that you stay");
		}
		hitOrStay();
	}

	public void hitOrStay() {
		boolean busted = false;
		int response;
		do {
			System.out.println("CHOOSE:\n1. HIT\n2.STAY");
			response = input.nextInt();

			switch (response) {
			case 1:
				players.get(0).addCard(deck.dealCard());
				System.out.println("Your hand is now: \n");
				System.out.println(players.get(0).getHand());
				if (players.get(0).getHand().handValue() > 21) {
					System.out.println("You BUSTED! Sorry, play another hand.");
					busted = true;
					response = 2;
				}
				break;
			case 2:
				break;

			}

		} while (response != 2);
		if (!busted) {
			dealerTurn();
		}
		if (busted) {
			playAgain();
		}

	}

	public void dealerTurn() {
		boolean busted = false;
		int value = players.get(1).getHand().handValue();
		System.out.println("The dealers hand: \n");
		System.out.println(players.get(1).getHand());
		if (value < 17) {
			while (value < 17) {
				System.out.println("\nThe dealer hits...\n");

				players.get(1).addCard(deck.dealCard());
				System.out.println("\nDealer hand is now: ");
				System.out.println(players.get(1).getHand());

				value = players.get(1).getHand().handValue();
			}

		}
		if (value > 21) {
			System.out.println("Dealer BUSTS!!");
			busted = true;

		}
		if (value <= 21) {
			System.out.println("Dealer stays.");

		}
		if (busted) {
			System.out.println("CONGRATULATIONS! YOU WIN!");
			playAgain();
		} else {
			compareHands();
		}
	}

	public void compareHands() {
		Player p = players.get(0);
		Player d = players.get(1);

		boolean b = p.getHand().handValue() > d.getHand().handValue();
		if (b) {
			System.out.println("You have won!! CONGRATULATIONS");
		} else {
			System.out.println("OH NO! You Lost!! See you next time");
		}

		playAgain();
	}

	public void playAgain() {
		System.out.println("\n\tThank you for playing our BlackJack App!");
		System.out.println("\tIf you would like to play again, simply type a 1 into the console. ");
		int choice = input.nextInt();
		if (choice == 1) {
			run();
		} else {
			System.out.println("GOOD BYE");
		}

	}
}
