package assignment.string;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer stringBuf=new StringBuffer("This is StringBuffer");
		stringBuf.append(" This is a sample program");
		System.out.println(stringBuf);
		StringBuffer l=stringBuf.insert(21, "Object");
		System.out.println(l);
		stringBuf.reverse();
		System.out.println(stringBuf);
		StringBuffer newBuf=new StringBuffer("This is StringBuffer");
		
		newBuf.replace(14, 21, "Builder");
		System.out.println(newBuf);

	}

}
