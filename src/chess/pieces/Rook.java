package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//above
				p.setValues(position.getRows() - 1, position.getColumn());
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRows()][p.getColumn()] = true;
					p.setRows(p.getRows()-1);
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRows()][p.getColumn()] = true;
				}
		
		//left
				p.setValues(position.getRows(), position.getColumn()-1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRows()][p.getColumn()] = true;
					p.setColumn(p.getColumn()-1);
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRows()][p.getColumn()] = true;
				}
		
		//right
				p.setValues(position.getRows(), position.getColumn()+1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRows()][p.getColumn()] = true;
					p.setColumn(p.getColumn()+1);
				}
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRows()][p.getColumn()] = true;
				}
				

				//below
						p.setValues(position.getRows() + 1, position.getColumn());
						while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
							mat[p.getRows()][p.getColumn()] = true;
							p.setRows(p.getRows()+1);
						}
						if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
							mat[p.getRows()][p.getColumn()] = true;
						}
				
		return mat;
	}

}
