package SimpleFactory;

public class AFactory extends Factory {
	public Character CreateCharacter() {
	 return new Archer();
	}
}
