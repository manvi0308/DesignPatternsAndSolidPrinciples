package lld.tictactoe;
import java.util.*;

import lld.tictactoe.Models.GameBoard;
import lld.tictactoe.Models.Player;
import lld.tictactoe.Models.PlayingPieceX;
import lld.tictactoe.Models.PlayingPieceO;


public class TicTacToeGame {
	Deque<Player> players;
	GameBoard gameBoard;
	
	public void initializeGame() {
		// 2 players and their pieces
		players = new LinkedList<>();
		PlayingPieceX crossPiece = new PlayingPieceX();
		Player player1 = new Player(1, "Player 1", crossPiece);
		
		PlayingPieceO knoughtPiece = new PlayingPieceO();
		Player player2 = new Player(2, "Player 2", knoughtPiece);
		
		players.add(player1);
		players.add(player2);
		
		gameBoard = new GameBoard(3);
		
		
		
	}
	
}
