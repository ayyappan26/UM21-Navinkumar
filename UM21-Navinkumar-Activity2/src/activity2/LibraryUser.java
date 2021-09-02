package activity2;

interface LibraryUser{
	void registerAccount();
	void requestBook();
}
class KidUser implements LibraryUser{
	int age;
	String book;
	public void registerAccount(){
		if (age<12){
			System.out.println("You have successfully registered under a Kids Account");
		}
		if (age>12){
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	public void requestBook(){
		if(book=="kids"){
			System.out.println("Book issued successfully, please return the book within 10 days");
		}
		else{
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
}
class AdultUser implements LibraryUser{
	int age;
	String book;
	public void registerAccount(){
		if (age>12){
			System.out.println("You have successfully registered under an Adult Account");
		}
		if (age<12){
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
		
	}
	public void requestBook(){
		if(book=="fiction"){
		System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else{
			System.out.println("Oops, you are allowed to take only adult fiction book");
		}
	}
}