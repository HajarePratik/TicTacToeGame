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
	
	// taking a Input from User with the Ternary Operator
	public static char chooseUserLetter(Scanner userInput)
	{
		System.out.print("Choose You Letter :");
		return userInput.next().toUpperCase().charAt(0);
		
	}
	
	// show empty board
	public void showboard()
	{
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}
	public static void main(String[] args) {
	
		System.out.println("Welcome To The Tic Tac Toe Game");
		
		// creating a Object for Class.
		TicTacToeGame T = new TicTacToeGame();
		T.createboard();	// calling createboard method.
		
		System.out.println("Board Is Initallized");
		
		Scanner sc = new Scanner(System.in);   // take input from the user
		// calling method checking what is the user input 
		char userLetter = chooseUserLetter(sc);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
		
		System.out.println("Player Symbol is :" +userLetter);  // displaying a symbols
		System.out.println("Computer Symbol is :" +computerLetter);
		
		T.showboard(); // calling showboard method
	}

}
