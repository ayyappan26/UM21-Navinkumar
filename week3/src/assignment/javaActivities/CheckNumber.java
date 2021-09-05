package assignment.javaActivities;

import java.util.Scanner;

class CheckWork
{
	public boolean check(int num) {
		int large = 9;
		while (num > 0) {
			int remainder = num % 10;
			if (remainder > large) {
				return false;
			} else {
				large = remainder;
			}
			num /= 10;
		}
		return true;
	}
}
public class CheckNumber {
	private static Scanner scan;

	public static void main(String arg[]){
		CheckWork check=new CheckWork();
		scan = new Scanner(System.in);
		System.out.println("Enter the number  :");
		int num=scan.nextInt();
		if(check.check(num)){
			System.out.println("Entered number is increasing number");
		}
		else{
			System.out.println("Not a increasing number");
		}
		
		
	}

}
