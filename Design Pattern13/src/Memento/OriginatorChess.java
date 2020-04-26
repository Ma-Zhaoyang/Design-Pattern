package Memento;

public class OriginatorChess {
	private MementoChess memchess;

	public OriginatorChess(MementoChess memchess) {
		// TODO Auto-generated constructor stub
		this.memchess = memchess;
	}
	
	public void SetX(int x) {
		// TODO Auto-generated method stub
		memchess.setX(x);
	}
	public void SetY(int y) {
		// TODO Auto-generated method stub
		memchess.setY(y);
	}
	public MementoChess SavetoMemento() {
		return new MementoChess(memchess.getLabel(),memchess.getX(),memchess.getY());
		
	}
	public void Restore(MementoChess mem) {
		this.memchess.setLabel(mem.getLabel());
		this.memchess.setX(mem.getX());
		this.memchess.setY(mem.getY());
	}
	public void Show() 
	{
		System.out.println("µ±Ç°Æå×Ó×´Ì¬£º" + memchess.getLabel());
	}
}
