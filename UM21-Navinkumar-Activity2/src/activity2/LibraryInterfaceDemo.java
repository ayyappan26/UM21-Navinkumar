package activity2;

public class LibraryInterfaceDemo{
	public static void main(String arg[]){
		KidUser kid=new KidUser();
		kid.age=10;
		kid.registerAccount();
		kid.age=18;
		kid.registerAccount();
		kid.book="kids";
		kid.requestBook();
		kid.book="fiction";
		kid.requestBook();
		AdultUser adult=new AdultUser();
		adult.age=5;
		adult.registerAccount();
		adult.age=23;
		adult.registerAccount();
		adult.book="kids";
		adult.requestBook();
		adult.book="fiction";
		adult.requestBook();
		
		
	}
}