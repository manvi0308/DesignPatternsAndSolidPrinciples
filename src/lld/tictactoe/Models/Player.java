package lld.tictactoe.Models;

public class Player {
	int id;
	String name;
	PlayingPiece pp;

	public Player(int id, String name, PlayingPiece pp) {
		this.id = id;
		this.name = name;
		this.pp = pp;
	}
}
