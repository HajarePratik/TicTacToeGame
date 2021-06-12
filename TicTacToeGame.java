package com.bridgelabz.tictactoe;

import java.util.Scanner;

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
	
	// creating a Method for giving value to the computer
	public char choosesymbol(char player)
	{
		char computer = ' ';
		if(player == 'X')
		{
			computer = 'O';
		}
		else if(player == 'O')
		{
			computer = 'X';
		}
		return computer;
	}
	public static void main(String[] args) {
	
		System.out.println("Welcome To The Tic Tac Toe Game");
		
		// creating a Object for Class.
		TicTacToeGame T = new TicTacToeGame();
		T.createboard();						// calling createboard method. 
		System.out.println("Board Is Initallized");
		
		Scanner sc = new Scanner(System.in);   // take input from the user
		System.out.println("Enter a Symbol X or O :");
		char player = sc.next().charAt(0);		// getting a value from the user
		char computer = T.choosesymbol(player); // getting a value from method
		System.out.println("Player Symbol is :" +player);  // displaying a symbols
		System.out.println("Computer Symbol is :" +computer);
	}

}
