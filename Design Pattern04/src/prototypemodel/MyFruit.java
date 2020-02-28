package prototypemodel;

public class MyFruit implements Cloneable{
    public String kind;
    
    public Object clone() {
    	Object obj = null;
    	try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return obj;
    }
    public void display() {
		System.out.println(kind);
	}
}
