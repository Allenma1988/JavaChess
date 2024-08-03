
public class Piece {
	protected Position position;
	protected PieceColor color;
	
	public Piece(Position postion, PieceColor color) {
		this.color=color;
		this.position=position;
	}
	
	public PieceColor getColor() {
		return color;
	}
	
	public Position getPosition() {
		return position;
	}

	public setPosition(Position position) {
		this.position=position;
	}
	
	public abstract boolean isValidMove(Position newPosition, Piece[][] board);
	
	
}

