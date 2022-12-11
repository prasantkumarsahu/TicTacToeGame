package com.tictactoe;

public class Board {
	int size;
	char[][] board;

	public Board(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		board = new char[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = '-';
			}
		}
	}
}
