package com.tictactoe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Player p1 = new Player();
		System.out.println("Enter Player 1's name : ");
		p1.setName(scanner.nextLine());
		System.out.println("Enter Player 1's symbol : ");
		p1.setSymbol(scanner.nextLine().charAt(0));

		System.out.println();

		Player p2 = new Player();
		System.out.println("Enter Player 2's name : ");
		p2.setName(scanner.nextLine());
		System.out.println("Enter Player 2's symbol : ");
		p2.setSymbol(scanner.nextLine().charAt(0));

		Board board = new Board(3);

		Game game = new Game(new Player[] { p1, p2 }, board);

		game.play();
		scanner.close();
	}
}
