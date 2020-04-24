package Iterator;

public interface TVIterator {

	void setChannel(int i);
	void next();
	void presious();
	boolean isLast();
	Object currentChannel();
	boolean isFirst();
}
