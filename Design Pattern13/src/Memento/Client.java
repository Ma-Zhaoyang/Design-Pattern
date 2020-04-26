package Memento;

public class Client {

	public static void main(String[] args) {
		OriginatorChess chess = new OriginatorChess(new MementoChess("ºÚ", 2, 2));
		play(chess);
		chess.SetX(3);
		play(chess);
		chess.SetY(6);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
	}
	private static int index = 0;
	private static CaretakerChess caretakerChess = new CaretakerChess();
	public static void play(OriginatorChess chess) {
		 index++;
		 caretakerChess.AddMem(chess.SavetoMemento());
		 chess.Show();
	}
	public static void undo(OriginatorChess originatorChess,int i) {
		System.out.println("»ÚÆå");
		index--;
		originatorChess.Restore(caretakerChess.getMem(index-1));
		originatorChess.Show();
	}
	public static void redo(OriginatorChess originatorChess,int i) {
		System.out.println("³·Ïú»ÚÆå");
		originatorChess.Restore(caretakerChess.getMem(index));
		index++;
		originatorChess.Show();
	}
}
