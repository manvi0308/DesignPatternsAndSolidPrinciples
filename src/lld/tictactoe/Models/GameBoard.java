package lld.tictactoe.Models;
import java.util.*;
class Pair{
	int row;
	int col;
	Pair(int row, int col){
		this.row = row;
		this.col = col;
	}
}
public class GameBoard {
	int N;
	public PlayingPiece board[][];
	public GameBoard(int N) {
		this.N = N;
		board = new PlayingPiece[N][N];
	}
	
	public void printBoard() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(board[i][j] + "     ");
			}
			
			System.out.println();
		}
	}
	
	public void addPiece(int row, int col, PlayingPiece pp) {
		if(board[row][col] != null) {
			System.out.println("Cell is already occupied");
			return;
		}
		else {
			board[row][col] = pp;
		}
	}
	public List<Pair> getFreeCells() {
		// return all the empty cells from the board
		List<Pair> allEmptyCells = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(board[i][j] == null) {
					allEmptyCells.add(new Pair(i, j));
				}
			}
		}
		
		return allEmptyCells;
	}
}
