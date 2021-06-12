package com.bridgelabz.tictactoe;

public class TicTacToeGame 
{

	char [] board = new char[10];		// declearing a char array
	
	// declearing a Method get size of board and assigned value is empty 
	public void createboard()
	{
		for(int i=1; i<board.length;i++)
		{
			board[i] = ' ';
		}
	}
	public static void main(String[] args) {
	
		System.out.println("Welcome To The Tic Tac Toe Game");
		
		// creating a Object for Class.
		TicTacToeGame T = new TicTacToeGame();
		T.createboard();						// calling createboard method. 
		System.out.println("Board Is Initallized");
	}

}
