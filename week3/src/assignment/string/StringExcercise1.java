package assignment.string;

public class StringExcercise1 {
	public static void main(String[] args) {
		String str="Welcome to Java World";
		char c=str.charAt(5);
		System.out.println("Character at 5th position  :  "+c);
		boolean equal=str.equalsIgnoreCase("Welcome");
		System.out.println(equal);
		String ad=" Let us learn";
		String con=str+ad;
		System.out.println(con);
		System.out.println(str.indexOf("a"));
		String rep=str.replaceAll("a","e");
		System.out.println(rep);
		System.out.println(str.substring(4,10));
		System.out.println(str.toLowerCase());
	}

}
