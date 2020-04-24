package Iterator;

public class Client {

	public static void main(String[] args) {
		SkyworthTelevision tv = new SkyworthTelevision();
		display(tv);
	}
	
	public static void display(Television tv) {
		// TODO Auto-generated method stub
		TVIterator i = tv.createITerator();
		System.out.println("µÁ ”∆µµ¿£∫");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}
	}
}
